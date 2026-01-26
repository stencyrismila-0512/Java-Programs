import java.util.Scanner;
class prime2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0)
            count++;
            else{
            continue;
            }
            if(count==2){
                System.out.println("Prime no");
            }else{
                System.out.println("Not a prime no"); 
            }
        }
        }
        }

