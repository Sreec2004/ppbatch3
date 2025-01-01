import java.util.Scanner;
public class pgmd2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int n=s.nextInt();
        int c=0;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");

        }
    }  
}
