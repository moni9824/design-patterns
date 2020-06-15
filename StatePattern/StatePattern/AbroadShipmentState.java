public class AbroadShipmentState implements ShipmentState {
    

    @Override
    public void send() {
        System.out.println("Good! You choose to send a shipment to another country! Give me your phone number, please.");
    }
    
    @Override
    public void pick() {
        System.out.println("Great! You choose to pick your shipment from another country! Wait a second!");
    }

}
