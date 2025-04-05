package listapontoextra;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        String key = "JAVA";
        int keyCount = 0;
        int lastIndex = -1;
        int index = key.indexOf(key);
        while(index != -1){
            keyCount++;
            lastIndex = index;
            index = str.indexOf(key, index + key.length());
        }
        System.out.println(keyCount);
        
        if (lastIndex != -1 && lastIndex + key.length() < str.length()) {
            String strAfterLastKey = str.substring(lastIndex + key.length());
            System.out.println(strAfterLastKey);
        }
    }
}
