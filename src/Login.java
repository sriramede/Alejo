import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Login {

	List<User> userlist;
	
	public void createuser() {
		
		userlist=new ArrayList<>();
		
		//get data from text fiilds from the user
		
		userlist.add(new User(1,"sri ram","sriede","123"));
		
	}
	
	public void createuser1(int id,String name,String username,String password) {
		
		int userid=id;
		String newname=name;
		String uname=name;
		String pwrd=password;
		
		
		while(userid==0||newname==null||uname==null||pwrd==null) {

					try {
						JOptionPane.showMessageDialog(null, "Please enter all values to registe");
					} catch (NullPointerException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "Please enter all values to registe");
						e.printStackTrace();
					}
		}
		userlist.add(new User(userid,newname,uname,pwrd));
		
	}
	
	public void verifyuser(String username,String password) {
		String usernam=username;
		String passwor=password;
		
		if(userlist.size()!=0) {
		
		for(int i=0;i<userlist.size();i++) {
			
			if(userlist.get(i).getUsername().equals(usernam) && userlist.get(i).getPassword().equals(passwor)) {
				System.out.println("We are in");
			}
			else {
				JOptionPane.showMessageDialog(null, "Please do register to reserve a room");
				System.out.println("we are out");
			}
		}
		}else {
			System.out.println("we do not have any user");
		}
	
	}
	
}
