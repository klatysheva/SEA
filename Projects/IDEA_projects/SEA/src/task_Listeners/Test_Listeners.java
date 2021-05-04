package task_Listeners;

public class Test_Listeners {
    public static void main(String[] args) {
        Person person1 = new Person("Antony", "Walker");
        Person person2 = new Person("Alex", "Anderson");
        Event eventTest = new Event("test event");

        PersonsList list1 = new PersonsList(2); //implements IList, IEventRegistration
        IEventListener eventListener = new PersonsMenu(list1); //implements IMenu, IEventListener
        list1.subscribe(eventListener);

        list1.add(person1); //IList
        list1.add(person2); //IList

        list1.subscribe(eventListener); //IEventRegistration

        PersonsMenu personsMenu = new PersonsMenu(list1);
        personsMenu.showList(); //IMenu
        personsMenu.selectOption(); //IMenu
        personsMenu.receive(eventTest);

    }
}
