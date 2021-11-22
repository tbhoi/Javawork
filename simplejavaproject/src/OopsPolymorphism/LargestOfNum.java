package OopsPolymorphism;
import java.util.Scanner;
public class LargestOfNum {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        System.out.println("Enter third number: ");
        num3 = input.nextInt();
        LargestOfNum n= new LargestOfNum();
        n.LargestNum(num1,num2);
        n.LargestNum(num1,num2,num3);
    }
        public void LargestNum(int num1,int num2) {

            if (num1 > num2) {
                System.out.println("Largest of two number is: "+ num1 );
            } else
                System.out.println("Largest of two number is: "+ num2);
        }
        public void LargestNum(double num1,double num2,double num3){
         if(num1>num2 && num1>num3){
             System.out.println("Largest of three number is: "+ num1);
         }
         if(num2>num1 && num2>num3){
             System.out.println("Largest of three number is: "+ num2);
         }
         else {
             System.out.println("Largest of three number is: "+ num3);
            }
        }
    }


