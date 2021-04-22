package interfaces;

public interface PersonsInterface {
    /* person: reference to Person (null is not allowed)
    * duplicated not allowed
    * works when personsCount < persons.length
    */
    boolean addPerson(Person person); //

    int personsCount ();

    //works when 0 < i <= personsCount
    Person getPerson (int i);

    /* person: reference to Person (null is not allowed)
     * works when person is present in persons[]
     */
    boolean deletePerson(Person person);
}
