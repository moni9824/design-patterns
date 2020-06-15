public class PlovdivWorker extends Workers
{
    public void contact(){
        if(getAvailable()){
            System.out.println("Good day"+
            "Ivan here, i am representing the shipments in Plovdiv!"
            + "Receive or send a shipment?");
        }else{
            getNext().contact();
        }
    } 
}