package com.picoto.client.cert;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class CustomTrustFactory implements X509TrustManager {

	protected static final Log log = LogFactory.getLog(CustomTrustFactory.class);
	
	private KeyStore keystore;
	
	public CustomTrustFactory() {
		try {
			keystore = KeyStore.getInstance(KeyStore.getDefaultType());
			InputStream keystoreStream = ClassLoader.getSystemResourceAsStream(System.getProperty("SSLTrustStoreClientFile"));  
			keystore.load(keystoreStream, System.getProperty("SSLTrustStoreClientPassword").toCharArray());  
			
		} catch (Exception e) {

		}  

	}

	public void checkClientTrusted(X509Certificate[] certList, String alias) throws CertificateException {
		log.debug("Funcion no implementada");
	}

	public void checkServerTrusted(X509Certificate[] cert, String alias) throws CertificateException {
		CertValidator validator = new CertValidator();
		boolean res = false;
		for (int i=0;  i< cert.length; i++) {
			res = res || validator.validateCert(keystore, cert[i]);
			if (res) return;
		}
		if (!res) throw new CertificateException("Certificado no reconocido");
		
	}

	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}
	
}
