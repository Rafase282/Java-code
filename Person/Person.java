/**
 * 
 */
package people;

import java.util.List;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class Person {
	
	private String name;
	private final int birthYear;

	public Person(String name, int birthYear) {
		this.name      = name;
		this.birthYear = birthYear;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newname){
		name = newname;
	}
	
	public int age(){
		return thisYear - birthYear;
	}
	
	private static int thisYear = 2012;
	
	public static void newYear(){
		thisYear++;
	}
	
	static void printClassList(List<Student> classlist){
		for (Student student : classlist) {
			Person person = (Person) student;
			System.out.println(person.getName() + "\t" + student.getStudentId());
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
