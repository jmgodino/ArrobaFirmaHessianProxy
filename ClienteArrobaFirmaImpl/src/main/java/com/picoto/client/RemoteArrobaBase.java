package com.picoto.client;

import org.apache.xmlbeans.XmlCursor;

import com.picoto.client.config.Configuration;

import afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada;

public class RemoteArrobaBase {

	
	
	public RemoteArrobaBase() {
		Configuration.init();
	}

	protected void addXsdHeader(MensajeEntrada me) {
		 XmlCursor cursor = me.newCursor();
	     cursor.toFirstContentToken();
	     cursor.toLastAttribute();
	     cursor.insertAttributeWithValue("schemaLocation","http://www.w3.com/2001/XMLSchema-instance", "http://www.iit.com/schema/Schema29.xsd");
	     cursor.insertAttributeWithValue("version", "2.9");
	     cursor.insertNamespace("xsi", "http://www.w3.com/2001/XMLSchema-instance");
	     cursor.insertNamespace("xsd", "http://www.w3.com/2001/XMLSchema");
	     cursor.dispose();
	}
	
}
