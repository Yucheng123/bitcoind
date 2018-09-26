package com._37coins.bcJsonRpc.pojo;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Info {

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	//	private String version;
//	private String protocolversion;
//	private String walletversion;
	private BigDecimal balance;
//	private String blocks;
//	private String timeoffset;
//	private long connections;
//	private String proxy;
//	private BigDecimal difficulty;
//	private boolean testnet;
//	private String keypoololdest;
//	private String keypoolsize;
//	private BigDecimal paytxfee;
//	private BigDecimal relayfee;
//	private String errors;
//	public String getVersion() {
//		return version;
//	}
//	public void setVersion(String version) {
//		this.version = version;
//	}
//	public String getProtocolversion() {
//		return protocolversion;
//	}
//	public void setProtocolversion(String protocolversion) {
//		this.protocolversion = protocolversion;
//	}
//	public String getWalletversion() {
//		return walletversion;
//	}
//	public void setWalletversion(String walletversion) {
//		this.walletversion = walletversion;
//	}
//	public BigDecimal getBalance() {
//		return balance;
//	}
//	public void setBalance(BigDecimal balance) {
//		this.balance = balance;
//	}
//	public String getBlocks() {
//		return blocks;
//	}
//	public void setBlocks(String blocks) {
//		this.blocks = blocks;
//	}
//	public String getTimeoffset() {
//		return timeoffset;
//	}
//	public void setTimeoffset(String timeoffset) {
//		this.timeoffset = timeoffset;
//	}
//	public long getConnections() {
//		return connections;
//	}
//	public void setConnections(long connections) {
//		this.connections = connections;
//	}
//	public String getProxy() {
//		return proxy;
//	}
//	public void setProxy(String proxy) {
//		this.proxy = proxy;
//	}
//	public BigDecimal getDifficulty() {
//		return difficulty;
//	}
//	public void setDifficulty(BigDecimal difficulty) {
//		this.difficulty = difficulty;
//	}
//	public boolean isTestnet() {
//		return testnet;
//	}
//	public void setTestnet(boolean testnet) {
//		this.testnet = testnet;
//	}
//	public String getKeypoololdest() {
//		return keypoololdest;
//	}
//	public void setKeypoololdest(String keypoololdest) {
//		this.keypoololdest = keypoololdest;
//	}
//	public String getKeypoolsize() {
//		return keypoolsize;
//	}
//	public void setKeypoolsize(String keypoolsize) {
//		this.keypoolsize = keypoolsize;
//	}
//	public BigDecimal getPaytxfee() {
//		return paytxfee;
//	}
//	public void setPaytxfee(BigDecimal paytxfee) {
//		this.paytxfee = paytxfee;
//	}
//	public String getErrors() {
//		return errors;
//	}
//	public void setErrors(String errors) {
//		this.errors = errors;
//	}
//
//	public BigDecimal getRelayfee() {
//		return relayfee;
//	}
//
//	public void setRelayfee(BigDecimal relayfee) {
//		this.relayfee = relayfee;
//	}
}
