package OopsPolymorphism;

import java.util.Scanner;

public class AddTwo {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        AddTwo a = new AddTwo();
        a.add(num1,num2);
        a.add("Very","Good");
    }
public void add(int num1, int num2){
        int sum= num1 + num2;
    System.out.println("Sum of two numbers is : " +sum);
}
public void add(String str1, String str2){
        String addstr = str1+ str2;
    System.out.println("String is : "+addstr);
}

}