package week12;

import java.util.ArrayList;

/**
 * hàm main cho task1 week 12
 */
public class Task1 {
    static public boolean check(Task1Item1 name1, Task1Item1 name2)
    {
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Task1Item1> Task = new ArrayList<Task1Item1>();
        Task1Item1 person1 = new Task1Item1("John", "Male", "19/12/1989", true, 2);
        Task1Item1 person2 = new Task1Item1("David", "Male", "20/11/1970",true, 3 );
        Task1Item1 person4 = new Task1Item1("Cena", "Male", "12/1/1980", false, 0);
        Task1Item1 person5 = new Task1Item1("Beckham", "Male", "20/2/1987", false, 0);
        Task1Item1 person6 = new Task1Item1("Maria", "FeMale", "12/1/1990", false, 0);
        Task1Item1 person7 = new Task1Item1("Anna", "FeMale", "12/1/1983", true, 2);
        Task1Item1 person8 = new Task1Item1("Bella", "FeMale", "12/1/1998", true, 3);
        Task1Item1 person3 = new Task1Item1("Wick", "FeMale", "12/1/1997", false, 0);
        Task.add(person1);
        Task.add(person2);
        Task.add(person3);
        Task.add(person4);
        Task.add(person5);
        Task.add(person6);
        Task.add(person7);
        Task.add(person8);

        System.out.println("Single Person:");
        for(int i = 0; i < Task.size(); i++)
        {
            if(Task.get(i).isMarried() == false) System.out.println( Task.get(i).getName());
        }
        System.out.println("2 childs:");
        for(int i = 0; i < Task.size(); i++)
        {
            if(Task.get(i).Children() == 2) System.out.println(Task.get(i).getName());
        }
    }
}
