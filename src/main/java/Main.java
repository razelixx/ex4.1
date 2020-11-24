//    1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
//    Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] randomArray = new int[20];
//        for (int i = 0; i < randomArray.length; i++) {
//            randomArray[i] = ((int)(Math.random() * 21) - 10);
//            System.out.println(randomArray[i]);
//        }
//        int maxNum = randomArray[0];
//        int minNum = randomArray[0];
//        for (int i = 0; i<randomArray.length; i++){
//            if (maxNum < randomArray[i]) {
//                maxNum = randomArray[i];
//            }
//            if (minNum > randomArray[i]){
//                minNum = randomArray[i];
//            }
//        }
//        System.out.println(minNum);
//        System.out.println(maxNum);

        int maxNegIndex = 0;
        int minPosIndex = 0;
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 21) - 10);
            if (arr[i] < 0) {
                if (arr[i] > arr[maxNegIndex])
                    maxNegIndex = i;
                if (arr[maxNegIndex] >= 0)
                    maxNegIndex = i;
            } else if (arr[i] > 0) {
                if (arr[i] < arr[minPosIndex])
                    minPosIndex = i;
                if (arr[minPosIndex] <= 0)
                    minPosIndex = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        int tmp = arr[maxNegIndex];
        arr[maxNegIndex] = arr[minPosIndex];
        arr[minPosIndex] = tmp;

        System.out.println(Arrays.toString(arr));
    }
}
