package custum.core;

public class Wbean2 {
	private int loan;
	private int amount; 
	private insurance log;
	private Salary gross;
	
	
	public void setLoan(int loan) {
		this.loan = loan;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setLog(insurance log) {
		this.log = log;
	}
	public void setGross(Salary gross) {
		this.gross = gross;
	}
	public void method()
	{
		log.calc();
		gross.sal();
		
	}


}
