public class Main {
    public static void main(String[] args) {
//Задание 1
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(arr[0]);

//Задание 2
        int[] arr1 = new int[8];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = arr1[i - 1] + 3;
        }
        System.out.println(arr1[7]);

//Задание 3
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(arr2[0]);

//Задание 4
        int[][] twoArr = new int[11][11];
        for (int i = 0; i < twoArr.length; i++){
            for (int j = 0; j < twoArr[i].length; j++){
                if (i == j){
                    twoArr[i][j] = 1;
                    twoArr[i][twoArr.length - 1 - i] = 1;
                }
            }
        }
        for (int i = 0; i < twoArr.length; i++) {
            for (int j = 0; j < twoArr[i].length; j++){
                System.out.print(twoArr[i][j]);
            }
            System.out.println( );
        }
    }
}