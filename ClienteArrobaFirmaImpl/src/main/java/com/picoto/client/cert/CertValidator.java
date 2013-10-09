package com.picoto.client.cert;

import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertValidator {

	protected static final Log log = LogFactory.getLog(CertValidator.class);
	
	public boolean validateCert(KeyStore keystore, X509Certificate cert) {
		try {
			String issuerdn = cert.getIssuerDN().getName();
			
			Enumeration en = keystore.aliases();
			while (en.hasMoreElements()) {
				X509Certificate storecert = null;
				String alias = (String) en.nextElement();
				if (keystore.isCertificateEntry(alias)) {
					log.debug("Probando con elemento del trustStore: "+alias);
					storecert = (X509Certificate) keystore.getCertificate(alias);
					if ((storecert.getIssuerDN().getName()).equals(issuerdn)) {
						try {
							log.debug("Encontrado DN del certificado en el trustStore");
							if (storecert.getPublicKey().getFormat().equalsIgnoreCase(cert.getPublicKey().getFormat())) {
								log.debug("Tenemos el certificado instalado en el keystore, así que no hay nada que validar");
								return true;
							} else {
								log.debug("Verificamos si el certificado fue firmado con la clave privada asociada a la clave pública del centificado del keystore");
								cert.verify(storecert.getPublicKey());
								log.debug("La firma del certificado se ha validado");
								return true;
							}	
						} catch (Exception exc) {
							log.debug("Error validando la firma del certificado");
						}
					}
				}
			}

			// Si despues de validarlos todos no hemos encontrado uno bueno, es porque no es válido
			return false;
		} catch (Exception e) {
			// En caso de error no admitimos la petición
			return false;
		}

	}
	
}
