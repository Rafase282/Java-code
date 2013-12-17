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
public class StudentPerson extends Person implements Student {

	private final int id;
	private static int nextId =0;


	/**
	 * @param name
	 * @param birhYear
	 */
	public StudentPerson(String name, int birhtYear) {
		super(name, birhtYear);
		id = nextId();
	}
	
	@Override 
	public int getStudentId(){
		return id;
	}
	
	static int nextId(){
		return nextId++;
	}
	

}
