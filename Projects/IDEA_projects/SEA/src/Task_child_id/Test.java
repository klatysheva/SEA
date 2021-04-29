package Task_child_id;

public class Test {
    public static void main(String[] args) {
        PersonsMenu menu = new PersonsMenu();
        IList list = new PersonsList();

        Person person = new Person("Ann", "Walker");
        Person person1 = new Person("Alex", "Anderson");
        Person person2 = new Person("Anthony", "Clark");

        Person person3 = new Person();

        System.out.println("Person getId: " + person.getId());
        System.out.println("Person1 getId: " + person1.getId());

        System.out.println("Person toString: " + person.toString());;
        System.out.println("Person1 toString: " + person1.toString());;
    }
}
