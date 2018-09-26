package com._37coins.bcJsonRpc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by austere on 18/6/29.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class NeoTransaction {
    private String txid;
    private Long size;
    private String type;
    private Integer version;
    private String sys_fee;
    private String net_fee;
    private String blockhash;
    private Integer confirmations;
    private Integer blocktime;
    private List<NeoVin> vin;
    private List<NeoVout> vout;
    private List<Scripts> scripts;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSys_fee() {
        return sys_fee;
    }

    public void setSys_fee(String sys_fee) {
        this.sys_fee = sys_fee;
    }

    public String getNet_fee() {
        return net_fee;
    }

    public void setNet_fee(String net_fee) {
        this.net_fee = net_fee;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public Integer getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(Integer blocktime) {
        this.blocktime = blocktime;
    }

    public List<NeoVin> getVin() {
        return vin;
    }

    public void setVin(List<NeoVin> vin) {
        this.vin = vin;
    }

    public List<NeoVout> getVout() {
        return vout;
    }

    public void setVout(List<NeoVout> vout) {
        this.vout = vout;
    }

    public List<Scripts> getScripts() {
        return scripts;
    }

    public void setScripts(List<Scripts> scripts) {
        this.scripts = scripts;
    }
}