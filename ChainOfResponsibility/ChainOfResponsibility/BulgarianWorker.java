public class BulgarianWorker extends Workers
{
    public void contact(){
        if(getAvailable()){
            System.out.println("Welcome!"+
            "I am Kalina, do you want to receive or send shipment in Bulgaria?");
        }else{
            getNext().contact();
        }
    } 
}
