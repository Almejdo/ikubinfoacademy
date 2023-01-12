package Perseritje;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.Date;   del error pasi programi nuk e njeh se nga cila pakete do aksesohet Date .

public class Perseritje {
    private java.util.Date dataPerseritje;
    // mund te bej implementinimin duke e aksesuar direkt, me emer pakete dhe emer klase .
    private java.sql.Date dataPerseritja2;
    // ose mund ti besh te dyja ketu


    public static int[][] metoda() {
        int[][] matrica = new int[4][4];
        int m  = matrica.length;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Jepni vlerat");
                matrica[i][j] = input.nextInt();
            }
        }
        return matrica;


    }
    public static void metoda2(int[][] metoda){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4;j++){
                System.out.println("ne pozicionin " + i + " " + j + "  ndodhet vlera " + metoda[i][j]);
            }
        }



    }

public static void main(String[] args){
        metoda();
        metoda2(metoda());
}

}