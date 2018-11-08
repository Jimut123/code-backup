   import java.awt.*;
   import java.awt.Graphics.*;
   //import awt.Program;
    
    public class Tree extends GraphicsProgram {
        public void run() {
            drawTree(120, 200, 50, 90);
        }
   
      public void drawTree(double x0, double y0, double len, double angle) {
           if(len > 2) {
              double x1 = x0 + len * GMath.cosDegrees(angle);
               double y1 = y0 - len * GMath.sinDegrees(angle);
   
               add(new GLine(x0, y0, x1, y1));
              drawTree(x1, y1, len * 0.75, angle + 30);
              drawTree(x1, y1, len * 0.66, angle - 50);
         }
      }
   }