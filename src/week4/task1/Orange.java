package week4.task1;

/** class Orange kế thừa class Fruit
 *  ClassificationOfOranges : phân loại cam;
 */
public class Orange  extends  Fruit{
    private  String ClassificationOfOranges;
    public String getClassificationOfOranges() {
        return ClassificationOfOranges;
    }
    public void setClassificationOfOranges(String classificationOfOranges) {
        ClassificationOfOranges = classificationOfOranges;
    }
    public String fromWhere(String ClassificationOfOranges)
    {
        //TODO : hàm trả về nơi xuất xứ các loại cam
        if(ClassificationOfOranges.equals("CamSanh"))  return "Bac Giang";
        else if(ClassificationOfOranges.equals("CamThanhPhong")) return "Nam Dinh";
        else return "Lao Cai";
    }
}
