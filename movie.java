import java.util.Scanner;
class movie{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int pizza,puff,drink;
        System.out.println("Enter the no of pizzas bought ");
        pizza=in.nextInt();
        System.out.println("Enter the no of puffs bought ");
        puff=in.nextInt();
        System.out.println("enter the no of cool drinks bought ");
        drink=in.nextInt();
        System.out.println("Bill details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cool drinks:"+drink);
        int total=(pizza*100)+(puff*20)+(drink*10);
        System.out.println("Total price="+total);
    }
}