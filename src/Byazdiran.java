import java.util.Arrays;
public class Byazdiran {
    public static void main(String[] args) {
        String[][] tablo = new String[7][4];
        //Arrays.fill(tablo, " " );

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {

                // tablo[j][i] = (i == 0 || i == 3 || i == 6) ? " * " : "   ";


                // tablo[j][i] = (j == 0 || j == 3) ? " * " : "   ";

                if (i == 0 || i == 3 || i == 6) {

                    tablo[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    tablo[i][j] = " * ";
                } else {
                    tablo[i][j] = "   ";
                }


            }

        }


        for (String[] row : tablo) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

        }




