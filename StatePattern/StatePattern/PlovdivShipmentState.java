public class PlovdivShipmentState implements ShipmentState {

    @Override
    public void send() {
        System.out.println("You want to send a shipment in Plovdiv! Of course, wait a second.");
    }

    @Override
    public void pick() {
        System.out.println("You want to pick your shipment from Plovdiv. In a minute!");
    }
}
