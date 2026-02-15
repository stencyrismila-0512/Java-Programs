import java.util.Scanner;

class hexadd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine().toUpperCase();
        String s2 = in.nextLine().toUpperCase();

        int n1 = s1.length() - 1;
        int n2 = s2.length() - 1;

        int num = 0, carry = 0;
        String sum = "";

        while (n1 >= 0 || n2 >= 0 || carry > 0) {
            int v1 = 0, v2 = 0;

            if (n1 >= 0) {
                char c1 = s1.charAt(n1);
                if (c1 >= '0' && c1 <= '9')
                    v1 = c1 - '0';
                else
                    v1 = c1 - 'A' + 10;
            }

            if (n2 >= 0) {
                char c2 = s2.charAt(n2);
                if (c2 >= '0' && c2 <= '9')
                    v2 = c2 - '0';
                else
                    v2 = c2 - 'A' + 10;
            }

            num = v1 + v2 + carry;
            carry = num / 16;
            num = num % 16;

            if (num < 10)
                sum = num + sum;
            else
                sum = (char)(num - 10 + 'A') + sum;

            n1--;
            n2--;
        }

        System.out.println("Sum = " + sum);
    }
}
