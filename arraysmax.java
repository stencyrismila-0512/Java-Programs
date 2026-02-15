class arraysmax{
    public static void main(String[] args){
        int[] a = {10,3,4,5,9,6};

        int max = a[0];
        int smax = Integer.MIN_VALUE;

        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                smax = max;
                max = a[i];
            }
            else if(a[i] > smax && a[i] != max){
                smax = a[i];
            }
        }

        System.out.println("Second Maximum = " + smax);
    }
}
