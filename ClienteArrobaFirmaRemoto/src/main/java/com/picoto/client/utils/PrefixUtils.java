package com.picoto.client.utils;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;

public class PrefixUtils {

	public static void setDefaultNamespace (XmlObject xml, String ns) {
	     XmlCursor cursor = xml.newCursor();
	     cursor.toFirstContentToken();
	     cursor.toLastAttribute();
	     cursor.insertAttributeWithValue("xmlns",ns);
	     cursor.dispose();		
	}
	
}
