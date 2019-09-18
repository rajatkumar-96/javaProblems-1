import java.lang.reflect.Array;
import java.util.*;
public class sumofall{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the sequence of numbers");
        try{
        String jham= input.nextLine();
        String[] split= jham.split(" ");
        int[] intArray = new int[split.length];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(split[i]);
        }
        int sum=0;
        for(int j=0;j<intArray.length;j++){
            sum=sum+intArray[j];
        }
        System.out.println(sum);
    } catch(Exception e){
        System.out.println(" ALERT!!!!! Enter only integers please");
        
    }
    }
}