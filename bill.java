import java.util.Scanner;
class bill{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int units,ebill;
        System.out.println("Enter total electricity units used:");
        units=in.nextInt();
        if(units<=100)
        ebill=units;
        else if(units>=101&&units<=200)
        ebill=units*2;
        else if(units>=201&&units<=300)
        ebill=units*3;
        else
        ebill=units*5;
        System.out.println("Your electricity bill is:"+ebill);
    }
}