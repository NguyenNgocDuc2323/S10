public class TooHotException extends TemperatureException{
    public TooHotException(){
        super();
    }
    public TooHotException(String message) {
        super(message);
    }
    public TooHotException(String message, Throwable cause) {
        super(message, cause);
    }
    public TooHotException(int temperature) {
        super(temperature);
    }
}
