

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import helloWorldTest.Person;
import helloWorldTest.UnderAgeException;

class PersonTest
{

	Person R;
	Person J;
	Person M;
	Person K;

	
	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person("Romeo", "Mon", 15);
		J = new Person("Juliette", "Cap", 13);
		M = new Person("Count", "Dooku", 34);
		K = new Person("General", "Kenobi", 30);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: Romeo Mon, 15", R.toString());
//		fail("Not yet implemented");
	}
	
	@Test
	void testPerson()
	{
		assertThrows(UnderAgeException.class, () -> {
			R.makePerson(J);
		});
		
		assertThrows(UnderAgeException.class, () -> {
			M.makePerson(J);
		});
		
		
		Person child;
		try
		{
			child = M.makePerson(K);
			assertEquals(M.getFname(), child.getFname());
			assertEquals(K.getLname(), child.getLname());
			assertEquals(0, child.getAge());
			
		} catch (UnderAgeException e)
		{
			e.printStackTrace();
			fail("Nope. Exception station. Toot! Toot!");
		}
		
	}

}
