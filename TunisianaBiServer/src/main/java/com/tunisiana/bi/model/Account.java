package com.tunisiana.bi.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Account implements Comparable<Account> {

	private String name;
	private String firstName;
	private int age;

	public Account() {
	}

	public Account(String name, String firstName, int age) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Account account = (Account) obj;
		
		return new EqualsBuilder().append(this.name, account.name)
				.append(this.firstName, account.firstName).append(this.age, account.age).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(11, 21).append(this.name).append(this.firstName)
				.append(this.age).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", this.name)
				.append("firstname", this.firstName).append("age", this.age).toString();
	}

	@Override
	public int compareTo(Account account) {
		return new CompareToBuilder().append(this.name, account.name)
				.append(this.firstName, account.firstName).append(this.age, account.age)
				.toComparison();
	}

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("Test", "Oussama", 1));
		accounts.add(new Account("Test", "Oussama", 5));
		accounts.add(new Account("Test", "Oussama", 10));
		accounts.add(new Account("Ad", "Oussama", 4));

		Collections.sort(accounts);

		for (Account account : accounts) {
			System.out.println(account);
		}
	}

}
