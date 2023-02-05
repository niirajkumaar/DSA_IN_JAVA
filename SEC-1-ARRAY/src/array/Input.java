package array;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=25;
        arr[2]=27;
        arr[3]=20;
        arr[4]=58;
        //[23,25,27,20,58]
        System.out.println(arr[2]);

        //input using for loop
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
