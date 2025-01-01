import java.util.Scanner;
class pgm21{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int squ =0;
        System.out.println("Square upto n is :");
        for(int i=1;i<=n;i++){
            squ=i*i;
            System.out.print(squ);
        }
        if(n=0){
            System.out.println("0");
        }


    }
}