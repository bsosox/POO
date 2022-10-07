package Ej7;

public abstract class BankAccount {
    private int id;
    protected double balance;

    protected BankAccount(int id){
        this.id = id;
    }

    public double deposit(double amount){
        return balance += amount;
    }
    public double extract(double amount){
        if(canExtract(amount)){
            return balance -= amount;
        }
        return balance;
    }

    protected abstract boolean canExtract(double amount);

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return String.format("Cuenta %d con saldo %.2f", id, balance);
    }
}

