import java.util.Scanner;
class letter{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter the digits:");
        for(int i=0;i<4;i++){
            num=in.nextInt();
        if(num>=0 && num<=127){
            char ch=(char) num;
            System.out.println(ch);
        }else{
            System.out.println("invalid Output");
        }
    }
}
}