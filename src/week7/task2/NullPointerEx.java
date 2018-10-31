package week7.task2;

import java.util.ArrayList;

public class NullPointerEx {
    private ArrayList<Integer> arrayList;

    public static void main(String[] args) {
        NullPointerEx nullPointerEx = new NullPointerEx();
        try {
            nullPointerEx.Add(5);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }

    public void Add(int i) throws NullPointerException {
        arrayList.add(i);
    }
}
