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
public class EmployeePerson extends Person implements Employee{

	private final String ssn;
	private String title;

	public EmployeePerson(String name, int birthYear, String ssn) {
		super(name, birthYear);
		this.ssn = ssn;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getSSN() {
		return ssn;
	}

}
