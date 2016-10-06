import java.util.*;

public class UserModel
{

	private static LinkedList<UserModel> users = new LinkedList<UserModel>();
	private static nextID = 0;
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

	public static UserModel getUser(int id)
	{
		for(UserModel u: users)
			if(u.getID() == id)
				return u;

		return null;
	}

	public static void addUser(String n, String p)
	{
		users.add(new UserModel(n,p));
	}

	public static UserModel authUser(String n, String p)
	{
		for(UserModel u: users)
			if(u.getName().equals(n) && u.pass.equals(p))
				return u;

		return null;
	}

	private String name;
	private String pass;
	private LinkedList<ChatterModel> chatters;
	private int ID;

	public UserModel(String n, String p)
	{
		name = n;
		pass = p;
		ID = nextID++;
		chatters = ChatterModel.getChattersofUser(this);
	}
	public String getName(){return name;}
	public int getID(){return ID;}
	public LinkedList<ChatterModel> getChatters(){return chatters;}

}