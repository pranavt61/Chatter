import org.junit.*;

public class UserModelTest
{

	//Static Tests 
	void populateUserList(int num)
	{
		String[] names = new String[num];
		String[] pass = new String[num];

		for(int i = 0; i < num; i++)
		{
			names[i] = "User " + i;
			pass[i] = "Pass " + i;
			UserModel.addUser(new UserModel(names[i], pass[i]));
		}
	}

	@Test
	public void populateUserListTest()
	{
		int numUsers = 10;
		populateUserList(numUsers);

		Assert.assertTrue(UserModel.getNextID() == numUsers);
	}

	@Test
	public void getUserFromIDTest()
	{
		boolean validTest = true;
		int numUsers = 10;
		populateUserList(numUsers);

		for(int i = 0; i < numUsers; i++)
			if(UserModel.getUser(i) == null)
				validTest = false;

		Assert.assertTrue(validTest);
	}

	@Test
	public void getUserFromNameTest()
	{
		boolean validTest = true;
		int numUsers = 10;
		populateUserList(numUsers);

		for(int i = 0; i < numUsers; i++)
			if(UserModel.getUser("User " + i) != null)
				validTest = false;

		Assert.assertTrue(validTest);
	}

	@Test
	public void authUserTest()
	{
		boolean validTest = true;
		int numUsers = 10;
		populateUserList(numUsers);

		for(int i = 0; i < numUsers; i++)
			if(UserModel.authUser("User " + i, "Pass " + i) == null)
				validTest = false;

		Assert.assertTrue(validTest);

	}

	//Instance Tests
	@Test
	public void getNameTest()
	{
		String name = "name";
		String pass = "pass";

		UserModel.addUser(new UserModel(name,pass));
		Assert.assertTrue(user.getName().equals(name));
	}

	@Test
	public void getIDTest()
	{
		String name = "name";
		String pass = "pass";
		int lastID = UserModel.getNextID();

		UserModel.addUser(new UserModel(name,pass));
		Assert.assertTrue(user.getID() == (lastID));
	}

}