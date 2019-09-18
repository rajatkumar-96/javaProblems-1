import java.util.*;

public class pattern1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int newnum= input.nextInt();
        patterngen(newnum);
    }
    public static void patterngen(int a){
        for(int i=1;i<=a;i++){
              for(int j=1;j<=i;j++){
                  System.out.println(i);
              }  
        }

    }
}
