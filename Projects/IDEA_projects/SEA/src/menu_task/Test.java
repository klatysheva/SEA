package menu_task;

public class Test {
    public static void main(String[] args) {
        PersonsMenu menu = new PersonsMenu();
        IList list = new PersonsList();
        menu.setList(list);
        menu.selectOption();
    }
}
