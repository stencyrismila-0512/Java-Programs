import java.util.Scanner;
class number{
    public static void main(String[] args) {
        Scanner no=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=no.nextInt();
        if(number==10){
            System.out.println("Number is 10");
        }
        else if(number==15){
            System.out.println("Number is 15");
        }
        else if(number==20){
            System.out.println("Number is 20");
        }
        else{
            System.out.println("Number is Invalid");
        }
    }}
