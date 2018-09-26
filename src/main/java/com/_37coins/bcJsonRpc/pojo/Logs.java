package com._37coins.bcJsonRpc.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by austere on 18/6/1.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown=true)
public class Logs {
    private String address;
    private List<String> topics;
    private String data;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getTo(){
        return this.topics.get(2).substring(24);
    }
    public String getFrom(){
        return this.topics.get(1).substring(24);

    }
}
