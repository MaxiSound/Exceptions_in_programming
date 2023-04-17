/*
 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/

import java.util.Arrays;

public class fourthtask {
    public static void main(String[] args) {
        int[] arr1 = { 9, 8, 7, 6, 5 };
        int[] arr2 = { 1, 2, 3, 4 };

        createArr(arr1, arr2);
    }

    public static void createArr(int[] arr1, int[] arr2) {
        float[] arr3 = new float[arr1.length];
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("division by zero is not allowed");
                }
                arr3[i] = Float.valueOf(arr1[i]) / Float.valueOf(arr2[i]);
            }
            System.out.println(Arrays.toString(arr3));

        } else {
            throw new RuntimeException("Array lengths are not equal");
        }

    }
}
