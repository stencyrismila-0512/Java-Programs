import java.util.Scanner;
class week{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=in.nextInt();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Thursady");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}