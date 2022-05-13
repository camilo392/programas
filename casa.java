import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class casa extends JApplet {

  public void paint (Graphics g) {
    g.drawRect(30,30,80,60);
    g.drawLine(30,30,70,10);
    g.drawLine(70,10,110,30);
    g.drawRect(40,40,60,10);
    g.drawLine(65,70,75,70);
    g.drawLine(65,70,65,90);
    g.drawLine(75,70,75,90);
    }
akava
  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    casa FigurasApplet = new casa();
    FigurasApplet.init();
    frame.getContentPane().add(FigurasApplet);
    frame.setSize(500,600);
    frame.setVisible(true);
  }
}
