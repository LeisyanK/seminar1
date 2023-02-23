package org.example.seminar2.cw2;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {

        public static void main(String[] args) {

            char[][] board = {

                    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},

                    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},

                    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},

                    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},

                    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},

                    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},

                    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},

                    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},

                    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

//            System.out.println("Validete:" + isValidSudoku(board));
            System.out.println(checkSquare(board));


        }
        public static Boolean checkRow(){
            return true;
        }
        public static Boolean checkCol(){
            return true;
        }
        public static Boolean checkSquare(char[][] board){
            int m = board.length;  // размерность судоку = 9
            int n = (int) Math.sqrt(board.length);  // размерность квадрата = 3
//            char[] square = new char[];
            Set square = new HashSet();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j+=n) {
                    square.clear();
                    for (int k = (i+1)*n-n; k < (i+1)*n; k++) {
                        for (int l = j; l < j+n; l++) {
                            if (square.add(board[k][l])){
                                System.out.println("Элемент добавлен");
                            } else {
                                System.out.println("Такой элемент уже есть");
                                return false;
                            }
                            System.out.println("a["+k+","+l+"] = " + board[k][l]);
                        }
//                        System.out.println("Закончился квадрат");
                    }
                    System.out.println("Закончился квадрат");
                }
                System.out.println("Закончился ряд квадратов");
            }
            return true;
        }
}
