package Abstraction;

public class SBI extends BANK{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.bankname ="SBI";
        sbi.displayBank();
        sbi.displayDeno();
        
    }

    @Override
    void displayBank() {
        System.out.println("Bank name is: " + bankname);
    }
    void displayDeno(){
        System.out.println("In SBI, denominations available are Rs 100/-,Rs 200/-,Rs 500/-,1000/- and 2000/-");
    }

}
