package DataPlan;

public class Client {
    private int GBSpent = 0;
    DataPlan plan;
    String name;

    public Client(String name, DataPlan plan){
        this.name = name;
        this.plan = plan;
    }

    public int total(){
        return plan.getTotal();
    }
}
