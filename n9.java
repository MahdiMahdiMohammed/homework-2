import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,sum,product,distance,max,min,difference;
        float average;
        System.out.println("pleas enter the number ");
        num1= input.nextInt();
        System.out.println("pleas enter the number");
        num2= input.nextInt();
        sum=num1+num2;
        System.out.println("the sum= "+sum);
        product =num1*num2;
        System.out.println("the product= "+product);
        difference=num1-num2;
        System.out.println("the difference= "+difference);
        average=((float)sum/2);
        System.out.println("the average= "+average+"%");
        distance=Math.abs(num1-num2);
        System.out.println("the distance= "+distance);
        max=Math.max(num1,num2);
        System.out.println("the max= "+max);
        min=Math.min(num1,num2);
        System.out.println("the main= "+min);
    }
}
