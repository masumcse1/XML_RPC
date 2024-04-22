package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class JavaClient {
	public static void main(String[] args) throws XmlRpcException {

		String API_URL = "http://localhost:8741/";
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();

		try {
			config.setServerURL(new URL(API_URL));
		} catch (MalformedURLException ex) {
			System.out.println("Wrong API_URL");
			return;
		}

		config.setBasicUserName("API_KEY_HEX");

		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(config);
		
		String res = (String) client.execute("SERVER.echo",Collections.singletonList("Hello XMLRPC testing !!"));

		System.out.println(res);
		
	}
}