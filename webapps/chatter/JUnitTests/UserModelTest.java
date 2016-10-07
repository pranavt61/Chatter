import org.junit.*;

public class UserModelTest
{
	@Test
	public void testTest()
	{
		String name = "name";
		String pass = "pass";

		UserModel user = new UserModel(name, pass);

		Assert.assertTrue(user.getName().equals(name));
	}
}