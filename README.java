import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
    
     int n,i,j,t=1;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
   // k=s.nextInt();
   /* int a[]=new int[n];
    for(i=0;i<n;i++){
        a[i]=s.nextInt();
        
    }*/
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
           
         System.out.print(t);
         t++;
            
        }
        System.out.println();
        
    }
    
     }
}
