package com._37coins.bcJsonRpc;

import com._37coins.bcJsonRpc.pojo.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface NeoInterface {
	public long getblockcount(List<Integer> param);
	public NeoBlock getblock(String hash, Integer isverbose);
	public NeoBlock getblock(Integer blockNum,Integer isverbose);
	public GetBalance getbalance(String hash);
	public Validateaddress validateaddress(String hash);
	public NeoTransaction getrawtransaction(String hash, Integer isverbose);


}
