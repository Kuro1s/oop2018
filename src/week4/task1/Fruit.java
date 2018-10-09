package week4.task1;

/** Khởi tạo lớp Fruit với các thuộc tính giá, cân nặng, ngày nhập
 * Cost : giá 1 đơn vị Fruit
 * Weight : cân nặng 1 đơn vị Fruir
 * Date : ngày nhạpa
 */
public class Fruit {
    private int Cost;
    private int Weight;
    private String Date;
    public int totalCost()
    {
        //TODO: trả về tổng giá tiền cần trả = giá thành của 1 đơn vị Fruit * cân nặng của Fruit
        return Cost * Weight;
    }
    public void setDate(String date) {
        Date = date;
    }

    public String getDate() {
        return Date;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public int getCost() {
        return Cost;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
    public static void main(String Args[]){
        Orange orange = new Orange();
        Apple apple = new Apple();
        CamThanhPhong cam1 = new CamThanhPhong();
        CamSanh cam2 = new CamSanh();
        orange.setClassificationOfOranges("Cam Sanh");
        cam1.setPlace("HaNoi");
        System.out.println(cam1.getPlace());
        cam2.setPlace("HaNoi");
        System.out.println(cam2.getPriceForm());
    }
}
