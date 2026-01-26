import java.util.Scanner;
class bin{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String bin = "";

        while (n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        }

        System.out.println("Binary = " + bin);
    }
}
