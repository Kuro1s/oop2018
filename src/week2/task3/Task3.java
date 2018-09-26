package week2.task3;
public class Task3 {
    class IT{
        String Name;
        String Sex;
        int Age;
        public void Eat(){ System.out.println("EAT!");}
        public void Sleep(){System.out.println("SLEEP!");}
        public  void Code(){System.out.println("CODE!");}
        public String getName() {
            return Name;
        }

        public int getAge() {
            return Age;
        }
        public String getSex() {
            return Sex;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setAge(int age) {
            this.Age = age;
        }

        public void setSex(String sex) {
            Sex = sex;
        }
    }
    class Cat{
        String Name;
        String User;
        int Age;
        public void Eat(){ System.out.println("EAT!");}
        public void Sleep(){System.out.println("SLEEP!");}
        public void Mew(){System.out.println("SEN! MÀY ĐÂU?");}
        public void setAge(int age) {
            Age = age;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setUser(String user) {
            User = user;
        }

        public int getAge() {
            return Age;
        }

        public String getName() {
            return Name;
        }

        public String getUser() {
            return User;
        }
    }
    class MyGirlFriend{
        String Name;
        String Age;
        public void Angry(){System.out.println("Fuck!");}
        public boolean Appear()
        {
            return false;
        }
        public boolean DO_VO()
        {
            return true;
        }
        public String getName() {
            return Name;
        }

        public String getAge() {
            return Age;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setAge(String age) {
            Age = age;
        }
    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
