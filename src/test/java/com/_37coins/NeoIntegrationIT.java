package com._37coins;

import com._37coins.bcJsonRpc.BitcoindClientFactory;
import com._37coins.bcJsonRpc.BitcoindInterface;
import com._37coins.bcJsonRpc.NeoClientFactory;
import com._37coins.bcJsonRpc.NeoInterface;
import com._37coins.bcJsonRpc.pojo.GetBalance;
import com._37coins.bcJsonRpc.pojo.Getrawtransaction;
import com._37coins.bcJsonRpc.pojo.NeoBlock;
import com._37coins.bcJsonRpc.pojo.Validateaddress;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class NeoIntegrationIT {
	
	static NeoInterface client;
	
	@BeforeClass
	static public void before() throws MalformedURLException, IOException{
		NeoClientFactory clientFactory = new NeoClientFactory(new URL("http://47.105.96.225:10332"));
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
//	@Test
//	public void testGetBlockHeight(){
//		Long height = client.getconnectioncount(new ArrayList<Integer>());
//		System.out.println("height:"+height);
//	}

//	@Test
//	public void testGetBlock(){
//		String hash = "4c1e879872344349067c3b1a30781eeb4f9040d3795db7922f513f6f9660b9b2";
//		Integer isverbose = 1;
//		NeoBlock height = client.getblock(hash,isverbose);
//		System.out.println(height.getIndex());
//		System.out.println(height.getSize());
//		System.out.println(height.getHash());
//		System.out.println(height.getVersion());
//		System.out.println(height.getMerkleroot());
//		System.out.println(height.getNextconsensus());
//		System.out.println(height.getNonce());
//		System.out.println(height.getPreviousblockhash());
//		System.out.println(height.getTime());
//}
//	@Test
//	public void testGetBalance(){
//		String hash = "025d82f7b00a9ff1cfe709abe3c4741a105d067178e645bc3ebad9bc79af47d4";
//		GetBalance _getbalance=client.getbalance(hash);
//		System.out.println(_getbalance.getBalance());
//		System.out.println(_getbalance.getConfirmed());
//	}
//	@Test
//	public void testValidateaddress(){
//		String hash="AQVh2pG732YvtNaxEGkQUei3YA4cvo7d2i";
//		Validateaddress _validateaddress = client.validateaddress(hash);
//		System.out.println(_validateaddress.getAddress());
//		System.out.println(_validateaddress.isIsvalid());
//
//	}
	@Test
	public void testGetrawtransaction(){
		String hash="c9a32cd215837c02dd72613bfad6ed064579e77bafd859907f87b3e67fa498cc";
		Integer isverbose = 1 ;
		try{
			Getrawtransaction  _getrawtransaction  = client.getrawtransaction (hash,isverbose);
			System.out.println(_getrawtransaction.getTxid());
			System.out.println(_getrawtransaction.getSize());
		}catch (Exception e ){
			System.out.println("Unknown transaction");
			System.out.println(e);
		}

	}
}
