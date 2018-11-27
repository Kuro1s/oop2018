package week12;

/**
 * Component (Thành phần):
 *
 * Khai báo interface hoặc abstract chung cho các thành phần đối tượng.
 * Chứa các method thao tác chung của các thành phần đối tượng.
 * Leaf (Lá):
 *
 * Biểu diễn các đối tượng lá (ko có con) trong thành phần đối tượng.
 * Composite (Hỗn hợp):
 *
 * Định nghĩa một thao tác cho các thành phần có thành phần con.
 * Lưu trữ thành phần con.
 * Thực thi sự quản lý các thành phần con của giao diện Component.
 */
public class Task1Item1 extends Task1Item{
    String name;
    String Sex;
    String DateOfBirth;
    int Children;
    boolean Married;
    Task1Item1(){}
    Task1Item1(String name, String Sex, String DateOfBirth, boolean Married, int Children)
    {
        this.name = name;
        this.Sex = Sex;
        this.DateOfBirth = DateOfBirth;
        this.Married = Married;
        this.Children = Children;
    }

    public int getChildren() {
        return Children;
    }

    @Override
    public int Children() {
        return Children;
    }

    public void setMarried(boolean married) {
        Married = married;
    }
    @Override
    public boolean isMarried() {
        return Married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public boolean isMarriedWith(Task1Item1 task1, Task1Item1 task2) {
        return false;
    }
}
