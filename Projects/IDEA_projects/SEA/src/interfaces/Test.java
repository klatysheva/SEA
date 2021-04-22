package interfaces;

public class Test {
    public static void main(String[] args) {
      PersonsInterface interface1 = new PersonsGroupNew(); //VerwaltungsInterface
      PersonsGroupNew interface2 = new PersonsGroupNew();
      PersonsGroup interface3 = new PersonsGroup();

      Person person1 =new Person(); //Teilnehmer
      person1.setName("Alex"); //setVorname
      person1.setSurname("Anderson"); //setNachname
      Person person2 =new Person();
      person2.setName("Anthony ");
      person2.setSurname("Clark");
      Person person3 =new Person();
      person3.setName("John");
      person3.setSurname("Robinson");

      interface1.addPerson(person1); //anmelden
      System.out.println(interface1.getPerson(1)); //getTeilnehmer
      System.out.println(interface1.personsCount()); // teilnehmerAnzahl oder so
      System.out.println(interface1.deletePerson(person1)); //abmelden

      interface2.addPerson(person2);
      System.out.println(interface2.getPerson(0));
      interface2.personsCount();
      System.out.println(interface2.personsCount());
      System.out.println(interface1.deletePerson(person2));

      interface3.addPerson(person3);
      System.out.println(interface3.getPerson(1));
      interface3.personsCount();
      System.out.println(interface3.personsCount());
      System.out.println(interface3.deletePerson(person1));


    }
}
