public class ConcreateObserver1 implements Observer {


    public void notify(String message) {
        System.out.print("Meesage recieved in ConcreateObserver1 : "+message+"\n");
    }
}