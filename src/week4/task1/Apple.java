package week4.task1;

public class Apple extends Fruit{
        private  String ClassificationOfApple;
        public String getClassificationOfApple() {
            return ClassificationOfApple;
        }
        public void ClassificationOfApple(String ClassificationOfApple) {
            ClassificationOfApple = ClassificationOfApple;
        }
        public String FromWhere(String ClassificationOfApple)
        {
            //TODO : hàm trả về nơi xuất xứ các loại Táo
            if(ClassificationOfApple.equals("TaoMeo"))  return "Lang Son";
            else if(ClassificationOfApple.equals("TaoAmerica")) return "China";
            else return "Lao Cai";
        }
}
