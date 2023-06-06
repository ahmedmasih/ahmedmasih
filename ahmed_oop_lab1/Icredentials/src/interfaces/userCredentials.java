package interfaces;
import model.Employee;
public interface userCredentials {
	
	public String generateEmailAdderess(String firstName, String lastName, String department);
	
	public String generatePassword();
	
	public void showCredentials(Employee emp);

}
