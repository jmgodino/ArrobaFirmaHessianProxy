package com.picoto.client.cert;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Hashtable;

import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

import org.apache.axis.components.net.JSSESocketFactory;
import org.apache.axis.components.net.SecureSocketFactory;

import com.picoto.client.ClienteArrobaFirmaException;


public class CustomSocketFactory extends JSSESocketFactory
implements SecureSocketFactory {

	public CustomSocketFactory(Hashtable attributes) {
		super(attributes);
	}
	
	protected void initFactory() throws IOException {
    try {
        SSLContext context = getContext();
        sslFactory = context.getSocketFactory();
    } catch(Exception e) {
        if(e instanceof IOException)
            throw (IOException)e;
        else
            throw new IOException(e.getMessage());
    }
}


    protected SSLContext getContext() throws Exception {
    	
    	try {
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, new X509TrustManager[] { new CustomTrustFactory() }, new SecureRandom());
			if (log.isDebugEnabled())
				log.debug("Se ha cargado la base de certificados de confianza");
			return sc;
		} catch (Exception e) {

		}
		log.error("");
        throw new ClienteArrobaFirmaException("Error cargando keystore con certificados de confianza");
    }

	
	

}
