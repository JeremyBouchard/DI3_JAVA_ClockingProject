//test git

package controler;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import view.GUI;


public class Clocking {

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
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
	GUI gui1=new GUI();
	gui1.pack();
	//gui1.setVisible(true);
	System.out.println("end");
}
}
