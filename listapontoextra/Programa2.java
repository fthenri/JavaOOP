package listapontoextra;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double[][] matriz1 = new double[2][3];
        double[][] matriz2 = new double[2][3];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                matriz1[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                matriz2[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                if(matriz1[i][j] == matriz2[i][j]){
                    System.out.println(i + ", " + j);
                }
            }
        }

        sc.close();
    }
}
