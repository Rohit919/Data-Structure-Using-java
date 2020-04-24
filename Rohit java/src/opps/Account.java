package opps;

public class Account {
	public int account_no;
	public String name;
	public float amount;

	public void insert(int account_no, String name, float amount) {
		this.account_no = account_no;
		this.name = name;
		this.amount = amount;
	}

	void deposit(float amount) {
		this.amount = this.amount + amount;
		System.out.println(amount +"   "+name+"   Deposited\n\n");
	}

	void withdraw(float amount) {
		if (this.amount < amount) {
			System.out.println("Insufficient Balance\n\n");
		} else {
			this.amount = this.amount - amount;
			System.out.println(amount +"   " +name+"   Withdrawn\n\n");
		}
	}
	
	void checkBalance() {
		System.out.println("Hi "+name+ "\n\t Your Balance is: "+ amount+"\n\n");
	}
	void display() {
		System.out.println("User Name: "+ name +"\nAccount No.: "+account_no+"\nBalance is "+ amount+"\n\n");
	}

}
