import java.util.Scanner;
class hextooct{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String hex=in.nextLine();
        String oct=" ";
        for(int i=0;i<hex.length();i++){
            char ch=hex.charAt(i);
            int value=0;
        if(ch>='0'&&ch<='9'){
            value=ch-'0';
        }else if(ch>='A'&&ch<='F'){
            value=ch-'A'+10;
        }else{
            System.out.println("Invalid");
            return;
        }
        String temp=" ";
        while(value>0){
            int rem=value%8;
            temp=rem+temp;
            value=value/8;
        }
        oct=oct+temp;
    }System.out.println("Octal :"+oct);
}
}