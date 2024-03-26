public class Teste{
public static void main(String args[]) {
    String matriz[][] = new String[3][2];
    matriz[0][0] = "0,0";
    matriz[1][0] = "1,0";
    matriz[2][0] = "2,0";
    matriz[0][1] = "0,1";
    matriz[1][1] = "1,1";
    matriz[2][1] = "2,1";
        for (int i=0; i<3; i++)
        for (int j=0; j<2; j++)
        System.out.println(matriz[i][j]);
        }
    }