package practice;

class Account {
private String accNo;
private String name;
private String address;
private int balance;
public Account() {
	
	System.out.println("inside super class");
}
public Account(String accNo, String name, String address, int balance) {
	super();
	System.out.println("inside parametrized constructor");
	this.accNo = accNo;
	this.name = name;
	this.address = address;
	this.balance = balance;
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", name=" + name + ", address=" + address + ", balance=" + balance + "]";
}


}
class SavingAccount extends Account
{
   public void deposite() {
	
}
	public void withdraw() {
		
	}
	public void fixedDeposite() {
		
	}
	public SavingAccount() {
		System.out.println("sub class constructor");
	}
	public SavingAccount(String accNo, String name, String address, int balance) {
		super(accNo, name, address, balance);
		// TODO Auto-generated constructor stub
	}
}

class LoanAccount extends Account{
	public void payEmi() {
		
	}
}
public class AccountMain{
public static void main(String[] args) {
	Account acc=new Account("101","vito","chikago",100);
	
}	
}
