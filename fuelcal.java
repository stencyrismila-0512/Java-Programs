import java.util.Scanner;
class fuelcal{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of litres to fill the tank");
        float diesel=in.nextFloat();
        System.out.println("Enter the distance covered:");
        float dist=in.nextFloat();
        if(diesel>0&&dist>0){
            float cons=(diesel/dist)*100;
            System.out.println("(Litres/100KM) "+cons);
            float mpg = (dist * 0.6214f) / (diesel * 0.2642f);
            System.out.println("(Miles/gallons) "+mpg);
        }else{
            System.out.println("Invalid input");
        }
    }
}