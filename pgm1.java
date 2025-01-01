import java.util.Scanner;
public class pgm1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        while(n>9){
            sum=0;
        while(n>0){
            int count=n%10;
            sum=sum+count;
            n=n/10;
        }
        n=sum;
    }

        System.out.println(sum);
        }
    }
    

