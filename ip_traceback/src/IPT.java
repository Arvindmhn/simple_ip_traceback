package ipTraceBack;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by Baby on 9/7/2016.
 */
public class IPT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] UIID = input.split("\\s");
        DecimalFormat df = new DecimalFormat("#.#############");
        double PI[] = new double[32];
        int ui;
        for(int i= 0; i<UIID.length;i++){
        	System.out.println(UIID[i]);
        }
        //forward
        PI[0] = Double.parseDouble(UIID[0]);
        PI[0]= Double.valueOf(df.format(Math.log10(PI[0]) + PI[0])) ;
        
        //System.out.println("PI value generated: "+ PI);
        for(int i=1;i<UIID.length;i++){
        	ui = Integer.parseInt(UIID[i]);
            PI[i] = Double.valueOf(df.format(Math.log10(PI[i-1]) + ui)) ;
            System.out.println(i-1+". PI value generated: "+ PI[i-1]);
        }
        System.out.println("PI value generated: "+ PI[UIID.length -1]);

        //reverse
        double UIID_rev;
        double[] rev = new double[UIID.length];
        int j = 0;
        for(int i=rev.length-1;i>=0;i--) {
        	if(i ==0 ){
        		UIID_rev = Math.floor(PI[i]) - (int) Math.log10(PI[i]);
                rev[j] = UIID_rev;
                j++;
                PI[i]  = Math.pow(10, Double.valueOf(PI[i]) - UIID_rev)  ;
        	}
        	else{
            UIID_rev = Math.floor(PI[i]) - (int) Math.log10(PI[i-1]);
            rev[j] = UIID_rev;
            j++;
            PI[i]  = Math.pow(10, Double.valueOf(PI[i]) - UIID_rev)  ;
        	}
            System.out.println("rev PI value generated: "+ PI[i]);
        }

        System.out.println("Reverse Path >>>");
        for(int i=0;i<rev.length;i++){
            System.out.println((int)rev[i]);
        }

    }
}

