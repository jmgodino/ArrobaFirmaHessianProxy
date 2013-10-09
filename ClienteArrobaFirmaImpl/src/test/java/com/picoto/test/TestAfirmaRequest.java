package com.picoto.test;

import com.picoto.client.RemoteArrobaFirmaService;
import com.picoto.client.RemoteArrobaFirmaServiceIntf;

import afirmaws.ws.custodia.MensajeEntradaDocument;
import afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada;
import afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros;
import afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion;
import afirmaws.ws.custodia.MensajeSalidaDocument;

import junit.framework.*;

public class TestAfirmaRequest extends TestCase {

	public void testCertificateRequest() throws Exception {
		
		RemoteArrobaFirmaServiceIntf afirma = new RemoteArrobaFirmaService();
		MensajeEntradaDocument md = MensajeEntradaDocument.Factory.newInstance();
	    MensajeEntrada me =  md.addNewMensajeEntrada();
	    me.setVersionMsg("1.0");
	    me.setPeticion(Peticion.Enum.forInt(6));
	    Parametros p = me.addNewParametros();
	    p.setIdAplicacion("jccm.educacion.papas");
	    p.setIdTransaccion("123");
	     
	    System.out.println(md.toString()); 
		MensajeSalidaDocument ms = afirma.obtenerIdDocumento(md);
		System.out.println(ms.toString());
	}

	
}