class arraysmin {
    public static void main(String[] args) {

        int[] a = {10, 3, 4, 5, 9, 6};

        int min = a[0];
        int smin = a[1];
        if (smin < min) {
            int temp = min;
            min = smin;
            smin = temp;
        }

        for (int i = 2; i < a.length; i++) {

            if (a[i] < min) {
                smin = min;
                min = a[i];
            }
            else if (a[i] < smin) {
                smin = a[i];
            }
        }

        System.out.println("Second Minimum = " + smin);
    }
}
