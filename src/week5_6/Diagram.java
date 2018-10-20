package week5_6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * class chúa cáu trúc
 */
public class Diagram {
    private static JFrame mainFrame = new JFrame("Week 5");
    /**
     * trả vè frame chính
     * @return
     */
    public static JFrame getMainFrame() {
        return mainFrame;
    }
    public void DeleteCirclẹ̣̣(){

    }
    public static void main(String[] args){
        List<Layer> list = new ArrayList<>();
        list.add(new Layer());
        mainFrame.setBounds(100,10,700,700);
        mainFrame.setVisible(true);
        list.get(0).Show();
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


}