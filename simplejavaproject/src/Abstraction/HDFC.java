package Abstraction;

public class HDFC extends BANK{
    public static void main(String[] args) {
        HDFC hdfc =new HDFC();
        hdfc.bankname= "HDFC";
        hdfc.displayBank();
        hdfc.displayDeno();



}
@Override
    void displayBank() {
        System.out.println("Bank name is: " + bankname);
    }
    void displayDeno(){
        System.out.println("In SBI, denominations available are Rs 200/-,Rs 500/-,1000/- and 2000/-");
    }

}