package kshtm;

public class DoingSomethingWithArrays {

    public static int serchMaxElement(int[] arr) {

        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int [] intArr = {4, 5, 10, 100, 40, 88, 1500, -15, 87, 999, 5000};
        System.out.println(serchMaxElement(intArr));
    }
}
