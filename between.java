import java.util.*;
public class between{
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the number");
    int number= input.nextInt();
    check(number);

}
public static void check(int a){
    if(a>20 && a<30){
        if(a%2==0){
            System.out.println("Jerry");
        }else{
            System.out.println("Tom");
        }
    }else{
        System.out.println("Number not between 20 to 30");
    }
}
}