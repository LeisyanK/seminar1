package org.example.seminar2.hw2;

import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {

        int[][] board = {

                {5, 3, 0, 0, 7, 0, 0, 0, 0},

                {6, 0, 0, 1, 9, 5, 0, 0, 0},

                {0, 9, 8, 0, 0, 0, 0, 6, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 3},

                {4, 0, 0, 8, 0, 3, 0, 0, 1},

                {7, 0, 0, 0, 2, 0, 0, 0, 6},

                {0, 6, 0, 0, 0, 0, 2, 8, 0},

                {0, 0, 0, 4, 1, 9, 0, 0, 5},

                {0, 0, 0, 0, 8, 0, 0, 7, 9}};

        printBoard(board);

        int count = 31;     // количество сделанных ходов
        while (count < 82) {
            System.out.println("Введите позицию (i,j) и число");
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int l = sc.nextInt();
            int num = sc.nextInt();
            if (k < 1 || k > 9 || l < 1 || l > 9 || num < 1 || num > 9) {
                System.out.println("Введены неверные числа! Введите еще раз.");
            }
            else if (board[k - 1][l - 1] != 0) {
                    System.out.println("Ячейка уже занята! Введите еще раз.");
            } else if (isValidSudoku(board, k - 1, l - 1, num)) {
                board[k - 1][l - 1] = num;
//                System.out.println(count + " ход: " + num);
                printBoard(board);
                count++;
            }
        }
        if (count == 82) {
            System.out.println("Вы выиграли!");
        }


    }

    public static Boolean isValidSudoku(int[][] board, int i, int j, int num) {
//        System.out.println("a["+i+","+j+"]="+ num);
        int k;
        for (k = 0; k < board.length; k++) {
            if (board[i][k] == num) {
                i++;
                System.out.println("В строке " + i + " уже есть число " + num);
                return false;
            }
        }

        for (k = 0; k < board.length; k++) {
            if (board[k][j] == num) {
                j++;
                System.out.println("В столбце " + j + " уже есть число " + num);
                return false;
            }
        }

        int i1, j1;
        if (i < 3) {
            i1 = 0;
        } else if (i > 5) {
            i1 = 6;
        } else {
            i1 = 3;
        }
        if (j < 3) {
            j1 = 0;
        } else if (j > 5) {
            j1 = 6;
        } else {
            j1 = 3;
        }
        for (k = i1; k < i1 + 3; k++) {
            for (int l = j1; l < j1 + 3; l++) {
                if (board[k][l] == num) {
                    System.out.println("В квадрате уже есть число " + num);
                    return false;
                }
            }

        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (j == 3 || j == 6) {
                    System.out.print("| ");
                }
                if (board[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
            if (i == 2 || i == 5) {
                System.out.println("---------------------");
            }
        }
    }
}
