import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {

	public static void main(String[] args) {
		
				ArrayList<Person> persons = new ArrayList<Person>();
				persons.add(new Person("AB", "CD", "10", "50000"));
				persons.add(new Person("XZ", "VM", "12", "40000"));
				persons.add(new Person("MN", "LX", "14", "60000"));
		 
				ArrayList<Person> persons2 = (ArrayList<Person>) persons.clone();
				
				Comparator<Person> c1 = new Comparator<Person>(){
					public int compare(Person p1, Person p2 ) {
					return p1.lastName.compareTo(p2.lastName);	
					}
				};
				Collections.sort(persons, c1);
				System.out.println(persons);
			
	Comparator<Person> c2 = (Person p1, Person p2) -> p1.lastName.compareTo(p2.lastName);
	Collections.sort(persons2, c2);
	System.out.println(persons2);
	
	
	Comparator<Person> c3 = (Person p1, Person p2) -> p1.firstName.compareTo(p2.firstName);
	Collections.sort(persons2, c3);
	System.out.println(persons2);
	
	Comparator<Person> c4 = (Person p1, Person p2) -> p1.age.compareTo(p2.age);
	Collections.sort(persons2, c4);
	System.out.println(persons2);
	
	Comparator<Person> c5 = (Person p1, Person p2) -> p1.salary.compareTo(p2.salary);
	Collections.sort(persons2, c5);
	System.out.println(persons2);

		}
}
	
