public class CannotRideException extends Exception {
    private static final String MESSAGE = "NO TENES SALDO SUFICIENTE";

    public CannotRideException(){
        super(MESSAGE);
    }
}
