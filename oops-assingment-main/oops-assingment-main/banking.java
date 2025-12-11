package oops;

class BankAccount{
	int accountNo;
	float balance;
	
	void deposit(float amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println(amount + " deposited. New Balance is :" +balance);	
		}
		else {
			System.out.println("Invalid Amount");
		}
		
	}
	
	void withdraw(float amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println(amount + " withdrawn. New Balance is :" +balance);
		}
		else {
			System.out.println("Insufficient Balance.");
		}
	}
}

class SavingsAccount extends BankAccount{
	float interestRate;
	
	void addInterest() {
		float interest = balance * (interestRate / 100);
		balance = balance + interest;
		System.out.println("Interest added :" +interest+ "New Balance is :" +balance);
	}
}

class SalaryAccount extends BankAccount{
	float monthlySalary;
	
	void creditSalary() {
		balance = balance + monthlySalary;
		System.out.println("Salay Credited : " + monthlySalary+ "New Balance is :" +balance);
	}
}

public class banking {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        s.accountNo = 101;
        s.balance = 5000;
        s.interestRate = 5;

        s.deposit(2000);
        s.addInterest();
        s.withdraw(1000);


        SalaryAccount sal = new SalaryAccount();
        sal.accountNo = 102;
        sal.balance = 0;
        sal.monthlySalary = 25000;

        sal.creditSalary();
        sal.withdraw(5000);
    }
}
