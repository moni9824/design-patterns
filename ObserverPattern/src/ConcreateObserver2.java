public class ConcreateObserver2 implements Observer {

    public void notify(String message) {
        System.out.print("Meesage recieved in ConcreateObserver2 : "+message+"\n");
    }
}