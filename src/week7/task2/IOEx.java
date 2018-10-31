package week7.task2;

import java.io.IOException;

public class IOEx {
    public static void main(String[] args) {
        IOEx ioEx = new IOEx();
        try {
            ioEx.throwEx();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void throwEx() throws IOException {
    }
}
