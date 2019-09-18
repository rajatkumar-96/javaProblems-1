import java.util.*;
public class askey{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any character:");
        char contain= input.next().charAt(0);
        int some=(int)contain;
        if((some>=32 && some<=47) || (some>=58 && some<=64) ||(some>=91 && some<=96) || (some>=123 && some<=126)){
            System.out.println("Special Character");

        }else if(some>=65 && some<=90){
            System.out.println("CAPITAL LETTER");

        }else if(some>=97 && some<=122){
            System.out.println("small letter");
        }else{
            System.out.println("NUMBER");
        }
    }
}