import java.util.*;

public class UserModel
{

	private static LinkedList<UserModel> users = new LinkedList<UserModel>();
	private static int nextID = 0;
	public static void Init()
	{
		//init static variables here from Database
	}

	public static int getNextID(){return nextID;}
	
	public static UserModel getUser(String n)
	{
		for(UserModel u: users)
			if(u.getName().equals(n))
				return u;

		return null;
	}

	public static UserModel getUser(int id)
	{
		for(UserModel u: users)
			if(u.getID() == id)
				return u;

		return null;
	}

	public static void addUser(UserModel user)
	{
		users.add(user);
	}

	public static UserModel authUser(String n, String p)
	{
		for(UserModel u: users)
			if(u.getName().equals(n) && u.pass.equals(p))
				return u;

		return null;
	}

	public String name;
	private String pass;
	public String chatter;
	public int ID;

	public UserModel(String n, String p)
	{
		name = n;
		pass = p;
		ID = nextID++;
		chatter = "Click Edit!";
	}
	public String getName(){return name;}
	public int getID(){return ID;}
	public String getChatter(){return chatter;}

}