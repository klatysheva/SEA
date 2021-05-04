package task_Listeners.Listeners;

public class MyObserver implements Observer {
    @Override
    public void onSomethingHappened(String whatHappened) {
        System.out.println(whatHappened);
    }
}
