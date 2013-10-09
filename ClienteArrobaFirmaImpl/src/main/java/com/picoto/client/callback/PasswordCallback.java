package com.picoto.client.callback;
import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;


public abstract class PasswordCallback implements CallbackHandler {
	
	public abstract String getPassword();
	
	public PasswordCallback() {
	}
	
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback px = (WSPasswordCallback) callbacks[i];
                px.setPassword(getPassword());
            }
        }
	}
}