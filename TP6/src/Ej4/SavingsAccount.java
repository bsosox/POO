package Ej4;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id) {
        super(id);
    }

    @Override
    protected boolean canExtract(double amount) {
        return balance - amount >= 0;
    }

}
