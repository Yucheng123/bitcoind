package com._37coins.bcJsonRpc.pojo;

/**
 * Created by austere on 18/6/3.
 */
public class ExecutionResult {
    private Long gasUsed;
    private String excepted;
    private String newAddress;
    private String output;
    private Long codeDeposit;
    private Long gasRefunded;
    private Long depositSize;
    private Long gasForDeposit;

    public Long getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getExcepted() {
        return excepted;
    }

    public void setExcepted(String excepted) {
        this.excepted = excepted;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Long getCodeDeposit() {
        return codeDeposit;
    }

    public void setCodeDeposit(Long codeDeposit) {
        this.codeDeposit = codeDeposit;
    }

    public Long getGasRefunded() {
        return gasRefunded;
    }

    public void setGasRefunded(Long gasRefunded) {
        this.gasRefunded = gasRefunded;
    }

    public Long getDepositSize() {
        return depositSize;
    }

    public void setDepositSize(Long depositSize) {
        this.depositSize = depositSize;
    }

    public Long getGasForDeposit() {
        return gasForDeposit;
    }

    public void setGasForDeposit(Long gasForDeposit) {
        this.gasForDeposit = gasForDeposit;
    }
}
