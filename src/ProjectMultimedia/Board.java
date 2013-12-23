package ProjectMultimedia;

import java.awt.*;
/**
 * The Board class models the ROWS-by-COLS game-board.
 */
public class Board {
   // package access
   Cell[][] cells; // composes of 2D array of ROWS-by-COLS Cell instances
 
   /** Constructor to initialize the game board */
   public Board() {
      cells = new Cell[XoPanel.ROWS][XoPanel.COLS]; // allocate the array
      for (int row = 0; row < XoPanel.ROWS; ++row) {
         for (int col = 0; col < XoPanel.COLS; ++col) {
            cells[row][col] = new Cell(row, col); // allocate element of array
         }
      }
   }
 
   /** Initialize (or re-initialize) the game board */
   public void init() {
      for (int row = 0; row < XoPanel.ROWS; ++row) {
         for (int col = 0; col < XoPanel.COLS; ++col) {
            cells[row][col].clear(); // clear the cell content
         }
      }
   }
 
   /** Return true if it is a draw (i.e., no more EMPTY cell) */
   public boolean isDraw() {
      for (int row = 0; row < XoPanel.ROWS; ++row) {
         for (int col = 0; col < XoPanel.COLS; ++col) {
            if (cells[row][col].content == Seed.EMPTY) {
               return false; // an empty seed found, not a draw, exit
            }
         }
      }
      return true; // no empty cell, it's a draw
   }
 
   /** Return true if the player with "seed" has won after placing at
       (seedRow, seedCol) */
   public boolean hasWon(Seed seed, int seedRow, int seedCol) {
      return (cells[seedRow][0].content == seed   // 3-in-the-row
                 && cells[seedRow][1].content == seed
                 && cells[seedRow][2].content == seed
             || cells[0][seedCol].content == seed // 3-in-the-column
                 && cells[1][seedCol].content == seed
                 && cells[2][seedCol].content == seed
             || seedRow == seedCol              // 3-in-the-diagonal
                 && cells[0][0].content == seed
                 && cells[1][1].content == seed
                 && cells[2][2].content == seed
             || seedRow + seedCol == 2          // 3-in-the-opposite-diagonal
                 && cells[0][2].content == seed
                 && cells[1][1].content == seed
                 && cells[2][0].content == seed);
   }
 
   /** Paint itself on the graphics canvas, given the Graphics context */
   public void paint(Graphics g) {
      // Draw the grid-lines
      g.setColor(Color.GRAY);
      for (int row = 1; row < XoPanel.ROWS; ++row) {
         g.fillRoundRect(0, XoPanel.CELL_SIZE * row - XoPanel.GRID_WIDHT_HALF,
               XoPanel.CANVAS_WIDTH - 1, XoPanel.GRID_WIDTH,
               XoPanel.GRID_WIDTH, XoPanel.GRID_WIDTH);
      }
      for (int col = 1; col < XoPanel.COLS; ++col) {
         g.fillRoundRect(XoPanel.CELL_SIZE * col - XoPanel.GRID_WIDHT_HALF, 0,
               XoPanel.GRID_WIDTH, XoPanel.CANVAS_HEIGHT - 1,
               XoPanel.GRID_WIDTH, XoPanel.GRID_WIDTH);
      }
 
      // Draw all the cells
      for (int row = 0; row < XoPanel.ROWS; ++row) {
         for (int col = 0; col < XoPanel.COLS; ++col) {
            cells[row][col].paint(g);  // ask the cell to paint itself
         }
      }
   }
}
