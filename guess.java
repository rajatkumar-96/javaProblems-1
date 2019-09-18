import java.util.*;
public class guess{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100");
        int num=47,user_num;
        try{
            do{
                user_num= input.nextInt();
                if(user_num>num){
                    System.out.println("Input is greater than given number");
                }else if(user_num<num){
                    System.out.println("Input is smaller than given number");
                }

               }while(num!=user_num);
                 System.out.println("MATCH FOUND");
           }
        catch(Exception e){
            System.out.println(" ALERT !!!!!! Please enter INTEGERS ONLY");
        }
}
}