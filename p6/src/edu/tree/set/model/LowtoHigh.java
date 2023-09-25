package edu.tree.set.model;
import java.util.Comparator;


public class LowtoHigh {

	 

	public class LowtoHigh implements Comparator<Account> {

	 

		@Override

	 

		public int compare(Account o1, Account o2) {	

	 

			return(int)(o1.getBankBal()-o2.getBankBal());

	 

		}

	}

}
