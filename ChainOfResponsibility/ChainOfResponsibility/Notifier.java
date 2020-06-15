public abstract class Notifier {
    
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }
    
    public void setNextNotifier(Notifier nextNotidier){
        this.nextNotifier = nextNotifier;
       
    }
    
  
    public abstract void write(String message);
    
}
