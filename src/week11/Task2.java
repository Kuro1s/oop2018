package week11;

import java.util.ArrayList;


/**
 * chương trình tìm max của các kiểu dữ liệu(trừ boolean)
 */
public class Task2 {
    static <T extends Comparable> T MaxOfArr(ArrayList<T> mylist){
        T max = mylist.get(0);
        for(int i = 1; i < mylist.size(); i++)
        {
            if(mylist.get(i).compareTo(max) > 0) max = mylist.get(i);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(10));
        list.add(new Integer(199));
        list.add(new Integer(1232));
        list.add(new Integer(112));
        list.add(new Integer(103213));
        list.add(new Integer(113190));

        Integer max = MaxOfArr(list);
        System.out.println("Max: " + max);
    }
}
