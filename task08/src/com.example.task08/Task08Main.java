package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        long multipli = 1;
        if(arr.length > 0){
            for(int i = 0; i < arr.length; i++){
                multipli *= arr[i];
            }
            return multipli;
        }
        else {
            return 0;
        }
    }

}