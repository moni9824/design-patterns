public class AbWorker implements Observer {

    @Override
    public void update(boolean inProgress) {
        if (inProgress){
            System.out.println("You want to send shipment to another country? Wait a second!");
        }
        else {
            System.out.println("You want to pick your shipment from another country? Give me your ID card, please!");
        }

    }
}
