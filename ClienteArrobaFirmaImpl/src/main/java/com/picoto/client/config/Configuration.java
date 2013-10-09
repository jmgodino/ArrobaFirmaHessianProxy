package com.picoto.client.config;

import java.util.ResourceBundle;

public class Configuration {

	private static boolean initialized = false;
	private static String password;
	
	public static synchronized void init() {
		if (!initialized) {
			ResourceBundle bundle = ResourceBundle.getBundle("configuration");
			System.setProperty("SSLTrustStoreClientFile",bundle.getString("SSLTrustStoreClientFile"))  ;
			System.setProperty("SSLTrustStoreClientPassword",bundle.getString("SSLTrustStoreClientPassword"));
			System.setProperty("axis.socketSecureFactory",bundle.getString("SocketSecureFactory"));
			System.setProperty("axis.ClientConfigFile", bundle.getString("ClientConfigFile"));
			password = bundle.getString("SigningCertificatePassword");
		}
		initialized = true;
	}
	

	public static String getPassword() {
		init();
		return password;
	}

	
}
