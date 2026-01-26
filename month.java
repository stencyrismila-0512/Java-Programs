import java.util.Scanner;
class month{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m;
        System.out.println("Enter the month: ");
        m=in.nextInt();
        if(m>=3&&m<=5)
        System.out.println("Season:Spring");
        else if(m>=6&&m<=8)
        System.out.println("Season:Summer");
        else if(m>=9&&m<=11)
        System.out.println("Season:Autumn");
        else if(m==12||m<=2)
        System.out.println("Season:winter");
        else
        System.out.println("Invalid month");
    }
}