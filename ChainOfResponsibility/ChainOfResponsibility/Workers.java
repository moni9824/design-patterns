public abstract class Workers
{
    private Workers nextWorker; //Advisor to be contacted in case this is not available
    private boolean available = true; // By default each advisor is available once created

  
    / **
     * Define the next advisor to contact
     * /

    public void setNext(Workers nextWorker){
        this.nextWorkder = nextWorker;
    }
    

    / **
     * Get the following advisor to contact
     * / 

    public Workers getNext(){
        return this.nextWorker;
    }
    

    / **
     * Set your availability to true / false
     * /

    public void setAvailable(boolean availab){
        this.available = availab;
    }
    

   / **
     * Get availability
     * /

    public boolean getAvailable(){
        return this.available;
    }
    

   / **
     * Method to try to establish connection with this advisor
     * /

    abstract public void contact();
}
