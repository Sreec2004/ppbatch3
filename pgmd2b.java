import java.util.Scanner;
public class pgmd2b {
    static boolean isFib(int n){
        int b=5*(n*n)+4;
        int c=5*(n*n)-4;
        return psq(b)||psq(c);
    }
    static boolean psq(int x){
        int sq=(int)Math.sqrt(x);
        return sq*sq==x;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if (isFib(a)){
            System.out.println("it is fibo number");
        }
        else{
            System.out.println("it is not fibo");
        }


    }
}
