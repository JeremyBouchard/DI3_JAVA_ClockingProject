package controler;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import model.Company;
import model.Department;
import model.Employee;
import model.Person.gender;
import view.GUI;


public class CompanyManager {

	public static void main(String[] args) {

		/*Employee Employee1 = new Employee("beta","testeur",gender.Male,"test@test.com", LocalDate.now(),
				new Department(),LocalTime.now(),LocalTime.now(), 42);

		System.out.println(Employee1.getDepartureTime());*/

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			
		}

		Department testDepartment = new Department ("Beta Depatment");
		Company company = Company.getInstance();
		company.addDepartment(testDepartment);
		
		Employee testEmployee = new Employee("beta","testeur",gender.Female,"test@test.com", LocalDate.now(),testDepartment,LocalTime.now(),LocalTime.now(), 42);
		company.addEmployee(testEmployee);
		
		GUI gui1=new GUI();
		gui1.pack();

	}
}
