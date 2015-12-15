import javax.swing.JFrame;
public class WonderlandDriver
{
   public static void main(String[] args)
   {
   JFrame frame = new JFrame("Winter Wonderland");
   frame.setSize(800, 800);
   frame.setLocation(90, 90);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setContentPane(new WonderlandPanel());
   frame.setVisible(true);
   }
}