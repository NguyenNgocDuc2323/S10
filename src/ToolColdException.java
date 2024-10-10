public class ToolColdException extends TemperatureException{
    public ToolColdException(){
        super();
    }
    public ToolColdException(String message){
        super(message);
    }
    public ToolColdException(String message, Throwable cause){
        super(message,cause);
    }
    public ToolColdException(int temperature){
        super(temperature);
    }
}
