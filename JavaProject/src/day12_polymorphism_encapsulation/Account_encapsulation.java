package day12_polymorphism_encapsulation;

public class Account_encapsulation {
	
	// Here variable are using within class only.
	
	private int accno;
	private String name;
	private double amount;
	
	// To add all getters and setter method > go to Source > generate getters and setters method
	// What is the use of getters and setters?
	// ..> we give class variable as private. To give the values of that method, we have set methods
	// and to get the values from that variable, we have set method
	void setAccno(int accno)
	{
		// here this keyword is used to differentiate between local variable and class variable
		// so compiler will not confusion to method like which one is local and class variables
		this.accno=accno; 
	}
	
	int getAccno()
	{
		return accno;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	
	

}
