package menu_task;

import java.util.Scanner;

public class PersonsMenu implements IMenu{
    private IList list;

    @Override
    public void setList(IList list) {
        this.list = list;
        System.out.println("setList successful. list: " + list);
    }

    public void showMenu() {
        System.out.println("Select option:");
        System.out.println("1 - input person");
        System.out.println("2 - show size");
        System.out.println("3 - list all persons");
        System.out.println("4 - remove all");
        System.out.println("0 - exit");

    }

    public String inputLine() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextLine();
        return result;
    }

    public void selectOption() { //keepAsking
        String result;
        do {
            showMenu();
            result = checkMenu();
        }
        while (!result.equals("0"));
    }

    private String checkMenu() {
        String result;
        result = inputLine();
        switch (result) {
            case "1":
                System.out.println("It's 1. Input person.");
                inputPerson();
                break;
            case "2":
                System.out.println("It's 2. Show size.");
                showSize();
                break;
            case "3":
                System.out.println("It's 3. List all persons.");
                showList(); //listAllPerson
                break;
            case "4":
                System.out.println("It's 4. Remove all.");
                removeAll();
                break;
            case "0":
                System.out.println("It's 0. Exit.");
                break;
            default:
                System.out.println("Please chose an valid number. To show all options input 1. 0 to exit.");
        }
        return result;
    }

    public void inputPerson() {
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        Person person = new Person ();
        person.setName(name);
        person.setSurname(surname);
        list.add(person);
        System.out.println(name + " " + surname + " added.");

    }

    public void removeAll () {
        list.clear();
    }

    public  void showList() { //listAllPerson doesn't show last element
        System.out.println("############### Persons List  #######################");
        for (int i = 0; i < list.size();  i++){
            if (list.get(i) != null) {
                Person person = (Person) list.get(i);
                System.out.println((i+1) + ". " + person.getSurname() + " " + person.getName());
            }
        }
        System.out.println("Persons count: " + list.size() + ".");
        System.out.println();
    }

    public void showSize() {
        System.out.println("There are " + list.size() + " element(s) in the list.");
        System.out.println();
    }

//    public  void showFullList() {
//        System.out.println("############### Persons List(+nulls and references) #");
//        for (int i = 0; i < list.size(); i++){
//            Person person = (Person) list.get(i);
//            System.out.print((i+1) + ". " + person);
//            if (list.get(i) != null) {
//                System.out.println(": " + person.getSurname() + " " + person.getName());
//            }
//            else {
//                System.out.println();
//            }
//        }
//        System.out.println("Persons count: " + list.size() + ".");
//        System.out.println();
//    }
}
