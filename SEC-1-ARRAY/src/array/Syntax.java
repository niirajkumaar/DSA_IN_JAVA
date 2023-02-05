package array;

public class Syntax {
    public static void main(String[] args) {
        //syntax
        //dataType[] variable_name=new dataType[size]

        //store 5 roll nos.

        int[] roll=new int[5];
        int[] rolls; //declaration of array,rolls is getting defined in the stack
        rolls=new int[5]; //initialization: object is created in the heap memory
        System.out.println(rolls[1]);

        String[] arr=new String[4];
        System.out.println(arr[0]);



    }
}
