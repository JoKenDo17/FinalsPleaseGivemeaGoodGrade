
/**
 * Write a description of class GridGame here.
 *
 * @author (your name)
 * @version (4.2.2)
 */

import java.util.Scanner;

public class GridGame
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    static String[][] buildBoard() {
        String[][] board = {{"2","4","6","8","12"}, {"12","24","39","48","60"}, {"1","2","4","6","16"}, {"50","35","30","20","10"}, {"10","5","20","15","40"}, };
        
        for (int i=0; i < 5; i++) {
            for (int j=0; j<5; j++) {
                board[i][j] = "0";
            }
        }
        return board;
    }
    
    static void printBoard(String[][] board) {
        for (int i =0; i<5; i++) {
            for (int j=0;j<5;j++) {
                System.out.print("   " + board[i][j] + "   ");
            }
        }
    }
    
    static String[][] changeBoard(String[][] board) {
        int number = 5;
        int iCount = 0;
        int jCount = 0;
        Scanner key = new Scanner(System.in);
        
        for (int i=0;i<number;i++) {
            for (int j=0;j<number;j++) {
                iCount = i+1;
                jCount = j+1;
                
                System.out.print("Input the value for the next string in position " + iCount + ", " + jCount + ":");
                board[iCount][jCount] = key.next();
            }
        }
        return board;
    }
    
    static String[][] changeBoardNumber(String[][] board, int x, int y) {
        Scanner key = new Scanner(System.in);
        
        System.out.print("State the value for the string that's in positon " + x + " " + y + ":");
        board[x][y] = key.next();
        return board;
    }
    public static void main(String[] args) {
        
        boolean playAgain = true;
        boolean fillASlot = true;
        
        int number = 5;
        String[] myStringArray = {"0","0","0","0","0"};
        
        int elementNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        do {
            clearScreen();
            
            System.out.println("There is an array with a place for five strings.");
            
            System.out.println("Here are the values inside of the array.");
            
            for (int i=0; i<number; i++) {
                int numberPlusOne = i + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[i] + ".");
            }
            System.out.print("Type true if you want to replace one or more elements inside the array.");
            fillASlot = myScanner.nextBoolean();
            
            while (fillASlot) {
                System.out.print("Which element number do you want to replace? Input a number between 1 and 5.");
                elementNumber = myScanner.nextInt();
                int printNumber = elementNumber + 1;
                
                System.out.print("Enter the replacement for the element " + elementNumber + ": ");
                myStringArray[elementNumber - 1] = myScanner.next();
                
                System.out.print("Type true if you want to replace one or more elements in the array.");
                fillASlot = myScanner.nextBoolean();
            }
            
            System.out.println("Here are the values in the array: ");
            
            for (int i=0; i<number; i++) {
                int numberPlusOne = i + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[i] + ".");
            }
            System.out.print("Are you sure you fixed the sequences of numbers? Type true or false: ");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);
    }
}