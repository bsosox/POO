public class SubwayCardTester {

    public static void main(String[] args) {
            SubwayCentral sc = new SubwayCentral(25);
            FixedSubwayCard fsc = new FixedSubwayCard(sc, 2);
        try {
            fsc.ride();
            fsc.ride();
            fsc.ride(); // Imprime un mensaje de error
        } catch (CannotRideException ex) {
            System.out.println(ex.getMessage());
        }
            RechargeableSubwayCard rsc = new RechargeableSubwayCard(sc);
        try {
            rsc.recharge(50);
            rsc.ride();


            sc.setRideCost(30);

            rsc.ride(); // Imprime un mensaje de error
        } catch (CannotRideException ex) {
            System.out.println(ex.getMessage());
        }
            DiscountRechargeableSubwayCard drsc = new DiscountRechargeableSubwayCard(sc, 0.50);
        try {
            drsc.recharge(-10);

            drsc.ride();
            drsc.ride();
            drsc.ride(); // Imprime un mensaje de error
        } catch (CannotRideException ex) {
            System.out.println(ex.getMessage());
        }
            DiscountRechargeableSubwayCard drsc2 = new DiscountRechargeableSubwayCard(sc, 0.50);
            drsc2.recharge(-10);
            System.out.println("Fin");

    }
}
