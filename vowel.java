import java.util.*;
public class vowel{
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the string");
    String mysent= new String(input.nextLine());
    mysent= mysent.toLowerCase();
    check(mysent);

}
public static void check(String a){
    for(int i=0;i<a.length();i++){
        char ch=a.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
}

