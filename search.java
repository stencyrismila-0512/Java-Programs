import java.util.Scanner;
class search{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter an element to search: ");
        int search=in.nextInt();
        for(int i=0;i<a.length;i++){
            if(search==a[i]){
                System.out.println("Element found at index value : "+i);
                break;
            }
            else
            System.out.println("Element not found");
            break;
        }
    }
}