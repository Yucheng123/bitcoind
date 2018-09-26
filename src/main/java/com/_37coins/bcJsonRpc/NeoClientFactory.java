package com._37coins.bcJsonRpc;

import com.googlecode.jsonrpc4j.Base64;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.*;

public class NeoClientFactory {

	public static ServerSocket blockSocket;
	public static ServerSocket walletSocket;
	public static ServerSocket alertSocket;

	private static Logger LOG = LoggerFactory.getLogger(NeoClientFactory.class);
	private static String OS = System.getProperty("os.name").toLowerCase();

	private static String convertStream(java.io.InputStream is) {
	    Scanner s = new Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}

	private static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	private final JsonRpcHttpClient client;

	/**
	 *
	 * for the listener to work bitcoin has to be started like this:
	 *
	 * ./bitcoind -blocknotify="echo '%s' | nc 127.0.0.1 4001"
	 * -walletnotify="echo '%s' | nc 127.0.0.1 4002"
	 * -alertnotify="echo '%s' | nc 127.0.0.1 4003"
	 * -daemon
	 *
	 * @param url
	 * @param username
	 * @param password
	 * @throws IOException
	 */
	public NeoClientFactory(URL url)
			throws IOException {
		Map<String, String> headers = new HashMap<>(1);
		client = new JsonRpcHttpClient(url, headers);
	}

	
	public NeoInterface getClient() {
		return ProxyUtil.createClientProxy(
				NeoInterface.class.getClassLoader(),
				NeoInterface.class, client);
	}

}
