import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import afirmaws.ws.custodia.MensajeEntradaDocument;
import afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada;
import afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros;
import afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion;
import afirmaws.ws.custodia.MensajeSalidaDocument;

import com.picoto.client.RemoteArrobaFirmaServiceIntf;
import com.picoto.client.utils.PrefixUtils;

public class TestArrobaFirma {


	public static void main(String[] args) throws Exception {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("classpath:cliente-remoto.xml");
		RemoteArrobaFirmaServiceIntf afirma = (RemoteArrobaFirmaServiceIntf)contexto.getBean("remoteArrobaFirma");

		 MensajeEntradaDocument md = MensajeEntradaDocument.Factory.newInstance();
	     MensajeEntrada me =  md.addNewMensajeEntrada();
	     me.setVersionMsg("1.0");
	     me.setPeticion(Peticion.Enum.forInt(6));
	     Parametros p = me.addNewParametros();
	     p.setIdAplicacion("jccm.educacion.papas");
	     p.setIdTransaccion("123");
	     
	     PrefixUtils.setDefaultNamespace(me, "http://afirmaws/ws/custodia");
	     
	     
	    System.out.println(md.toString());
		MensajeSalidaDocument ms = afirma.obtenerIdDocumento(md);
		System.out.println(ms.toString());
	}

}
