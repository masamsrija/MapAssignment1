package edu.tree.set.model;
import java.util.Comparator;


public class HightoLow {

	 

	public class HightoLow implements Comparator<Account>{

	 

		@Override

	 

		public int compare(Account o1, Account o2) {

			return (int)(o2.getBankBal()-o1.getBankBal());

	 

		}

	 

	}

}
