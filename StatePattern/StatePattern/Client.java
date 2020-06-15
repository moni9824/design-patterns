public class Client {
    
    ShipmentState state;
    
    public void setState(ShipmentState state) {
        this.state = state;
    }
    
    public void ShipmentStart() {
        setState(new ShipmentStartState());
        System.out.println("\n-----Welcome to our office! Lets procide with your shipment! Send or pick ?-----\n");
    }
    
    public void ShipmentOver(){
        setState(new ShipmentOverState());
        System.out.println("\n-----Thank you for choosing our service! Have a happy day!-----\n");
    }
    
        public void send(){
        state.send();
    }

    public void pick(){
        state.pick();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.ShipmentStart();
        client.send();
        client.pick();
        client.ShipmentOver();
    }
}
