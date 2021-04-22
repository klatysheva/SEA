package interfaces;

public class PersonsGroupNew implements PersonsInterface{

	Person [] seminarTeilnehmer = new Person[5];
	
	public boolean addPerson( Person einTeilnehmer ) { // Anmelden und Rückgabe der AnmeldeNr.
		if (this.seminarTeilnehmer[ personsCount() ] == null)
		{
			this.seminarTeilnehmer[ personsCount() ] = einTeilnehmer; // keine Angabe der Klasse, da automatisch
			return true;
		}
		else 
			return false; 
	}

	public int personsCount() {
		int anz;
		System.out.println( "Länge des Arrays "+ this.seminarTeilnehmer.length); // nur zum Testen	
		for (anz = 0; ((anz < this.seminarTeilnehmer.length ) && ( this.seminarTeilnehmer[anz] != null )); anz++ ) {}
		System.out.println("anz = "+anz);
		return anz; // Ausgabe der belegten Länge des des Arrays über return
	}

	public Person getPerson( int i ) {
		if ( i < this.personsCount())
		   return this.seminarTeilnehmer[i];
		else 
			return null;	
	}

	public boolean deletePerson (Person person) {  // Methode noch nicht implementiert
		return false;
	}
}
