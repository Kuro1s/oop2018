package week4.task1;

/**
 * Class CamSanh kế thừa class Orange
 */
public class CamSanh extends  Orange{
    private String Place;
    private int countOfOneKg;

    public int getCountOfOneKg() {
        return countOfOneKg;
    }
    public double getPriceForm(){
        //TODO : hàm trả về giá thành trên 1 đơn vị cân nặng
        if(Place.equals("HaNoi"))   return 10000;
        else if(Place.equals("HoChiMinh"))  return 15000;
        return 20000;
    }
    public void setCountOfOneKg(int countOfOneKg) {
        this.countOfOneKg = countOfOneKg;
    }
    public String getPlace()
    {
        return Place;

    }
    public void setPlace(String place) {
        Place = place;
    }
}
