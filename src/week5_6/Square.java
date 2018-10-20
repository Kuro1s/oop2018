package week5_6;

import java.util.Random;

/**
 * class hình vuông
 */
public class Square extends Rectangle {
    private int side;
    private ToaDo start = new ToaDo();
    private ToaDo SpeedXY = new ToaDo();

    /**
     * hàm khởi tạo
     */
    public Square(){
        Random rd = new Random();
        side = rd.nextInt(150);
        start.setX(rd.nextInt(150));
        start.setY(rd.nextInt(150));
        SpeedXY.setY(rd.nextInt(15));
        SpeedXY.setX(rd.nextInt(15));
    }

    @Override
    public void setStart(ToaDo start) {
        this.start = start;
    }
    public ToaDo getStart(){
        return this.start;
    }
    /**
     * tra về side
     * @return side đô dài cạnh
     */
    public int getSide() {
        return this.side;
    }

    /**
     * cai đật cạnh
     * @param side
     */
    public void setSide(int side) {
        this.side = side;
    }
    public void Update(){
        if(start.getX() > Diagram.getMainFrame().getWidth() - side - 15){
            SpeedXY.setX(-SpeedXY.getX());
        }
        if(start.getX() <= 0){
            SpeedXY.setX(-SpeedXY.getX());
        }
        if(start.getY() <= 0 ){
            SpeedXY.setY(-SpeedXY.getY());
        }
        if(start.getY() > Diagram.getMainFrame().getHeight() - side - 35){
            SpeedXY.setY(-SpeedXY.getY());
        }
        start.setX(start.getX()+SpeedXY.getX());
        start.setY(start.getY()+SpeedXY.getY());
    }
}