package com._37coins;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com._37coins.bcJsonRpc.pojo.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com._37coins.bcJsonRpc.BitcoindClientFactory;
import com._37coins.bcJsonRpc.BitcoindInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IntegrationIT {
	
	static BitcoindInterface client;
	
	@BeforeClass
	static public void before() throws MalformedURLException, IOException{
		BitcoindClientFactory clientFactory = new BitcoindClientFactory(new URL("http://47.105.96.225:10332"), "admin", "admin");
		client = clientFactory.getClient();
	}
	
//	@Test
//	public void testInfo() throws JsonProcessingException,IOException{
//		Info info = client.getinfo();
//		System.out.println(new ObjectMapper().writeValueAsString(info));
//	}
//
//	@Test
//	public void testBalance(){
//		BigDecimal balance = client.getbalance();
//
//        System.out.println("balance = " + balance);
//
//        assertTrue(balance.compareTo(BigDecimal.ZERO) >= 0);
//	}
	@Test
	public void testGetBlockHeight(){
		Long height = client.getblockcount();
		System.out.println("height:"+height);
	}

}
