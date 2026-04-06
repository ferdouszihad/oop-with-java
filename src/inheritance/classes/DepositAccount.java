package inheritance.classes;

public class DepositAccount extends Account{
    int depoAmount;
    int year;
    public DepositAccount(int accNo, String accName,int depoAmount , int year) {
        super(accNo, accName);
        this.depoAmount=depoAmount;
        this.year=year;
    }

    void makeDeposit(){
        System.out.println("Make Deposit Amount ");
    }
    void breakDeposit(){
        System.out.println(" Deposit Amount Break and withDraw ");
    }
}
