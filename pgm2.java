import java.util.*;

public class pgm2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        int a=s.nextInt();
        double sol=Math.pow(n,a);
        System.out.printf("%.5f",sol);
    }
}