package arrays.task_persons;

public class PersonsGroup {
    private Person[] persons = new Person [5];

    public boolean deletePerson (Person person) {
        System.out.println("############### Delete person: ######################");
        if (person == null) {
            System.out.println("It's null. Can't be deleted.");
            return false;
        }
        int i = 0;
        while (!(persons[i].equals(person) || i == (persons.length-1))) i++;
        if (person.equals(persons[i])) {
            persons[i] = null;
            System.out.println("Deleting element #" + i +"...");
            for (int j = i; j<(persons.length-1); j++) {
                persons [j] = persons [j+1];
            }
            persons [persons.length-1] = null;
            System.out.println("Element #" + i + " is deleted.");
            return true;
        }
        System.out.println("Element not found");
        return false;
    }

    public boolean addPerson (Person person) {
        System.out.println("############### Add person: #########################");
        if (person == null) {
            System.out.println("It's null. Can't be added.");
            return false;
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].equals(person)) {
                System.out.println("Person is already in the list by #" + (i+1) + ". Can't be added.");
                return false;
            }
        }
        if (personsCount() < persons.length ) {
            persons [personsCount()] = person;
            System.out.println(person.getSurname() + " " + person.getName()  + " added to the list under #" + personsCount() + ".");
            return true;
        }
        else {
            System.out.println("List is full. All " + persons.length + " places are taken.");
            return false;
        }
    }
    public int personsCount () {
        int i =0;
        while (i < persons.length && persons[i]!=null ) i++;
        return i;
    }

    public void showPersonsCount () {
        System.out.println("List contains " + personsCount() + " person(s).");
    }

    public Person getPerson (int i) {
        System.out.println(persons[i-1]);
        return persons[i-1];
    }
    public  void showFullPersonsList() {
        System.out.println("############### Persons List(+nulls and references) #");
        for (int i = 0; i < persons.length; i++){
            System.out.print((i+1) + ". " + persons[i]);
            if (persons[i] != null) {
                System.out.println(": " + persons[i].getSurname() + " " + persons[i].getName());
            }
            else {
                System.out.println();
            }
        }
        System.out.println("Persons count: " + personsCount() + ".");

    }
    public  void showPersonsList () {
        System.out.println("############### Persons List  #######################");
        for (int i = 0; i < persons.length; i++){
            if (persons[i] != null) {
                System.out.println((i+1) + ". " + persons[i].getSurname() + " " + persons[i].getName());
            }
        }
        System.out.println("Persons count: " + personsCount() + ".");

    }

}
