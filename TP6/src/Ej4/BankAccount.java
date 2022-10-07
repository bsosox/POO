package Ej4;

import java.util.Objects;

public abstract class BankAccount {

    private final int id;
    protected double balance;

    protected BankAccount(int id) {
        this.id = id;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double extract(double amount) {
        if(canExtract(amount)) {
            return balance -= amount;
        }
        return balance;
    }

    protected abstract boolean canExtract(double amount);

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Cuenta %d con saldo %.2f", id, balance);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof BankAccount)){
            return false;
        }
        BankAccount aux = (BankAccount) o;
        return Integer.compare(this.id, aux.id) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
