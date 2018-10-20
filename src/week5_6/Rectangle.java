package week5_6;

import java.util.Random;

/**
 * class hình chữ nhật
 */
public class Rectangle extends Shape {
    private int width,length;
    private ToaDo start = new ToaDo();
    private ToaDo SpeedXY = new ToaDo();
    /**
     * hàm khởi tạo
     */
    public Rectangle(){
        Random rd = new Random();
        width = rd.nextInt(150);
        length = rd.nextInt(150);
        start.setX(rd.nextInt(150));
        start.setY(rd.nextInt(150));
        SpeedXY.setY(rd.nextInt(15));
        SpeedXY.setX(rd.nextInt(15));
    }

    public void setStart(ToaDo start) {
        this.start = start;
    }

    public ToaDo getStart() {
        return start;
    }

    /**
     * đặt giá trị chiều rộng
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * đật giá trị chiều dai
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * trả về chiều rộng
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * trả về chiều dai
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     * hàm update
     */
    @Override
    public void Update() {
        if(start.getX() > Diagram.getMainFrame().getWidth() - width - 15){
            SpeedXY.setX(-SpeedXY.getX());
        }
        if(start.getX() <= 0){
            SpeedXY.setX(-SpeedXY.getX());
        }
        if(start.getY() <= 0 ){
            SpeedXY.setY(-SpeedXY.getY());
        }
        if(start.getY() > Diagram.getMainFrame().getHeight() - length -35){
            SpeedXY.setY(-SpeedXY.getY());
        }
        start.setX(start.getX()+SpeedXY.getX());
        start.setY(start.getY()+SpeedXY.getY());
    }


}