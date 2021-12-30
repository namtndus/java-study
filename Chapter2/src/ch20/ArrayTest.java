package ch20;

import java.sql.PseudoColumnUsage;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[10];  //new 라는 키워드를 쓰면 선언과 동시에 초기화가 된다.
        int total = 0;

        for(int i = 0, num = 1; i<arr.length; i++){
            arr[i] = num++;
        }

        for(int i : arr){
            total += i;
        }

        System.out.println(total);
    }

}
