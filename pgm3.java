import java.util.Scanner;
public class pgm3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int wt=s.nextInt();
        char level=s.nextLine().charAt(0);
        int est=0;
        if (wt>0 && wt<2000){
            if(level == 'L' || level == 'l'){
                est=25;
            }
        }
        if (wt>2000 && wt<4000){
            if(level == 'M' || level == 'm'){
                est=35;
            }
        }
        if (wt>4000 && wt<7000){
            if(level == 'H' || level == 'h'){
                est=45;
            }
        }
        if (wt>7000 || wt<0){
            System.out.println("INVALID INPUT");
        }
        System.out.println("Time taken is"+est);
    }
}