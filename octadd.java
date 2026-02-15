import java.util.Scanner;

class octadd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        int n1 = s1.length() - 1;
        int n2 = s2.length() - 1;

        int num = 0, carry = 0;
        String sum = "";

        while (n1 >= 0 || n2 >= 0 || carry > 0) {

            int d1 = 0, d2 = 0;

            if (n1 >= 0)
                d1 = s1.charAt(n1) - '0';

            if (n2 >= 0)
                d2 = s2.charAt(n2) - '0';

            num = d1 + d2 + carry;
            carry = num / 8;   // base 8
            num = num % 8;     // base 8

            sum = num + sum;

            n1--;
            n2--;
        }

        System.out.println("Sum = " + sum);
    }
}
