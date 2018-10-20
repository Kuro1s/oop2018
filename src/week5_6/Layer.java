package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * class hiển thị các đối tượng
 */
public class Layer extends JPanel {
    private List<Shape> arr  = new ArrayList<>();

    /**
     * hàm khỏi tạo
     */
    public Layer(){
        arr.add(0,new Circle());
        arr.add(1,new Rectangle());
        arr.add(2,new Square());
        arr.add(3,new Circle());
        arr.add(4,new Rectangle());
        arr.add(5,new Square());
        arr.add(6,new Circle());
        arr.add(7,new Rectangle());
        arr.add(8,new Square());
        Diagram.getMainFrame().add(this);
    }

    /**
     * hàm cóa các đôi tượng tam giác
     */
    public void Show(){
        int Load = 0;
        System.out.println("Số hình : " + arr.size());
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 0; i < arr.size() ; i++){
                arr.get(i).Update();
            }
            this.repaint();
            Load++;
            if(Load == 100){
                DeleteCircle();
                System.out.println("Số hình trong list sau khi xóa hình tròn: " + arr.size());
            }
        }
    }

    /**
     * xóa các hinh tam giac
     */
    public void DeleteTritangle(){
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) instanceof Tritangle){
                arr.remove(i);
                i--;
            }
        }
    }

    /**
     * xóa các hinh tron
     */
    public void DeleteCircle(){
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) instanceof Circle){
                arr.remove(i);
                i--;
            }
        }
    }
    /**
     * hàm vẽ các đối tượng
     * @param g
     */
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(new Color(0xE2CE99));
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Circle) {
                g.setColor(arr.get(i).getColor());
                int i1 = ((Circle) arr.get(i)).getRadius();
                g.fillOval(((Circle) arr.get(i)).getTam().getX(), ((Circle) arr.get(i)).getTam().getY(), i1, i1 );
            } else {
                if (arr.get(i) instanceof Rectangle) {
                    if (arr.get(i) instanceof Square) {
                        g.setColor(arr.get(i).getColor());
                        int s = ((Square) arr.get(i)).getSide();
                        g.fillRect(((Square) arr.get(i)).getStart().getX(), ((Square) arr.get(i)).getStart().getY(), s, s);
                    } else {
                        g.setColor(arr.get(i).getColor());
                        int w = ((Rectangle) arr.get(i)).getWidth();
                        int h = ((Rectangle) arr.get(i)).getLength();
                        g.fillRect(((Rectangle) arr.get(i)).getStart().getX(), ((Rectangle) arr.get(i)).getStart().getY(), w, h);
                    }
                }
            }
        }
    }

}