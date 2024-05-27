// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
 
        int a[]={1,2,3,4,5,12,6};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==7){
                    System.out.println("index  "+ i +" index  "+j);
                }
            }
        }
        
 
     }
}
