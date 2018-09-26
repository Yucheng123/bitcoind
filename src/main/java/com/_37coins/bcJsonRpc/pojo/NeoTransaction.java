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
    private Long nonce;
    private List<Vin> vin;
    private List<NeoVout> vout;
    private Integer version;
}
