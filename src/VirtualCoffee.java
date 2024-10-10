public class VirtualCoffee {
    public static void serveCustomer(VirtualPerson cust,CoffeeCup cup) throws UnusualTasteException {
        try{
            cust.drinkCoffee(cup);
            System.out.println("coffee is just right");
        }
        catch (ToolColdException ex){
            System.out.println("Coffee too cold!");
        }
        catch (TemperatureException e){
            System.out.println("There's a temperature trouble in this coffee!");
        } finally {
            System.out.println(cust);
        }
    }
}
