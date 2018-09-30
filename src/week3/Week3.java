package week3;

public class Week3 {
    /**
     * Chương trình tìm max 2 số nguyên
     * @param m là số thứ nhất
     * @param n là số thứ hai
     * @return max(m, n);
     */
    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        return Math.max(m, n);
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for(int st : array)
        {
            if(st < min) min = st;
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        String result="";
        double BMI = weight/(height * height);
        if(BMI < 18.5) result = "Thiếu cân";
        else if(BMI >= 18.5 && BMI < 25) result = "Bình thường";
        else if (BMI >= 25 && BMI < 30) result = "Thừa cân";
        else result = "Béo phì";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 6));
        System.out.println(calculateBMI(70,50));
        int[] array = {1,4,5,2,5,6,0,-1};
        System.out.println(minOfArray(array));
    }
}