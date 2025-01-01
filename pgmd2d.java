import java.util.Scanner;
public class pgmd2d {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0;
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum=sum+digit;
            c++;
            a=a/10;
            
        }
        System.out.println(c);
        System.out.println(sum);

    }
}
