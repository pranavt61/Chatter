import java.util.*;

public class ChatterModel
{
	static LinkedList<ChatterModel> chatters = new LinkedList<ChatterModel>();
	static int nextID = 0;
	public static LinkedList<ChatterModel> getChattersofUser(UserModel user)
	{
		LinkedList<ChatterModel> userChatters = new LinkedList<ChatterModel>();;
		for(ChatterModel c: chatters)
			if(user.getID() == c.getOwnerID())
				userChatters.add(c);
		return userChatters;
	}
	public static ChatterModel getChatter(int ID)
	{
		for(ChatterModel c:chatters)
			if(ID == c.getID())
				return c;
		return null;
	}

	int ID;
	int ownerID;
	String message;

	public ChatterModel(UserModel owner)
	{
		ID = nextID++;
		ownerID = ownerID.getID();
		message = "<p>Enter your Chatter here</p>";
	}
	public int getID(){return ID;}
	public int getOwnerID(){return ownerID;}
	public String getMessage(){return message;}

	public void setMessage(String m){message = m;}
}