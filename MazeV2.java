//made by Ngoc Nguyen


import java.util.*;
import java.io.*;

public class MazeV2 {

   public static char[][] myMaze = null;

   public static void main(String[] args) throws FileNotFoundException {

      myMaze = loadMaze(args[0]);
      System.out.println("Initial State:");
      displayArray(myMaze);

      int startpointX = 0;
      int startpointY = 0;
      for (int i = 0; i < myMaze.length; i++) {
        for (int j = 0; j < myMaze[i].length; j++) {
          if (myMaze[i][j] == 'S') {
            startpointX = i;
            startpointY = j;
          }
        }
      }

      if (exploreMyMaze(startpointX, startpointY, myMaze) == true) {
        System.out.println("Solution State:");
        displayArray(myMaze);
      }
      else {
        System.out.println("No solution!");
      }
    }



   public static char[][] loadMaze(String filename) throws FileNotFoundException {

       Scanner input = new Scanner(new File(filename));
       String[] rowcolArray = new String[2];
       int n = 0;
       for(int i=0;i<2;i++) {
         rowcolArray[n] = input.next();
         n++;
       }

       int row = Integer.parseInt(rowcolArray[0]);
       int col = Integer.parseInt(rowcolArray[1]);
       char[][] matrix = new char[row][col];
       for(int i=0;i<1;i++) {
         input.nextLine();
       }

       int rowIndex = 0;
       while (input.hasNextLine()) {
          String line = input.nextLine();
          int columnIndex = 0;
          Scanner readLine = new Scanner(line);
          while(readLine.hasNext()) {
            String current = readLine.next();
            char currentChar = current.charAt(0);
            matrix[rowIndex][columnIndex] = currentChar;
            columnIndex++;
          }
          rowIndex++;
       }
       return matrix;
   }


    public static void displayArray(char[][] myMaze) {
       drawLine();
       for (int i = 0; i < myMaze.length; i++) {
         for (int j = 0; j < myMaze[i].length; j++) {
              System.out.print("| " + myMaze[i][j] + " ");
         }
         System.out.println("|");
          drawLine();
       }
       System.out.println();
    }

    public static void drawLine() {
      for (int j = 0; j < 4 * myMaze[1].length; j++) {
          System.out.print("-");
       }
       System.out.println();
      }


    public static boolean exploreMyMaze(int x, int y, char[][] myMaze) {

      //base cases
      if (x > (myMaze.length - 1) || x < 0) {
        return false;
      }
      else if (y > (myMaze[x].length - 1) || y < 0) {
        return false;
      }
      else if (myMaze[x][y] == 'E') {
        return true;
      }
      else if (myMaze[x][y] == '0') {
        return false;
      }

      //recursive calls

      else if (myMaze[x][y] == 'S') {
        if (exploreMyMaze(x, y-1, myMaze) == true) { //North
          return true;
        }
        else if (exploreMyMaze(x+1, y, myMaze) == true) { //East
          return true;
        }
        else if (exploreMyMaze(x, y+1, myMaze) == true){ //South
          return true;
        }
        else if (exploreMyMaze(x-1, y, myMaze) == true) { //West
          return true;
        }
      return false;
      }


      else if (myMaze[x][y] == '1')   {
        myMaze[x][y] = '2';
        if (exploreMyMaze(x, y-1, myMaze) == true) { //North
          return true;
        }
        else if (exploreMyMaze(x+1, y, myMaze) == true) { //East
          return true;
        }
        else if (exploreMyMaze(x, y+1, myMaze) == true){ //South
          return true;
        }
        else if (exploreMyMaze(x-1, y, myMaze) == true) { //West
          return true;
        }
      myMaze[x][y] = '1';
      return false;
      }
  return false;
  }



}
