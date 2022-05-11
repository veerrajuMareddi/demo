package custum.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Wbean
{
	/*
	 * private int loan ; private int amount; private insurance log; private Salary
	 * gross; public void setLoan(int loan) { this.loan = loan; } public void
	 * setAmount(int amount) { this.amount = amount; } public void setLog(insurance
	 * log) { this.log = log; } public void setGross(Salary gross) { this.gross =
	 * gross; } public void method() { log.calc(); gross.sal();
	 * 
	 * }
	 */
	@Autowired
    private insurance log;

    
	
	
	public void method() {
		log.calc();
	}
    
}
