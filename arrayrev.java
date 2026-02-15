class arrayrev{
    public static void main(String[] args){
        int[] a={4,8,5,2,6};
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}