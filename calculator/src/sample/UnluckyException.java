package sample;

public class UnluckyException extends Exception {
    public UnluckyException(){}

    public UnluckyException (String message) {
        super (message);
    }

    public UnluckyException (Throwable cause) {
        super (cause);
    }

    public UnluckyException (String message, Throwable cause) {
        super (message, cause);
    }

}
