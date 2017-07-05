
public class Person {

	public String firstName;
	public String lastName;
	public String age;
	public String salary;
	
	Person(String firstName, String lastName, String age, String salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	public String getSalary(){
		return salary;
	}
}
