package UshNeKurs;
  import java.util.Scanner;
public class aga {
    // shkruani nje program qe printon shumen e elementeve per cdo rresht te nje matrice ose te nje array 2d


    public static void main(String[] args) {


        // shkruani nje program qe printon shumen e elementeve per cdo rresht te nje matrice ose te nje array 2d
       /* int n = 3;
        int m = 3;
        int shuma = 0;

        int[][] matrica = new int[n][m];
        Scanner skano = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Krijo Arrayn: ");
                matrica[i][j] = skano.nextInt();
                shuma = shuma + matrica[i][j];


            }*/

            /**nje array 2d ruan reviewt qe jane kryer per filma te ndryshem nga 10 regjizore;
             // a)printo reviewt per secilin film
             // ruaj ne nje array 1d reviewt per cdo film
             // printo filmin me me shume review
             */
            int filmat = 5;
            int rregjizoret = 10;
            int[] reviewtEcdoFilmi = new int[5];
            int nota = 0;

            int[][] reviewt = new int[filmat][rregjizoret];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < filmat; i++) {
                for (int j = 0; j < rregjizoret; j++) {
                    System.out.println("Cilen note i jepni filmit " + i);
                    reviewt[i][j] = input.nextInt();
                    nota += reviewt[i][j];
                    nota=0;

                }
                System.out.println("Per filmin " + i + " notat e dhena nga regjizoret jane: " + nota);
                reviewtEcdoFilmi[i] = nota;


            }
            int max= reviewtEcdoFilmi[0];
            int indexFilmi = 0;
            for(int i = 1; i <5; i++){
                if(reviewtEcdoFilmi[i] > max ){
                    max = reviewtEcdoFilmi[i];
                    indexFilmi = i;
                }


        }
        System.out.println("Filmi me vleresimin me te larte " + max + " eshte filmi me index " + indexFilmi);
    }
}