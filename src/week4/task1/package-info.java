/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 *
 * @author cuong
 * @version 0.1
 */
package week4.task1;

/** Khởi tạo class hoa quả với các thuộc tính Cost Date Origin
 * Cost : giá hoa quả
 * Date : ngày xuất bán
 * Origin : nguồn gốc hoa quả
 */
class HoaQua {
    protected String Cost;
    protected String Date;
    protected String Origin;

    public void setCost(String cost) {
        Cost = cost;
    }

    public String getCost() {
        return Cost;
    }

    public String getDate(String s) {
        return Date;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public void setDate(String date) {
        Date = date;
    }
}

/** Tạo Class Cam kế thừa class Hoa quả
 *  Classification : phân loại các lọa cam
 */
class Cam extends HoaQua {
    protected String ClassificationOfOrange;

    public String getClassification() {
        return ClassificationOfOrange;
    }

    public void setClassification(String classification) {
        ClassificationOfOrange = classification;
    }
}
/** Tạo Class Táo kế thừa class Hoa quả
 *  ClassificationOfApple : phân loại các lọa táo
 */
class Tao extends HoaQua {
    protected String ClassificationOfApple;

    public String getClassification() {
        return ClassificationOfApple;
    }

    public void setClassification(String classification) {
        ClassificationOfApple = classification;
    }
}

class CamSanh extends Cam {
    public static void main(String[] args) {
        CamSanh camsanh = new CamSanh();
        camsanh.setCost("30");
        camsanh.setDate("2");
        camsanh.setOrigin("China");
        camsanh.setClassification("Green and Orange");
        System.out.println(camsanh.getClassification());
    }
}

class CamThanPhong extends Cam {
    public static void main(String[] args) {
        CamThanPhong cam = new CamThanPhong();
        cam.setCost("30");
        cam.setDate("2");
        cam.setOrigin("China");
        cam.setClassification("Green");
        System.out.println(cam.getClassification());
    }
}
