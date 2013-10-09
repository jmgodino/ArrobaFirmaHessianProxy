package com.picoto.client;

import afirmaws.ws.custodia.MensajeEntradaDocument;
import afirmaws.ws.custodia.MensajeSalidaDocument;


public interface RemoteArrobaFirmaServiceIntf {	
	
	public MensajeSalidaDocument obtenerIdDocumento(MensajeEntradaDocument entrada);


}