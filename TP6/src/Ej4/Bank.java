package Ej4;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accountList = new ArrayList<>();

    public Bank(){

    }

    public void addAccount(BankAccount c){
        if(!accountList.contains(c)){
            accountList.add(c);
        }
    }

    public int accountSize(){
        return accountList.size();
    }

    public double totalAmount(){
        double totalAmount = 0.0;
        for(BankAccount c : accountList){
            totalAmount += c.getBalance();
        }
        return totalAmount;
    }

    public void removeAccount(BankAccount c){
        accountList.remove(c);
    }


}
