import java.util.Scanner;
public class average {
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("ENTER FIVE VALUES:");
    int num1=a.nextInt();
    int num2=a.nextInt();
    int num3=a.nextInt();
    int num4=a.nextInt();
    int num5=a.nextInt();
           int avg=(num1+num2+num3+num4+num5)/5;
        System.out.println( "THE AVERAGE OF THE FIVE NUMBERS IS ="+avg);    }
}
