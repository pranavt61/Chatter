import org.junit.*;

public class UserModelTest
{

	//Static Tests 
	int numUsers = 10;

	@Test
	public void populateUserListTest()
	{
		String[] names = new String[numUsers];
		String[] pass = new String[numUsers];

		for(int i = 0; i < numUsers; i++)
		{
			names[i] = "User " + i;
			pass[i] = "Pass " + i;
			UserModel.addUser(new UserModel(names[i], pass[i]));
		}

		Assert.assertTrue(UserModel.nextID == numUsers);
	}

	@Test
	public void getUserFromIDTest()
	{
		boolean validTest = true;

		for(int i = 0; i < numUsers; i++)
			if(!UserModel.getUser(i).getName().equals("User " + i))
				validTest = false;

		Assert.assertTrue(validTest);
	}

	@Test
	public void getUserFromNameTest()
	{
		boolean validTest = true;

		for(int i = 0; i < numUsers; i++)
			if(UserModel.getUser("User " + i).getID() != i)
				validTest = false;

		Assert.assertTrue(validTest);
	}

	@Test
	public void authUserTest()
	{
		boolean validTest = true;

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

		UserModel user = new UserModel(name, pass);

		Assert.assertTrue(user.getName().equals(name));
	}

	@Test
	public void getIDTest()
	{
		String name = "name";
		String pass = "pass";
		int lastID = UserModel.nextID;

		UserModel user = new UserModel(name, pass); 

		Assert.assertTrue(user.getID() == (lastID - 1));
	}

}