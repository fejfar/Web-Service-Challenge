package com.ciandt.ffejfar.webServiceChallenge.account.pojo;

public class Account {

	private String cpf;
	private String branch;
	private String account;
	private float balance;

	public Account() {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float i) {
		this.balance = i;
	}

}
