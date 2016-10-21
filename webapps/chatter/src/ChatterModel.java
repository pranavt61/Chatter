import java.util.*;

public class ChatterModel
{
	public static LinkedList<ChatterModel> chatters = new LinkedList<ChatterModel>();
	static int lastID = 0;

	public static ChatterModel[] getUserChatters(UserModel user)
	{
		ChatterModel[] userChatters = new ChatterModel[user.numChatters];
		int chatterCounter = 0;

		for(ChatterModel c: chatters)
		{
			if(chatterCounter >= user.numChatters)
				break;

			if(c.getOwnerID() == user.ID)
				userChatters[chatterCounter++] = c;
		}

		if(chatterCounter == 0)
			return null;
		else 
			return userChatters;
	}

	public static ChatterModel getChatterByID(UserModel user, int id)
	{
		for(ChatterModel c: chatters)
			if(c.chatterID == id && user.ID == c.ownerID)
				return c;

		return null;
	}

	public String title;
	public String message;
	public int chatterID;
	int ownerID;

	public ChatterModel(UserModel user, String t, String m)
	{
		title = t;
		message = m;
		chatterID = lastID++;
		ownerID = user.ID;

		chatters.add(this);
	}

	public int getID(){return chatterID;}
	public int getOwnerID(){return ownerID;}

	public void setTitle(String t){title = t;}
	public void setMessage(String m){message = m;}
}