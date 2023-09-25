package edu.tree.set.model;
import java.util.Objects;

public class Account {

	 public class Account implements Comparable<Account> {

	 

		private int balance;

	 

		private int accountNumber;

	 

		private String accountHolderName;

	 

		private String location;

	 

		public Account(int balance, int accountNumber, String accountHolderName, String location) {

	 

			super();

	 

			this.balance = balance;

	 

			this.accountNumber = accountNumber;

	 

			this.accountHolderName = accountHolderName;

	 

			this.location = location;

	 

		}

	 

	 

		public Account(String string, int i, String string2, String string3, int j, int k) {

			// TODO Auto-generated constructor stub

		}

	 

	 

		public int getBalance() {

	 

			return balance;

		}

		public void setBalance(int balance) {

	 

			this.balance = balance;

	 

		}

	 

		public int getAccountNumber() {

	 

			return accountNumber;

	 

		}

	 

		public void setAccountNumber(int accountNumber) {

	 

			this.accountNumber = accountNumber;

	 

		}

	 

		public String getAccountHolderName() {

	 

			return accountHolderName;

	 

		}

	 

	 

	 

		public void setAccountHolderName(String accountHolderName) {

	 

			this.accountHolderName = accountHolderName;

	 

		}

	 

	 

		public String getLocation() {

	 

			return location;

	 

		}

		public void setLocation(String location) {

	 

			this.location = location;

	 

		}

	 

		@Override

	 

		public String toString() {

	 

			// TODO Auto-generated method stub

	 

			return super.toString();

	 

		}

	 

	 

		@Override

	 

		public int hashCode() {

	 

			return accountHolderName.length()+location.length()+balance;

	 

		}

		@Override

	 

		public boolean equals(Object obj) {

	 

			if (obj instanceof Account)

	 

			{

	 

				Account acc = (Account)obj;

	 

				

	 

				boolean a = acc.balance==this.balance;

	 

				boolean b = acc.accountHolderName.equals(this.getAccountHolderName());

	 

				boolean c = acc.accountNumber==this.accountNumber;

	 

				boolean d = acc.location.equals(this.getLocation());

	 

				

	 

				return a && b && c && d;

	 

				}

	 

			else

	 

			{

	 

				return false;

	 

			}

		}

	 

	 

	 

		@Override

	 

		public int compareTo(Account o) {

	 

			// TODO Auto-generated method stub

	 

			return 0;

	 

		}

}
}
