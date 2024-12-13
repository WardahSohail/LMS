package Library;

import javax.swing.JFrame;

public class NormalUser extends User {

	public NormalUser(String name) {
		super(name);
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new Search(),
		};
	}
	
	public NormalUser(String name, String email, String phonenumber) {
		super(name, email, phonenumber);
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new Search(),
		};
	}
	
	@Override
	public void menu(Functionalities database, User user) {
		
		String[] data = new String[7];
		data[0] = "View Books";
		data[1] = "Search";
		
		JFrame frame = this.frame(data, database, user);
		frame.setVisible(true);
	}
	
	public String toString() {
		return name+"<N/>"+email+"<N/>"+phonenumber+"<N/>"+"Normal";
	}
	
}
