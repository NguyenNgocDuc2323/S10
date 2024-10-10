public class Example {
    public static void main(String[] args) throws TemperatureException {
        CoffeeCup cup = new CoffeeCup();
        try{
            VirtualPerson cust = new VirtualPerson();
            VirtualCoffee.serveCustomer(cust,cup);
        }
        catch (UnusualTasteException e){
            System.out.println("The Coffee has an unusual taste.");
        }
    }
}
