import java.util.*;

/**
 * Created by Baby on 9/7/2016.
 */
public class IPT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] UIID = input.split("\\s");
        Double PI;

        //forward
        PI = Double.parseDouble(UIID[0]);
        PI = Math.log10(PI) + PI ;
        //System.out.println("PI value generated: "+ PI);
        for(int i=1;i<UIID.length;i++){
            PI = Math.log10(PI) + Double.parseDouble(UIID[i]) ;
            //System.out.println("PI value generated: "+ PI);
        }
        System.out.println("PI value generated: "+ PI);

        //reverse
        Double UIID_rev;
        double[] rev = new double[UIID.length];

        for(int i=0;i<rev.length;i++) {
            UIID_rev = Math.floor(PI) - (int) Math.log10(PI);
            rev[i] = UIID_rev;
            PI  = Math.pow(10, PI - UIID_rev)  ;
            //System.out.println("rev PI value generated: "+ PI);
        }

        System.out.println("Reverse Path >>>");
        for(int i=0;i<rev.length;i++){
            System.out.println((int)rev[i]);
        }

    }
}
