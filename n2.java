import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        double r,a,x;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the half diameter");
        r= input.nextDouble();
        a=3.14*(r*r);
        System.out.println("the area circle= "+a);
        x=3.14*r*2;
        System.out.println("the ocean circle"+x);

    }
}
