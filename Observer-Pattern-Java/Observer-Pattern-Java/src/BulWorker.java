public class BulWorker implements Observer {

    @Override
    public void update(boolean inProgress) {
        if (inProgress){
            System.out.println("You want to send shipment somewhere in Bulgaria? Lets proceed!");
        }
        else {
            System.out.println("You want to pick your shipment from Bulgaria? Right away!");
        }

    }
}
