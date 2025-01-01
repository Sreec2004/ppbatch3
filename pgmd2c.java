import java.util.Scanner;
public class pgmd2c {
    static findValue(int a,b,c){
        int x=(int)Math.pow(a,3);
        int y=(int)Math.pow(a,2)*b;
        int z=2*(int)Math.pow(a,2)*b;
        int f=2*a*(int)Math.pow(b,2);
        int d=a*(int)Math.pow(b,2);
        int e=(int)Math.pow(b,3);
        int sum=x+y+z+f+d+e;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        findValue(a,b,c);
        
    }
}
