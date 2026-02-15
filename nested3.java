import java.util.Scanner;
class nested3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int sum = 0;  

        for(int i=1;i<=n;i++){
            int num=0;

            for(int j=1;j<=i;j++){  
                num = num * 10 + 9;
            }

            sum = sum + num; 
        }

        System.out.println("Sum = " + sum);
    }
}
