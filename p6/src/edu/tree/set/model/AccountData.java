package edu.tree.set.model;
import java.util.ArrayList;

import java.util.Collections;



import java.util.List;

 

import java.util.TreeSet;

 

import java.util.Iterator;


public class AccountData {

	 

		public static void main(String[] args) {

	TreeSet<Account> allAccounts = new TreeSet<>();
	Account a1 = new Account("JOHN",000001,"GOUTHAM CITY","IFSC1234",1000,10000);

	 

	Account a2 = new Account("WICK",000002,"OSGAURD","IFSC6699",2000,20000);

	 

	Account a3 = new Account("CAPTIAN",000003,"WAKANDA","IFSC9966",3000,30000);

	 

	Account a4 = new Account("JACK",000004,"KNOW WHERE","IFSC1122",4000,40000);

	 

	Account a5 = new Account("SPARROW",000005,"EGO","IFSC2211",5000,50000);

	 

	Account a6 = new Account("GIBBS",000006,"EARTH","IFSC0000",6000,60000);

	 

			

	 

			
			allAccounts.add(a1);

	 

			allAccounts.add(a2);

	 

			allAccounts.add(a3);

	 

			allAccounts.add(a4);

	 

			allAccounts.add(a5);

	 

			allAccounts.add(a6);
			for (Account account : allAccounts)

	 

			{
				System.out.println(account);

	 

			}
			System.out.println(" AMOUNT LOW TO HIGH");

	 

			getLowtoHigh(allAccounts);
			System.out.println(" AMOUNT HIGH TO LOW ");

	 

			getHighToLow(allAccounts);	

	 

		}//main class

	 

	 

		private static void getHighToLow(TreeSet<Account> allAccounts) {

	 

			List<Account> tempList = new ArrayList<>();

	 

			tempList.addAll(allAccounts);
			HightoLow sortCode = new HightoLow();

	 

			Collections.sort(tempList,sortCode);
			for (Account account :tempList) {

	 

				System.out.println(account);

	 

			}		
		}
		private static void getLowtoHigh(TreeSet<Account> allAccounts) {

	 

			List<Account> tempList= new ArrayList<>();

	 

			tempList.addAll(allAccounts);
			LowtoHigh sortCode = new LowtoHigh();

	 

			Collections.sort(tempList,sortCode);		

	 

			for(Account account : tempList) {

	 

				System.out.println(account);

	 

			}		
		}

	 

	}// end class


