class arrayorder{
    public static void main(String[] args){
        int[] a={10,3,8,4,2,1};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending order:");
        for(int i=0;i<a.length;i++){
              System.out.println(a[i]+" ");
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Descending order: ");
        for(int i=0;i<a.length;i++){
              System.out.println(a[i]+" ");
            }
        }
    }
