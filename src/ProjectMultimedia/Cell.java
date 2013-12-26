package ProjectMultimedia;


import java.awt.*;
import javax.swing.ImageIcon;
/**
 * The Cell class models each individual cell of the game board.
 */
public class Cell {
   // Package access
   Seed content; // content of this cell (Seed.EMPTY, Seed.CROSS, or Seed.NOUGHT)
   int row, col; // row and column of this cell
 
   /** Constructor to initialize this cell with the specified row and col */
   public Cell(int row, int col) {
      this.row = row;
      this.col = col;
      clear(); // clear content
   }
 
   /** Clear this cell's content to EMPTY */
   public void clear() {
      content = Seed.EMPTY;
   }
 
   /** Paint itself on the graphics canvas, given the Graphics context */
   public void paint(Graphics g) {
      // Use Graphics2D which allows us to set the pen's stroke
      Graphics2D g2d = (Graphics2D)g;
      // Draw the Seed if it is not empty
      int x1 = col * XoPanel.CELL_SIZE + XoPanel.CELL_PADDING;
      int y1 = row * XoPanel.CELL_SIZE + XoPanel.CELL_PADDING;
      int x2 = (col + 1) * XoPanel.CELL_SIZE - XoPanel.CELL_PADDING;
      int y2 = (row + 1) * XoPanel.CELL_SIZE - XoPanel.CELL_PADDING;
      int width = x2 - x1;
      int height = y2 - y1;
      Image minion1 = new ImageIcon("minion1.png").getImage();
      Image minion2 = new ImageIcon("minion2.png").getImage();
      Image click = new ImageIcon("click-me.png").getImage();
      if (content == Seed.CROSS) {
         g2d.drawImage(minion1, x1, y1, width, height, null);
      } else if (content == Seed.NOUGHT) {
         g2d.drawImage(minion2, x1, y1, width, height, null);
      }
      else
      {
        g2d.drawImage(click, x1, y1, width, height, null);  
      }
   }
}
