import java.util.*;
public class revstring{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string");
        String original= new String(input.nextLine());
        char[] rev= original.toCharArray();
        int num=original.length();
        for(int i=num-1; i>=0;i--){
            System.out.print(rev[i]);
        }
    }
}