package opps;

public class TestAcount {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();
		Account a5 = new Account();
		a1.insert(24513645, "Utkarsh", 9000000);
		a2.insert(24513644, "Anshu", 8000000);
		a3.insert(24513643, "Rohit", 7000000);
		a4.insert(24513642, "Abhishek", 6000000);
		a5.insert(24513641, "Ashwani", 5000000);
		a1.display();
		a2.display();
		a3.display();
		a4.display();
		a5.display();
		a1.checkBalance();
		a2.checkBalance();
		a3.checkBalance();
		a4.checkBalance();
		a5.checkBalance();
		a1.deposit(500000);
		a4.withdraw(54000);
		a1.withdraw(35800);
		a5.withdraw(50250);
		a2.withdraw(10010);
		a1.deposit(800000);
		a2.deposit(500000);
		a2.withdraw(54000);
		a2.withdraw(35800);
		a3.withdraw(50250);
		a1.withdraw(10010);
		a5.deposit(800000);
		a4.deposit(500000);
		a1.withdraw(54000);
		a3.withdraw(35800);
		a2.withdraw(50250);
		a1.withdraw(10010);
		a2.deposit(800000);
		a3.deposit(500000);
		a1.withdraw(54000);
		a4.withdraw(35800);
		a5.withdraw(50250);
		a5.withdraw(10010);
		a3.deposit(800000);
		a1.checkBalance();
		a2.checkBalance();
		a3.checkBalance();
		a4.checkBalance();
		a5.checkBalance();


	}

}
