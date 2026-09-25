import java.util.*;
public class remainderBy11 {
    public static int remainderBy11(String nums){
        int remainder=0;
        for(int i=0;i<nums.length();i++){
            int digit=nums.charAt(i)-'0';
            remainder=(remainder*10+digit)%11;

        }
        return remainder;
    }
    public static void main(String args[]){
        String pk="13589234356546756";
        int result =remainderBy11(pk);
        System.out.println(result);

    }

}

