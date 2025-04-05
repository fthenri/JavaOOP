package listapontoextra;

import java.util.Arrays;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];

        for(int i = 0; i < 10; i++){
            array[i] = sc.nextLine();
        }

        Arrays.sort(array);

        for(String str : array){
            System.out.println(str);
        }

        sc.close();
    }
}
