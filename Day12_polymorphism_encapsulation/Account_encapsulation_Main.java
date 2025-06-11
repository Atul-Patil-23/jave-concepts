package day12_polymorphism_encapsulation;

public class Account_encapsulation_Main {

	public static void main(String[] args) {
		Account_encapsulation acc=new Account_encapsulation();
		acc.setAccno(210);
		acc.setAmount(301234);
		acc.setName("Atul");
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());

	}

}
