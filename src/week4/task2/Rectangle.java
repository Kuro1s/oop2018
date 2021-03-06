package week4.task2;

public class Rectangle extends  Shape {
    private double width;
    private double length;

    /**
     * hàm tạo mặc định. các thuộc tính mặc định giá trị 1.0
     */
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * hàm tạo có 2 tham số truyền vào
     * @param width chiều dài
     * @param length  chiều rộng
     */
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    /**
     * hàm tạo có 4 tham số truyền vào
     * @param width chiều dài
     * @param length chiều rộng
     * @param color màu sắc
     * @param filled thuộc tính filled
     */
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    /**
     * phương thức lấy giá trị chiếu dài
     *
     */
    public double getWidth() {
        return width;
    }

    /**
     * phương thức thay đổi giá trị chiều dài
     *
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * phương thức lấy giá trị chiều rộng
     *
     */
    public double getLength() {
        return length;
    }

    /**
     * phương thức thay đổi giá trị chiều rộng
     *
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * phương thức tính diện tích hình chữ nhật
     *
     */
    public double getArea(){
        return this.width * this.length;
    }

    /**
     * phương thức tính chu vi hình chữ nhật
     *
     */
    public double getPerimeter(){
        return (this.length + this.width)*2;
    }

    /**
     * ghi đè lại phương thức toString ở lớp cơ sở
     *
     */
    public String toString() {
        return "Rectangle";
    }
}
