package com.picoto.client.callback;

import com.picoto.client.config.Configuration;

public class CertificateCallback extends PasswordCallback {
	
	public CertificateCallback() {
		super();
	}

	public String getPassword() {
		return Configuration.getPassword();
	}

}
