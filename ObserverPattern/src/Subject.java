import java.util.ArrayList;


public class Subject {

   
	public ArrayList observerCollection;

    {
        observerCollection = new ArrayList();
    }

    public void registerObserver(Observer observer){
        observerCollection.add(observer);
    }

    public void deRegisterObserver(Observer observer){
        observerCollection.remove(observer);
    }

    public void notifyObservers(String message){
        observerCollection.forEach(observer -> ((Observer)observer).notify(message));
    }

}