public class PldWorker implements Observer {

    @Override
    public void update(boolean inProgress) {
        if (inProgress){
            System.out.println("You want to send shipment in Plovdiv? Of course!");
        }
        else {
            System.out.println("You want to pick your shipment from Plovdiv? Wait a second!");
        }

    }
}
