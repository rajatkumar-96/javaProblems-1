import java.util.*;
public class lastrepeat{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string");
        String new1= input.nextLine();
        System.out.println("Enter a number");
        int new2= input.nextInt();
        char[] c= new1.toCharArray();
        int i= new1.length();
        int count=0;
        System.out.print(new1);
        while(count!=new2){
            for(int j=i-new2;j<i;j++){
                System.out.print(c[j]);
            }
            count++;


        }

    }
}