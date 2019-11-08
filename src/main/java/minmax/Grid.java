package minmax;

import java.util.ArrayList;
import java.util.Random;

/** Creates a randomized 10 x 10 grid of numbers.
 *
 * @author {Your Name Here}
 */
public class Grid {

  // TODO Create instance variable used to track numbers used in grid creation
  private int[][] grid = new int[10][10];
  private Random fill = new Random();
  
  /** Constructor.
   *
   */
   /*
    * TODO Create Constructor to traverse grid row by row, inserting random number 
    *      using seed()
    /*
  
  /** Generates a unique random number to put into a space in the puzzle.
   *
   */
  /*
   * TODO Create private method returning a random integer between 1-1000
   *      using a do...while loop to check if a number is used.
   */
   
  /** Checks if number has already been used.
   *
   * @param number Number to check
   */
  /*
   * TODO Create private method returning a boolean to check if a number
   *      exists in the used instance variable
   */
  
  /** Retrieves the completed grid array.
   *
   */
  public /* TODO Implement correct return type */ getGrid() {
    return this.grid;
  }
  
  /** Creates a String representation of the grid.
   *
   */
  public String toString() {
    String display = "\t";
    for (int i = 0; i < this.grid.length; i++) {
      display += "C" + (i + 1) + "\t";
    }
    display += "\n\n";
    for (int r = 0; r < this.grid.length; r++) {
      display += "R" + (r + 1) + "\t";
      for (int c = 0; c < this.grid[r].length; c++) {
        display += this.grid[r][c] + "\t";
      }
      display += "\n";
    }
    return display;
  }
}