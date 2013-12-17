/**
 * 
 */
package people;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class StudentEmployeePerson extends Person implements Student, Employee{

	private final int id;
	private String title;
	private final String ssn;

	/**
	 * @param name
	 * @param birthYear
	 * @param ssn
	 */
	public StudentEmployeePerson(String name, int birthYear, String ssn) {
		super(name, birthYear);
		id       = StudentPerson.nextId();
		this.ssn = ssn;
	}

	public int getStudentId() {
		return id;
	}

	public String getSSN() {
		return ssn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
