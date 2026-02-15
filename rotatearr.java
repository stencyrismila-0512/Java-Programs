class rotatearr {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 1, 2};

        if (a.length != b.length) {
            System.out.println("Not a rotation");
            return;
        }

        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] == b[0]) {
                count = 0;

                for (int j = 0; j < n; j++) {
                    if (a[(i + j) % n] == b[j]) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }

        if (count == n)
            System.out.println("Rotation");
        else
            System.out.println("Not a rotation");
    }
}
