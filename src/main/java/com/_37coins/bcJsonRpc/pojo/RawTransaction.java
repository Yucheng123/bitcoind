package com._37coins.bcJsonRpc.pojo;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class RawTransaction {
	private String txid;
	private String hash;
	private Integer size;
	private List<Vout> vout;
	private Long confirmations;

	public List<Vout> getVout() {
		return vout;
	}

	public void setVout(List<Vout> vouts) {
		this.vout = vouts;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Long getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(Long confirmations) {
		this.confirmations = confirmations;
	}
}
