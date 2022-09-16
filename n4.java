import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        int a,b,c;
        double avg;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 3numbers");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        avg=(a+b+c)/3;
        System.out.println("the avg= "+avg);
    }
}
