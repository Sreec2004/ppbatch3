import java.util.*;

public class pgm3 {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        int a=s.nextInt();
        double res=1.00;
        if(a==0){
            System.out.println(0);
        }
        if(a<0){
            n=1/n;
            a=-a;
        }
        while(a>0){
            if(a%2==1){
               res=res*n; 
            }
            n=n*n;
            a=a/2;
        }
        System.out.printf("%.5f",res);
    }
}