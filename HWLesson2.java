package Lesson2;

import java.util.Arrays;

public class HWLesson2 {
    public static void main(String[] args) {

        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        method1(array);
        System.out.println("Answer1 = " + Arrays.toString(array));

        //2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его
        // значениями 1 4 7 10 13 16 19 22;

        int[] array1 = new int[8];
        method2(array1);
        System.out.println("Answer2 = " + Arrays.toString(array1));

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,принимающий на вход массив
        // и умножающий числа меньше 6 на 2;

        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        method3(array2);
        System.out.println("Answer3 = " + Arrays.toString(array2));

        //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

        int[] array3 = new int[6];
        array3[0] = 5;
        array3[1] = 7;
        array3[2] = 3;
        array3[3] = 8;
        array3[5] = 1;
        System.out.println("Answer4 = ");
        method4min(array3);
        method4max(array3);

        //5* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его
        // диагональные элементы единицами, используя цикл(ы);

        int[][] array4 = new int[5][5];
        method5(array4);
        System.out.println("Answer 5 = ");
        printMethod(array4);


    }
        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

        public static void method1(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                } else {
                    array[i] = 1;
                }
            }
        }


        //2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его
        // значениями 1 4 7 10 13 16 19 22;

        public static void method2(int[] array1) {
            for (int i = 0; i < array1.length; i++)
                array1[i] = i * 3 + 1;
        }



        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,принимающий на вход массив
        // и умножающий числа меньше 6 на 2;

        public static void method3(int[] array2){
            for (int i = 0; i < array2.length; i++)
                if (array2[i] < 6) {
                    array2[i] *= 2;
                }
        }


        //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

        public static void method4min(int[] array3){
            int m = array3[0];
            for (int i = 0; i < array3.length; i++){
                if (array3[i] < m)
                    m = array3[i];
            }
            System.out.println("Минимальное = " + m);
        }

         public static void method4max(int[] array3){
            int max = array3[0];
            for (int i = 0; i < array3.length; i++){
                if (array3[i] > max)
                max = array3[i];
            }
            System.out.println("Максимальное = " + max);
    }

        //5* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его
        // диагональные элементы единицами, используя цикл(ы);

        public static void method5(int[][] array4) {
            for (int i = 0; i < array4.length; i++) {
                array4[i][i] = 1;
                array4[i][array4.length - 1 - i] = 1;

            }
        }

        public static void printMethod(int[][] array4) {
            for (int y = 0; y < array4.length; y++) {
                for (int x = 0; x < array4[y].length; x++){
                    System.out.print(array4[x][y] + "\t");
                }
                System.out.println();
            }
        }
}
