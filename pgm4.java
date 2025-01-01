import java.util.*;

public class pgm4 {
       public static void add(int a,int b){
            System.out.println(a+b);
        }
        public static void sub(int a,int b){
            System.out.println(a-b);
        }
        public static void div(int a,int b){
            if(b==0){
                System.out.println("Cannot divide with zero");
            }else{
            System.out.println(a/b);}
        }
        public static void mul(int a,int b){
            System.out.println(a*b);
        }
        public static void mod(int a,int b){
            System.out.println(a%b);
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
        System.out.println("Select operation: +-Add, --Subtract, /-Divide, *-Multiply, %-Modulo");
        char op=s.next().charAt(0);
        switch(op){
            case '+':
            add(a,b);
            break;
            case '-':
            sub(a,b);
            break;
            case '/':
            div(a,b);
            break;
            case '*':
            mul(a,b);
            break;
            case '%':
            mod(a,b);
            break;
            default:
            System.out.println("Calculator");
        }
    }
}