import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {

    private List<Observer> workers = new ArrayList<Observer>();

    private boolean inProgress;

    public boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        workers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        workers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer worker: workers){
            worker.update(this.isInProgress());
        }
    }
}
