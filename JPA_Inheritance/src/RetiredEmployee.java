import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Retired")
public class RetiredEmployee extends Employee{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int e_pension;
	
	public RetiredEmployee(int e_id, String e_name, int e_pension) {
		super(e_id, e_name);
		this.e_pension = e_pension;
	}

	public int getE_pension() {
		return e_pension;
	}

	public void setE_pension(int e_pension) {
		this.e_pension = e_pension;
	}
	
	
}
