import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private double monthlyInterestRate;

	public Account(){
		
	Account a1 = new Account(id, balance);
		
	}
	
	public Account(int id, double balance){
		id = 0;
		balance = 0;
		}
	
	public int getId(){
		return id;
	}
	
	public void setId(){
		this.id = id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(){
		this.balance = balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;	
	}
	
	public void setAnnualInterestRate(){
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return monthlyInterestRate;
		
	}
	
	public double withdraw(double balance, double x){
		return (balance - x);
	}
	
	public double deposit(double balance, double y){
		return (balance + y);
	}
}
