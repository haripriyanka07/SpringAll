package com.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aopdemo.Account;

@Component
public class AccountDAO {

	public List<Account> findAccounts(boolean flag){
		
		if(flag) {
			throw new RuntimeException("there is one exception");
		}
		
		
		List<Account> myAccounts = new ArrayList<>();
		
		Account temp1 = new Account("hari", "GOld");
		Account temp2 = new Account("Priyanka", "Silver");
		Account temp3 = new Account("sunkari", "GOld");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
	
}
