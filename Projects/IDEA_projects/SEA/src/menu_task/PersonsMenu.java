package menu_task;

import java.util.Scanner;

public class PersonsMenu implements IMenu{
    private IList list;

    @Override
    public void setList(IList list) {
        this.list = list;
        System.out.println("setList successful. list: " + list);
    }

    @Override
    public void selectOption() { //keepAsking
        showMenu();
        checkMenu();
    }

    public void showMenu() {
        System.out.println("1 - show menu");
        System.out.println("2 - input person");
        System.out.println("3 - list all persons");
        System.out.println("4 - remove all");
        System.out.println("0 - exit");

    }

    public String inputMenu() {
        String result = "";
        System.out.println("Enter your number. To see all options input 1.");
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextLine();
        return result;
    }

    public void checkMenu() {
        var result = "";
        do {
            result = inputMenu();
            switch (result) {
                case "1":
                    System.out.println("It's 1. Show menu.");
                    showMenu();
                    break;
                case "2":
                    System.out.println("It's 2. Input person.");
                    inputPerson();
                    break;
                case "3":
                    System.out.println("It's 3. List all persons.");
                    listAllPerson();
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
        }
        while (!result.equals("0"));
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

    public  void listAllPerson() {
//        System.out.println("############### Persons List  #######################");
//        for (int i = 0; i < list.length; i++){
//            if (list[i] != null) {
//                Person person = (Person) list[i];
//                System.out.println((i+1) + ". " + person.getSurname() + " " + person.getName());
//            }
//        }
//        System.out.println("Persons count: " + size() + ".");
//        System.out.println();
    }

//    public int size() {
//        int i =0;
//        while (i < list.length && list[i]!=null ) i++;
//        return i;
//    }
//
    public void removeAll () {
//        System.out.println("############### Clear list: #########################");
//        if (size() == 0) {
//            System.out.println("List is already leer. Nothing to clear." );
//            return;
//        }
//        //list = new PersonsList();
//        System.out.println("All elements are removed from the list. List is leer now.");
//        System.out.println();
    }
}
