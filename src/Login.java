import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Login {

	static List<User> userlist = new ArrayList<>();

	public void createuser() {

		

		// get data from text fiilds from the user

		userlist.add(new User(1, "sri ram", "sriede", "123"));

	}

	public void createuser1(int id, String name, String username, String password) {

		int userid = id;
		String newname = name;
		String uname = username;
		String pwrd = password;
		

		userlist.add(new User(userid, newname, uname, pwrd));

	}

	public void verifyuser(String username, String password) {
		String usernam = username;
		String passwor = password;

		if (userlist.get(0).getUsername().equals(usernam) && userlist.get(0).getPassword().equals(passwor)) {
			System.out.println("We are in");
			JOptionPane.showMessageDialog(null, "welcome to login screen");
		}

	}

	public void showuseres() {
	if(userlist.size()==0)	{
			System.out.println("none");
		}
		
			for(int i=0;i<userlist.size();i++) {
				
				System.out.println(userlist.get(i).getName());
			}
			
			
		
	}
	
	public void removeuser(String name) {
		
	for(int i=0;i<userlist.size();i++) {
		
		if(userlist.get(i).getName().equals(name)) {
			
			userlist.remove(i);
		}
		
	}	
	}

}
