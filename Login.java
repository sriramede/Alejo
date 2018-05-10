import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Login {

	List<User> userlist;
	
	public void createuser() {
		
		userlist=new ArrayList<>();
		
		//get data from text fiilds from the user
		
		userlist.add(new User(1,"sri ram","sriede","123"));
		
	}
	
	public void verifyuser(String username,String password) {
		String usernam=username;
		String passwor=password;
		
		for(int i=0;i<userlist.size();i++) {
			
			if(userlist.get(i).getUsername().equals(usernam) && userlist.get(i).getPassword().equals(passwor)) {
				System.out.println("We are in");
			}
			else {
				System.out.println("we are out");
			}
		}
	
	}
	
}
