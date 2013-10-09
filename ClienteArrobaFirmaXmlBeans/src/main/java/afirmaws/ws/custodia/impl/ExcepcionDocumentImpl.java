/*
 * An XML document type.
 * Localname: Excepcion
 * Namespace: http://afirmaws/ws/custodia
 * Java type: afirmaws.ws.custodia.ExcepcionDocument
 *
 * Automatically generated - do not modify.
 */
package afirmaws.ws.custodia.impl;
/**
 * A document containing one Excepcion(@http://afirmaws/ws/custodia) element.
 *
 * This is a complex type.
 */
public class ExcepcionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.ExcepcionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExcepcionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCEPCION$0 = 
        new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "Excepcion");
    
    
    /**
     * Gets the "Excepcion" element
     */
    public afirmaws.ws.custodia.ExcepcionDocument.Excepcion getExcepcion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.ExcepcionDocument.Excepcion target = null;
            target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().find_element_user(EXCEPCION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Excepcion" element
     */
    public void setExcepcion(afirmaws.ws.custodia.ExcepcionDocument.Excepcion excepcion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.ExcepcionDocument.Excepcion target = null;
            target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().find_element_user(EXCEPCION$0, 0);
            if (target == null)
            {
                target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().add_element_user(EXCEPCION$0);
            }
            target.set(excepcion);
        }
    }
    
    /**
     * Appends and returns a new empty "Excepcion" element
     */
    public afirmaws.ws.custodia.ExcepcionDocument.Excepcion addNewExcepcion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.ExcepcionDocument.Excepcion target = null;
            target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().add_element_user(EXCEPCION$0);
            return target;
        }
    }
    /**
     * An XML Excepcion(@http://afirmaws/ws/custodia).
     *
     * This is a complex type.
     */
    public static class ExcepcionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.ExcepcionDocument.Excepcion
    {
        private static final long serialVersionUID = 1L;
        
        public ExcepcionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODIGOERROR$0 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "codigoError");
        private static final javax.xml.namespace.QName DESCRIPCION$2 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "descripcion");
        private static final javax.xml.namespace.QName EXCEPCIONASOCIADA$4 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "excepcionAsociada");
        
        
        /**
         * Gets the "codigoError" element
         */
        public java.lang.String getCodigoError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOERROR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "codigoError" element
         */
        public org.apache.xmlbeans.XmlString xgetCodigoError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOERROR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "codigoError" element
         */
        public void setCodigoError(java.lang.String codigoError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOERROR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOERROR$0);
                }
                target.setStringValue(codigoError);
            }
        }
        
        /**
         * Sets (as xml) the "codigoError" element
         */
        public void xsetCodigoError(org.apache.xmlbeans.XmlString codigoError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOERROR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOERROR$0);
                }
                target.set(codigoError);
            }
        }
        
        /**
         * Gets the "descripcion" element
         */
        public java.lang.String getDescripcion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPCION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "descripcion" element
         */
        public org.apache.xmlbeans.XmlString xgetDescripcion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPCION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "descripcion" element
         */
        public void setDescripcion(java.lang.String descripcion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPCION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPCION$2);
                }
                target.setStringValue(descripcion);
            }
        }
        
        /**
         * Sets (as xml) the "descripcion" element
         */
        public void xsetDescripcion(org.apache.xmlbeans.XmlString descripcion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPCION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPCION$2);
                }
                target.set(descripcion);
            }
        }
        
        /**
         * Gets the "excepcionAsociada" element
         */
        public java.lang.String getExcepcionAsociada()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPCIONASOCIADA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "excepcionAsociada" element
         */
        public org.apache.xmlbeans.XmlString xgetExcepcionAsociada()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPCIONASOCIADA$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "excepcionAsociada" element
         */
        public boolean isSetExcepcionAsociada()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCEPCIONASOCIADA$4) != 0;
            }
        }
        
        /**
         * Sets the "excepcionAsociada" element
         */
        public void setExcepcionAsociada(java.lang.String excepcionAsociada)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPCIONASOCIADA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCEPCIONASOCIADA$4);
                }
                target.setStringValue(excepcionAsociada);
            }
        }
        
        /**
         * Sets (as xml) the "excepcionAsociada" element
         */
        public void xsetExcepcionAsociada(org.apache.xmlbeans.XmlString excepcionAsociada)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPCIONASOCIADA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCEPCIONASOCIADA$4);
                }
                target.set(excepcionAsociada);
            }
        }
        
        /**
         * Unsets the "excepcionAsociada" element
         */
        public void unsetExcepcionAsociada()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCEPCIONASOCIADA$4, 0);
            }
        }
    }
}
