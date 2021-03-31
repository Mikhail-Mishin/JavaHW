package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HWLesson3 {

    public static char [][] map;
    public static int height;
    public static int width;
    public static int winCells = 4;

    public static char man = 'X';
    public static char ai = '0';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap(int sizeX, int sizeY){
        height = sizeX;
        width = sizeY;
        map = new char[width][height];

        for (int y = 0; y < width; y++){
            for (int x = 0; x < height; x++){
                map[y][x] = empty;
            }
        }
    }

    public static void printMap(){
        System.out.println("----------------");
        for (int y = 0; y < width; y++){
            for (int x = 0; x < height; x++){
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void turnMan(){
        int x;
        int y;

        do {
            System.out.println("Enter x: ");
            x = scanner.nextInt() - 1;
            System.out.println("Enter y: ");
            y = scanner.nextInt() - 1;
        } while (!validCell(y, x) || (!emptyCell(y, x)));
        map[y][x] = man;

    }

    public static boolean validCell(int y, int x) {
        return x >= 0 && x < height && y >= 0 && y < width;
    }

    public static boolean emptyCell(int y, int x) {
        return map[y][x] == empty;
    }

    public static void turnAi(){
        int x;
        int y;

        do {
            x = random.nextInt(width);
            y = random.nextInt(height);
        } while (!emptyCell(y, x));
        map[y][x] = ai;
        
    }

    public static boolean win (char player){

        //проверка по строкам
        for (int x = 0; x < height; x++) {
            int row = 0;
            for (int y = 0; y < width; y++) {
                if (map[x][y] == player) row++;
            }
            if (row == winCells) return true;
        }
        //проверка по столбцам
        for (int x = 0; x < height; x++){
            int col = 0;
            for (int y = 0; y < width; y++){
                if (map[y][x] == player) col++;
            }
            if (col == winCells) return true;
        }
        //проверка по диагонали 1:1 - 5:5
        int diag1 = 0;
        for (int x = 0; x < height; x++) {
            if (map[x][x] == player) diag1++;
            if (diag1 == winCells) return true;
        }
        //проверка по диагонали 1:5 - 5:1
        int diag2 = 0;
        for (int x = 0; x < height; x++) {
            if (map[x][map[x].length - x - 1] == player) diag2++;
            if (diag2 == winCells) return true;
        }
        return false;
    }
    
   
    public static boolean draw(){
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < height; x++) {
                if (map[y][x] == empty) {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args){
        createMap(5,5);
        printMap();

        while (true) {
            turnMan();
            printMap();
            if (win(man)) {
                System.out.println("Man wins");
                break;
            }
            if (draw()) {
                System.out.println("Draw");
                break;
            }
            turnAi();
            printMap();
            if (win(ai)) {
                System.out.println("Ai wins");
                break;
            }
            if (draw()) {
                System.out.println("Draw");
                break;

            }

        }
    }
}
