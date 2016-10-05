import java.util.*;

public class UserModel
{

	static LinkedList<UserModel> users = new LinkedList<UserModel>();
	static nextID = 0;
	public static void Init()
	{
		//init static variables here from Database
	}
	public static UserModel getUser(String n)
	{
		for(UserModel u: users)
			if(u.getName().equals(n))
				return u;

		return null;
	}
	public static void addUser(String n, String p)
	{
		users.add(new UserModel(n,p));
	}

	String name;
	String pass;
	LinkedList<ChatterModel> chatters;
	int ID;

	public UserModel(String n, String p)
	{
		name = n;
		pass = p;
		ID = nextID++;
		chatters = ChatterModel.getChattersofUser(this);
	}
	public String getName(){return name;}
	public String getPass(){return pass;}
	public int getID(){return ID;}
	public LinkedList<ChatterModel> getChatters(){return chatters;}

}