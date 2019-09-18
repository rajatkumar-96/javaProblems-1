import java.util.Scanner;

public class sorter{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= input.nextInt();
        int temp=number;
        int count=0;
        for(int i=0;temp!=0;i++){
        int r=temp%10;
        temp=temp-r;
        temp=temp/10;
        count++;
        }
        temp=number;
        int[] arr1= new int[count];
        for(int j=0;j<count;j++){
            int k= temp%10;
            temp=temp/10;
            arr1[j]=k;

        }
        Arrays.sort(arr1);
        int sum=0;
        for(int k=0;k<count;k++){
            if(arr1[k]%2==0){
                sum=sum+arr1[k];
            }
        }
        if(sum>15){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }
}