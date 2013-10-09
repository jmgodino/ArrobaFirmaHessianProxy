package com.picoto.client.callback;

import com.picoto.client.config.Configuration;

public class UserTokenCallback extends PasswordCallback {

	public UserTokenCallback() {
		super();
	}
	
	public String getPassword() {
		return Configuration.getPassword();
	}

}
