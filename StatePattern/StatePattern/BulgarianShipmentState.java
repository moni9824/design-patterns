public class BulgarianShipmentState implements ShipmentState {

    
    @Override
    public void send() {
        System.out.println("You want to send shipment to a city in Bulgaria? In a second!");
    }
    
    @Override
    public void pick() {
        System.out.println("You want to pick your order from Bulgaria? Great!");
    }
}
