public class AbroadWorker extends Workers
{
/ **
     * If the advisor is available, the advisor will answer, otherwise,
     * the request will be transferred to another advisor
     * /

    public void contact(){
        if(getAvailable()){
            System.out.println("Hello and welcome to our office!"+
            "I am responsible about shipments all around the world!" +
            "My name is George, do you want to send or receive a shipment?");
        }else{
            getNext().contact();
        }
    } 
}
