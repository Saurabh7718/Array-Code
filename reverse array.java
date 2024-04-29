import java.io.*;
public class main{
public static void main(String[] args){
 int arr[]={1,2,3,4,5};
 for(int i=arr.length-1;i>=0;i--){
     System.out.println(arr[i]);
 }
}
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int []arr={1,3,5,7,11,1,3,5};
        
        List<Integer> list=new ArrayList<Integer>();
        for(int i:arr){
            list.add(i);
        }
    Collections.reverse(list);
    for(int i:list){
        System.out.println(i);
    }
    }
}
