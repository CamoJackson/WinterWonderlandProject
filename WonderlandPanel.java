import javax.swing.*;
import java.awt.*;
import java.util.Random;
/*Jackson Borneman
This Draws a Chrismas card that is anamated and different from the last time it was run*/
public class WonderlandPanel extends JPanel
{
   final int N = 800;
   int a = 0;
   
   public void paintComponent(Graphics g)
   {
      g.setColor(new Color(216, 228, 240)); //sets Backround
      g.fillRect(0, 0, N, N);
     
      Random randomint = new Random(); //Creat Random Generator
      g.setColor(new Color(138, 175, 193)); //Set Snow Color
      for(int AmountOfSnow = 0; AmountOfSnow <= 3500; AmountOfSnow++) //Generates random Snow at Bottom of Image
      {
         g.fillOval(randomint.nextInt(N) /*Sets X to a number between 0 and 800 */, N - randomint.nextInt(100) /*Sets Y to a number beteen 700 and 800*/, randomint.nextInt(20) /*sets Size to beteen 0 and 20*/, randomint.nextInt(20)/*sets Size to beteen 0 and 20*/);
      }
      
      int xPoints[] = {310, 410, 510};
      int yPoints[] = {700, 650, 700};//Base of Tree
      g.setColor(new Color(112, 69, 51));
      g.fillPolygon(xPoints, yPoints, 3);
      
      g.fillRect(385, 150, 50, 550); //Tree Trunk
      
      g.setColor(new Color(39, 87, 10)); //Sets Tree Green
   
      for(int loopInt = 1; loopInt <= 7; loopInt ++)
      {
         int xPoints2[] = {350 - (40 * loopInt), 400, 480 + (40 * loopInt)}; //sets x list
         int yPoints2[] = {100 + (75 * loopInt), 50 + (30 * loopInt), 100 + (75 * loopInt)}; //sets y list
         g.fillPolygon(xPoints2, yPoints2, 3); //draws Triangls
      }
       
      for(int ornaments = 1; ornaments <= 11; ornaments++)
      {
         g.setColor(new Color(randomint.nextInt(256), randomint.nextInt(256), randomint.nextInt(256)));
      
         switch (ornaments){
            case 1:
               g.fillOval(380, 125, 30, 30);
               break;
            case 2:
               g.fillOval(460, 200, 30, 30); //Draws ornaments
               break;
            case 3:
               g.fillOval(300, 300, 30, 30);
               break;
            case 4:
               g.fillOval(400, 250, 30, 30);
               break;
            case 5:
               g.fillOval(450, 400, 30, 30);
               break;
            case 6:
               g.fillOval(200, 500, 30, 30);
               break;
            case 7:
               g.fillOval(600, 520, 30, 30);
               break;
            case 8:
               g.fillOval(500, 480, 30, 30);
               break;
            case 9:
               g.fillOval(400, 590, 30, 30);
               break;
            case 10:
               g.fillOval(320, 400, 30, 30);
               break;
            case 11:
               g.fillOval(300, 570, 30, 30);
               break;
         }
      }
      
      ImageIcon Star = new ImageIcon("Star.png");
      g.drawImage(Star.getImage(), 309, 0, 200, 150, null); //Draws Star
      
      /*int lineInterval = N / 10;
      g.setColor(Color.RED);
      for(int grid = 0; grid <= lineInterval; grid++)
      {
         g.drawLine(grid * 10, 0, grid * 10, N); // Generates Guide lines
      }   
      for(int grid = 0; grid <= lineInterval; grid++)
      {
         g.drawLine(0, grid * 10, N, grid * 10);
      }*/
      
      g.setColor(Color.WHITE);
      for(int Snow = 0; Snow <= 800; Snow++)
      g.fillOval(randomint.nextInt(N), randomint.nextInt(N-100), 5, 5); //Draws Snow
           
      if(a == 1){
         g.setColor(Color.RED.darker());
         g.setFont(new Font("Brush Script MT", Font.BOLD, 110));//Happy Holidays Text
         g.drawString("Happy", 40, 70);
         g.setColor(Color.GREEN.darker());
         g.drawString("Holidays!", 330, 70);
         a = a - 1;
      }
      else{
         g.setColor(Color.GREEN.darker());
         g.setFont(new Font("Brush Script MT", Font.BOLD, 110));//Happy Holidays Text
         g.drawString("Happy", 40, 70);
         g.setColor(Color.RED.darker());
         g.drawString("Holidays!", 330, 70);
         a = a + 1;
      }
      repaint();
   }
}