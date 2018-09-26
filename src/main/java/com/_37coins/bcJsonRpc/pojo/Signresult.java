package com._37coins.bcJsonRpc.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown=true)
public class Signresult {
    private String Hex;
    private Boolean complete;

	public String getHex() {
		return Hex;
	}

	public void setHex(String hex) {
		Hex = hex;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean completed) {
		this.complete = completed;
	}
}
