package hi;

public class Person
{
	String firstName;
	String lastName;
	int age;
	/**
	 * @param fname - First Name
	 * @param lname - Last Name
	 * @param age - Person's age (yrs)
	 */
	public Person(String fname, String lname, int age)
	{
		super();
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}
	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return firstName;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.firstName = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lastName;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lastName = lname;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lastName + ", " + age;
	}
	
	public Person makePerson(Person that) throws UnderAgeException
	{
		if (age<18 || that.age < 18) 
		{
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName, that.lastName, 0);
		return child;
	}
	
	public static void main(String[] args) 
	{
		Person p = new Person("Brad", "Pitt", 61);
		
		System.out.println("P " + p);
		
	}
	
	
	
	
	
}
