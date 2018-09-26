package com._37coins.bcJsonRpc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigInteger;

/**
 * Created by austere on 18/6/29.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class OmiTransaction {
    private String txid;
    private String fee;
    private String sendingaddress;
    private String referenceaddress;
    private Boolean ismine;
    private Integer version;
    private Integer type_int;
    private String type;
    private Integer propertyid;
    private boolean divisible;
    private String amount;
    private Boolean valid;
    private String blockhash;
    private Long blocktime;
    private Long positioninblock;
    private Long block;
    private BigInteger confirmations;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getSendingaddress() {
        return sendingaddress;
    }

    public void setSendingaddress(String sendingaddress) {
        this.sendingaddress = sendingaddress;
    }

    public String getReferenceaddress() {
        return referenceaddress;
    }

    public void setReferenceaddress(String referenceaddress) {
        this.referenceaddress = referenceaddress;
    }

    public Boolean getIsmine() {
        return ismine;
    }

    public void setIsmine(Boolean ismine) {
        this.ismine = ismine;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getType_int() {
        return type_int;
    }

    public void setType_int(Integer type_int) {
        this.type_int = type_int;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(Integer propertyid) {
        this.propertyid = propertyid;
    }

    public boolean isDivisible() {
        return divisible;
    }

    public void setDivisible(boolean divisible) {
        this.divisible = divisible;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Long getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(Long blocktime) {
        this.blocktime = blocktime;
    }

    public Long getPositioninblock() {
        return positioninblock;
    }

    public void setPositioninblock(Long positioninblock) {
        this.positioninblock = positioninblock;
    }

    public Long getBlock() {
        return block;
    }

    public void setBlock(Long block) {
        this.block = block;
    }

    public BigInteger getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(BigInteger confirmations) {
        this.confirmations = confirmations;
    }
    @Override
    public String toString(){
        return "from:"+sendingaddress+";to:"+referenceaddress+";amount:"+amount;
    }
}
