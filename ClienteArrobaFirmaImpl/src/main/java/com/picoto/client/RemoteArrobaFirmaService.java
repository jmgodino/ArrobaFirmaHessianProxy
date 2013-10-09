package com.picoto.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import afirmaws.ws.custodia.MensajeEntradaDocument;
import afirmaws.ws.custodia.MensajeSalidaDocument;

import com.picoto.axis.Custodia;
import com.picoto.axis.CustodiaService;
import com.picoto.axis.CustodiaServiceLocator;

public class RemoteArrobaFirmaService extends RemoteArrobaBase implements RemoteArrobaFirmaServiceIntf {

	protected static final Log LOG = LogFactory.getLog(RemoteArrobaFirmaService.class);
	
	public RemoteArrobaFirmaService() {
		super();
	}
	
	public MensajeSalidaDocument obtenerIdDocumento(MensajeEntradaDocument msg) {
    	
    	
        try {
            CustodiaService locator = new CustodiaServiceLocator();
			
			Custodia service = locator.getObtenerIdDocumento();
   
		
			addXsdHeader(msg.getMensajeEntrada());
			
			LOG.debug("EntradaHeader: "+msg.toString());
			
			String res = service.obtenerIdDocumento(msg.toString());
			
			LOG.debug("Salida: "+res);
			 
			 
			MensajeSalidaDocument sal = MensajeSalidaDocument.Factory.parse(res);
			return sal;

        } catch (Exception e) {
			e.printStackTrace();
			throw new ClienteArrobaFirmaException();
		}

	}
	


}