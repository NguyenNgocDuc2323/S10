public class VirtualPerson {
    private static final int tooCold = 65;
    private static final int tooHot = 85;
    public void drinkCoffee(CoffeeCup cup) throws TooHotException,ToolColdException{
        int temperature = cup.getTemperature();
        if(temperature <= tooCold){
            throw new ToolColdException();
        }
        else if(temperature >= tooHot){
            throw new TooHotException();
        }
    }
}
