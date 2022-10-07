package DataPlan;

import javax.xml.crypto.Data;

public enum DataPlan {
    PREPAGO(0, 0),
    BASICO(100, 10) {
        public int extraGB(int GBSpent){
            return GBSpent - 1;
        }
    },
    PREMIUM(280, 8) {

    },
    UNLIMITED(500, 0) {

    }
    
    private int price;
    private int extraGBPrice;

    DataPlan(int planPrice, int extraGBPrice){
        this.price = planPrice;
        this.extraGBPrice = extraGBPrice;
    }
    public abstract int extraGB(int GBSpent);
    
    public int getPrice(){
        return this.price;
    }

    public int getTotal(){
        return this.price + extraGB(GBSpent)*this.extraGBPrice();
    }

}
