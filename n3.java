import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        double a,b,c,s;
        Scanner iput=new Scanner(System.in);
        System.out.println("enter the length");
        a= iput.nextDouble();
        System.out.println("enter the width ");
        b= iput.nextDouble();
        c=a*b;
        System.out.println("the area rectangle ="+c);
        s=2*(a+b);
        System.out.println("the ocean rectangle= "+s);
    }
}
