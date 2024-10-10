public abstract class TemperatureException extends Exception {
    private int temperature;
    public TemperatureException(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    public TemperatureException() {
        super();
    }
    public TemperatureException(String message) {
        super(message);
    }
    public TemperatureException(String message, Throwable cause) {
        super(message, cause);
    }

}
