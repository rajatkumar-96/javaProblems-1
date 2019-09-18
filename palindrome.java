import java.util.*;

public class palindrome{
    public static void  main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        long number= input.nextLong();
        checkpalindrome(number);
      

    }
    public static void checkpalindrome(long a){
        long sum=0,r;
        long temp=a;
        while(a>0){
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        if(sum==temp){
            System.out.println("A palindrome");
              }else{
                System.out.println(" NOT A palindrome");
              }

    }
}