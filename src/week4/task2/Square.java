package week4.task2;

public class Square  extends  Rectangle{
    /**
     * hàm tạo không có tham số
     */
    public Square(){
        super();
    }

    /**
     * hàm tạo có 1 tham số
     *
     */
    public Square(double side){
        super(side,side);
    }

    /**
     * phương thức khởi tạo 3 tham số
     * @param side  độ dài 1 cạnh của hình vuông
     * @param color màu sắc
     * @param filled    thuộc tính filled
     */
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    /**
     * phương thức lấy giá trị cạnh hình vuông
     *
     */
    public double getSide(){
        return super.getWidth();
    }

    /**
     * phương thức thay đổi giá trị cạnh hình vuông
     *
     */
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * ghi đè lại phương thức setWidth ở lớp cơ sở
     *
     */
    public void setWidth(double side) {
        super.setWidth(side);
    }

    /**
     * ghi đè lại phương thức setLength ở lớp cơ sở
     *
     */
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    /**
     * ghi đè lại phương thức toString ở lớp cơ sở
     *
     */
    @Override
    public String toString() {
        return "Square";
    }
}
