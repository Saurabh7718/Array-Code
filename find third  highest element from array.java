// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int []arr={1,5,2,7,9,13};
        int a=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
            
        }
        
         for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");  
          
             
         }
        System.out.println(" ");
        System.out.println(arr[arr.length-3]);
    }
}
