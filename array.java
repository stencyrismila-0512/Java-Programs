import java.util.Scanner;
import java.util.Arrays;
class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out,println("enter the elements of the array:");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements in the array:");
        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }}
}