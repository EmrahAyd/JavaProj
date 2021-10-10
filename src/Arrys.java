import java.util.Arrays;


public class Arrys {
    public static void main(String[] args) {
        int total = 0 ;


        int series[] = {1,142,24,54,5,9};


            //System.out.println(Arrays.toString(series));
        for (int i =0; i < series.length; i++){
            total+= series[i];

            //System.out.println(total);
        }
        System.out.println(total / series.length);
    }
}
