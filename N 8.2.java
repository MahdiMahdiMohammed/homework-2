import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double number,square,cube,foruth_power;
        System.out.println("enter the number : ");
        number=input.nextDouble();
        square=(number*number);
        System.out.println("the square= "+square);
        cube=(number*number*number);
        System.out.println("the cube= "+cube);
        foruth_power=Math.pow(number,4);
        System.out.println("the foruth_power= "+foruth_power);
    }
}
