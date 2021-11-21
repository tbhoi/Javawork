package Abstraction;

public class CITY extends BANK{
    public static void main(String[] args) {
        CITY hdfc =new CITY();
        hdfc.bankname= "CITY";
        hdfc.displayBank();
        hdfc.displayDeno();


    }
    @Override
    void displayBank() {
        System.out.println("Bank name is: " + bankname);
    }
    void displayDeno(){
        System.out.println("In SBI, denominations available are Rs 500/-,1000/- and 2000/-");
    }
}
