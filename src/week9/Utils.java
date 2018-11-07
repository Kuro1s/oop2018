package week9;

import java.io.*;

public class Utils {
    /**
     * phương thức đọc vào xâu ký tự từ file
     * @param path  đường dẫn tới thư mục chưa file cần đọc
     * @return   xâu ký tự là nội dung của file
     */
    public static String readContentFormFile(String path) {
        try {
            FileInputStream file = new FileInputStream(path);
            String str1 = "";
            int index = 0;
            while ((index = file.read()) != -1) {
                str1 += (char) index;
            }
            file.close();
            return str1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * phương thức ghi một xâu ký tự mới vào file, nếu file đó đã có nội dung thì ta xóa nội dung cũ đi vào thêm nội dung mới vào
     * @param path  đường dẫn tới file cần ghi nội dung
     * @param newContent  Nội dung muốn ghi vào file
     */
    public static void writeContentToFile(String path, String newContent) throws IOException{
        FileOutputStream fileOutput = new FileOutputStream(path);
        byte[] temp = newContent.getBytes();
        fileOutput.write(temp);
        fileOutput.close();
    }
    /**
     * phương thức ghi vào thêm vào file nội dung mới mà không xóa đi nội dung cũ
     * @param path  đường dẫn tới file cần ghi
     * @param newContent  một xâu kí tự chứa nội dung mới cần ghi
     */
    public static void addNewContentToFile(String path,String newContent){
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write("\n");
            fileWriter.write(newContent);
            fileWriter.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * phương thức tìm kiếm một file trong một thư mục
     * @param folderPath  đường dẫn của thư mục chưa file
     * @param fileName  tên của file cần tìm kiếm
     * @return  file cần tìm kiếm nếu có tồn tại hoăc null nếu nó không tồn tại
     */
    public static File findFileByName(String folderPath, String fileName)
    {
        File temp = new File(folderPath);
        String[] children = temp.list();
        String file = null;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(fileName)) file = folderPath;
        }
        if (file == null) return new File("");
        else {
            file = file + "\\" + fileName;
            File findedFile = new File(file);
            return findedFile;
        }
    }

    public static void main(String[] args) {
        try {
            String readFile = Utils.readContentFormFile("src/week9/Text.txt");
            System.out.println(readFile);
            String newaddContent = "Hi Hi Hi";
            Utils.writeContentToFile("src/week9/Text.txt", newaddContent);
            Utils.addNewContentToFile("src/week9/Text.txt","That's cú lừa!");
            File searchFile = Utils.findFileByName("src/week9/","Text.txt");
            if(searchFile!=null)    System.out.println("File có tồn tại");
            else System.out.println("File không tồn tại");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
