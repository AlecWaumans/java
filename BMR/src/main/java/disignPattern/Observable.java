package disignPattern;

public interface Observable {
    public void registerObserver(Observer obs);

    public void removeObserver(Observer obs);

    public void notifyObservers();


}
