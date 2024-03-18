package Silver;

import java.io.BufferedReader;
import java.io.IOException;

public class Silver5 {
    public static void No1427(BufferedReader br) throws IOException {
        String str = br.readLine();
        int[] numbers = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            numbers[i] = Integer.parseInt(str.substring(i, i + 1));
        }
//        for(int i = 0; i < str.length(); i++) {
//            int max = i;
//            for(int j = 0; j < str.length(); j++) {
//                if(numbers[max] < numbers[j]) {
//                    max = j;
//                }
//            }
//            if(numbers[i] < numbers[max]) {
//                int temp = numbers[i];
//                numbers[i] = numbers[max];
//                numbers[max] = temp;
//            }
//        }
       for(int i = 0; i < str.length() - 1; i++) {
           int min = i;
           for(int j = i + 1; j < str.length(); j++) {
               if(numbers[j] > numbers[min]) {
                   min = j;
               }
           }
           int temp = numbers[min];
           numbers[min] = numbers[i];
           numbers[i] = temp;
       }
        for(int i = 0; i < str.length(); i++) {
            System.out.print(numbers[i]);
        }
    }
}
