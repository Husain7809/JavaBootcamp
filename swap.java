import java.util.*;

class swap
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        System.out.print("Enter the first number => ");
        int no1=s1.nextInt();
        System.out.print("Enter the second number => ");
        int no2=s1.nextInt();

        System.out.println("Before number");
        System.out.println("No1 = "+no1+" No2 = "+no2);

        int temp;
        temp=no1;
        no1=no2;
        no2=temp;

        System.out.println("After swap number");
        System.out.println("No1 = "+no1+" No2 = "+no2);
    }
}