public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        AbWorker AbroadShipments = new Worker();
        BulWorker BulgarianShipments = new Worker();
        PldWorker PlovdivShipments = new Worker();

        client.addObserver(AbroadShipments);
        client.addObserver(BulgarianShipments);
        client.addObserver(PlovdivShipments);

        client.setInProgress(false);
        client.notifyObserver();
        client.removeObserver(AbroadShipments);

    }
}
