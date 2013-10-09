/*
 * An XML document type.
 * Localname: mensajeEntrada
 * Namespace: http://afirmaws/ws/custodia
 * Java type: afirmaws.ws.custodia.MensajeEntradaDocument
 *
 * Automatically generated - do not modify.
 */
package afirmaws.ws.custodia.impl;
/**
 * A document containing one mensajeEntrada(@http://afirmaws/ws/custodia) element.
 *
 * This is a complex type.
 */
public class MensajeEntradaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeEntradaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MensajeEntradaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MENSAJEENTRADA$0 = 
        new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "mensajeEntrada");
    
    
    /**
     * Gets the "mensajeEntrada" element
     */
    public afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada getMensajeEntrada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada target = null;
            target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada)get_store().find_element_user(MENSAJEENTRADA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mensajeEntrada" element
     */
    public void setMensajeEntrada(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada mensajeEntrada)
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada target = null;
            target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada)get_store().find_element_user(MENSAJEENTRADA$0, 0);
            if (target == null)
            {
                target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada)get_store().add_element_user(MENSAJEENTRADA$0);
            }
            target.set(mensajeEntrada);
        }
    }
    
    /**
     * Appends and returns a new empty "mensajeEntrada" element
     */
    public afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada addNewMensajeEntrada()
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada target = null;
            target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada)get_store().add_element_user(MENSAJEENTRADA$0);
            return target;
        }
    }
    /**
     * An XML mensajeEntrada(@http://afirmaws/ws/custodia).
     *
     * This is a complex type.
     */
    public static class MensajeEntradaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada
    {
        private static final long serialVersionUID = 1L;
        
        public MensajeEntradaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PETICION$0 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "peticion");
        private static final javax.xml.namespace.QName VERSIONMSG$2 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "versionMsg");
        private static final javax.xml.namespace.QName PARAMETROS$4 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "parametros");
        
        
        /**
         * Gets the "peticion" element
         */
        public afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion.Enum getPeticion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETICION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "peticion" element
         */
        public afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion xgetPeticion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion target = null;
                target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion)get_store().find_element_user(PETICION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "peticion" element
         */
        public void setPeticion(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion.Enum peticion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETICION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PETICION$0);
                }
                target.setEnumValue(peticion);
            }
        }
        
        /**
         * Sets (as xml) the "peticion" element
         */
        public void xsetPeticion(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion peticion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion target = null;
                target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion)get_store().find_element_user(PETICION$0, 0);
                if (target == null)
                {
                    target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion)get_store().add_element_user(PETICION$0);
                }
                target.set(peticion);
            }
        }
        
        /**
         * Gets the "versionMsg" element
         */
        public java.lang.String getVersionMsg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONMSG$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "versionMsg" element
         */
        public org.apache.xmlbeans.XmlString xgetVersionMsg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONMSG$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "versionMsg" element
         */
        public void setVersionMsg(java.lang.String versionMsg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONMSG$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONMSG$2);
                }
                target.setStringValue(versionMsg);
            }
        }
        
        /**
         * Sets (as xml) the "versionMsg" element
         */
        public void xsetVersionMsg(org.apache.xmlbeans.XmlString versionMsg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONMSG$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSIONMSG$2);
                }
                target.set(versionMsg);
            }
        }
        
        /**
         * Gets the "parametros" element
         */
        public afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros getParametros()
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros target = null;
                target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros)get_store().find_element_user(PARAMETROS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "parametros" element
         */
        public void setParametros(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros parametros)
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros target = null;
                target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros)get_store().find_element_user(PARAMETROS$4, 0);
                if (target == null)
                {
                    target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros)get_store().add_element_user(PARAMETROS$4);
                }
                target.set(parametros);
            }
        }
        
        /**
         * Appends and returns a new empty "parametros" element
         */
        public afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros addNewParametros()
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros target = null;
                target = (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros)get_store().add_element_user(PARAMETROS$4);
                return target;
            }
        }
        /**
         * An XML peticion(@http://afirmaws/ws/custodia).
         *
         * This is an atomic type that is a restriction of afirmaws.ws.custodia.MensajeEntradaDocument$MensajeEntrada$Peticion.
         */
        public static class PeticionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion
        {
            private static final long serialVersionUID = 1L;
            
            public PeticionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PeticionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML parametros(@http://afirmaws/ws/custodia).
         *
         * This is a complex type.
         */
        public static class ParametrosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros
        {
            private static final long serialVersionUID = 1L;
            
            public ParametrosImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IDAPLICACION$0 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "idAplicacion");
            private static final javax.xml.namespace.QName IDTRANSACCION$2 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "idTransaccion");
            private static final javax.xml.namespace.QName DOCUMENTO$4 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "documento");
            private static final javax.xml.namespace.QName NOMBREDOCUMENTO$6 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "nombreDocumento");
            private static final javax.xml.namespace.QName TIPODOCUMENTO$8 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "tipoDocumento");
            private static final javax.xml.namespace.QName IDDOCUMENTO$10 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "idDocumento");
            private static final javax.xml.namespace.QName REFERENCIA$12 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "referencia");
            private static final javax.xml.namespace.QName IDREFERENCIA$14 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "idReferencia");
            private static final javax.xml.namespace.QName FECHAINICIAL$16 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "fechaInicial");
            private static final javax.xml.namespace.QName FECHAFINAL$18 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "fechaFinal");
            
            
            /**
             * Gets the "idAplicacion" element
             */
            public java.lang.String getIdAplicacion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDAPLICACION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "idAplicacion" element
             */
            public org.apache.xmlbeans.XmlString xgetIdAplicacion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDAPLICACION$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "idAplicacion" element
             */
            public void setIdAplicacion(java.lang.String idAplicacion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDAPLICACION$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDAPLICACION$0);
                    }
                    target.setStringValue(idAplicacion);
                }
            }
            
            /**
             * Sets (as xml) the "idAplicacion" element
             */
            public void xsetIdAplicacion(org.apache.xmlbeans.XmlString idAplicacion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDAPLICACION$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDAPLICACION$0);
                    }
                    target.set(idAplicacion);
                }
            }
            
            /**
             * Gets the "idTransaccion" element
             */
            public java.lang.String getIdTransaccion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "idTransaccion" element
             */
            public org.apache.xmlbeans.XmlString xgetIdTransaccion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "idTransaccion" element
             */
            public boolean isSetIdTransaccion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(IDTRANSACCION$2) != 0;
                }
            }
            
            /**
             * Sets the "idTransaccion" element
             */
            public void setIdTransaccion(java.lang.String idTransaccion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTRANSACCION$2);
                    }
                    target.setStringValue(idTransaccion);
                }
            }
            
            /**
             * Sets (as xml) the "idTransaccion" element
             */
            public void xsetIdTransaccion(org.apache.xmlbeans.XmlString idTransaccion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDTRANSACCION$2);
                    }
                    target.set(idTransaccion);
                }
            }
            
            /**
             * Unsets the "idTransaccion" element
             */
            public void unsetIdTransaccion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(IDTRANSACCION$2, 0);
                }
            }
            
            /**
             * Gets the "documento" element
             */
            public byte[] getDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTO$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "documento" element
             */
            public org.apache.xmlbeans.XmlBase64Binary xgetDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBase64Binary target = null;
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DOCUMENTO$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "documento" element
             */
            public boolean isSetDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DOCUMENTO$4) != 0;
                }
            }
            
            /**
             * Sets the "documento" element
             */
            public void setDocumento(byte[] documento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTO$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTO$4);
                    }
                    target.setByteArrayValue(documento);
                }
            }
            
            /**
             * Sets (as xml) the "documento" element
             */
            public void xsetDocumento(org.apache.xmlbeans.XmlBase64Binary documento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBase64Binary target = null;
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DOCUMENTO$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DOCUMENTO$4);
                    }
                    target.set(documento);
                }
            }
            
            /**
             * Unsets the "documento" element
             */
            public void unsetDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DOCUMENTO$4, 0);
                }
            }
            
            /**
             * Gets the "nombreDocumento" element
             */
            public java.lang.String getNombreDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREDOCUMENTO$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "nombreDocumento" element
             */
            public org.apache.xmlbeans.XmlString xgetNombreDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDOCUMENTO$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "nombreDocumento" element
             */
            public boolean isSetNombreDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NOMBREDOCUMENTO$6) != 0;
                }
            }
            
            /**
             * Sets the "nombreDocumento" element
             */
            public void setNombreDocumento(java.lang.String nombreDocumento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREDOCUMENTO$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREDOCUMENTO$6);
                    }
                    target.setStringValue(nombreDocumento);
                }
            }
            
            /**
             * Sets (as xml) the "nombreDocumento" element
             */
            public void xsetNombreDocumento(org.apache.xmlbeans.XmlString nombreDocumento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREDOCUMENTO$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREDOCUMENTO$6);
                    }
                    target.set(nombreDocumento);
                }
            }
            
            /**
             * Unsets the "nombreDocumento" element
             */
            public void unsetNombreDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NOMBREDOCUMENTO$6, 0);
                }
            }
            
            /**
             * Gets the "tipoDocumento" element
             */
            public java.lang.String getTipoDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "tipoDocumento" element
             */
            public org.apache.xmlbeans.XmlString xgetTipoDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTO$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "tipoDocumento" element
             */
            public boolean isSetTipoDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TIPODOCUMENTO$8) != 0;
                }
            }
            
            /**
             * Sets the "tipoDocumento" element
             */
            public void setTipoDocumento(java.lang.String tipoDocumento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOCUMENTO$8);
                    }
                    target.setStringValue(tipoDocumento);
                }
            }
            
            /**
             * Sets (as xml) the "tipoDocumento" element
             */
            public void xsetTipoDocumento(org.apache.xmlbeans.XmlString tipoDocumento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTO$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTO$8);
                    }
                    target.set(tipoDocumento);
                }
            }
            
            /**
             * Unsets the "tipoDocumento" element
             */
            public void unsetTipoDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TIPODOCUMENTO$8, 0);
                }
            }
            
            /**
             * Gets the "idDocumento" element
             */
            public java.lang.String getIdDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDOCUMENTO$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "idDocumento" element
             */
            public org.apache.xmlbeans.XmlString xgetIdDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDDOCUMENTO$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "idDocumento" element
             */
            public boolean isSetIdDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(IDDOCUMENTO$10) != 0;
                }
            }
            
            /**
             * Sets the "idDocumento" element
             */
            public void setIdDocumento(java.lang.String idDocumento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDOCUMENTO$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDDOCUMENTO$10);
                    }
                    target.setStringValue(idDocumento);
                }
            }
            
            /**
             * Sets (as xml) the "idDocumento" element
             */
            public void xsetIdDocumento(org.apache.xmlbeans.XmlString idDocumento)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDDOCUMENTO$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDDOCUMENTO$10);
                    }
                    target.set(idDocumento);
                }
            }
            
            /**
             * Unsets the "idDocumento" element
             */
            public void unsetIdDocumento()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(IDDOCUMENTO$10, 0);
                }
            }
            
            /**
             * Gets the "referencia" element
             */
            public java.lang.String getReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCIA$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "referencia" element
             */
            public org.apache.xmlbeans.XmlString xgetReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCIA$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "referencia" element
             */
            public boolean isSetReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REFERENCIA$12) != 0;
                }
            }
            
            /**
             * Sets the "referencia" element
             */
            public void setReferencia(java.lang.String referencia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCIA$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCIA$12);
                    }
                    target.setStringValue(referencia);
                }
            }
            
            /**
             * Sets (as xml) the "referencia" element
             */
            public void xsetReferencia(org.apache.xmlbeans.XmlString referencia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCIA$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCIA$12);
                    }
                    target.set(referencia);
                }
            }
            
            /**
             * Unsets the "referencia" element
             */
            public void unsetReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REFERENCIA$12, 0);
                }
            }
            
            /**
             * Gets the "idReferencia" element
             */
            public java.lang.String getIdReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDREFERENCIA$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "idReferencia" element
             */
            public org.apache.xmlbeans.XmlString xgetIdReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDREFERENCIA$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "idReferencia" element
             */
            public boolean isSetIdReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(IDREFERENCIA$14) != 0;
                }
            }
            
            /**
             * Sets the "idReferencia" element
             */
            public void setIdReferencia(java.lang.String idReferencia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDREFERENCIA$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDREFERENCIA$14);
                    }
                    target.setStringValue(idReferencia);
                }
            }
            
            /**
             * Sets (as xml) the "idReferencia" element
             */
            public void xsetIdReferencia(org.apache.xmlbeans.XmlString idReferencia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDREFERENCIA$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDREFERENCIA$14);
                    }
                    target.set(idReferencia);
                }
            }
            
            /**
             * Unsets the "idReferencia" element
             */
            public void unsetIdReferencia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(IDREFERENCIA$14, 0);
                }
            }
            
            /**
             * Gets the "fechaInicial" element
             */
            public java.lang.String getFechaInicial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAINICIAL$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "fechaInicial" element
             */
            public org.apache.xmlbeans.XmlString xgetFechaInicial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAINICIAL$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "fechaInicial" element
             */
            public boolean isSetFechaInicial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FECHAINICIAL$16) != 0;
                }
            }
            
            /**
             * Sets the "fechaInicial" element
             */
            public void setFechaInicial(java.lang.String fechaInicial)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAINICIAL$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHAINICIAL$16);
                    }
                    target.setStringValue(fechaInicial);
                }
            }
            
            /**
             * Sets (as xml) the "fechaInicial" element
             */
            public void xsetFechaInicial(org.apache.xmlbeans.XmlString fechaInicial)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAINICIAL$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHAINICIAL$16);
                    }
                    target.set(fechaInicial);
                }
            }
            
            /**
             * Unsets the "fechaInicial" element
             */
            public void unsetFechaInicial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FECHAINICIAL$16, 0);
                }
            }
            
            /**
             * Gets the "fechaFinal" element
             */
            public java.lang.String getFechaFinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAFINAL$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "fechaFinal" element
             */
            public org.apache.xmlbeans.XmlString xgetFechaFinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAFINAL$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "fechaFinal" element
             */
            public boolean isSetFechaFinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FECHAFINAL$18) != 0;
                }
            }
            
            /**
             * Sets the "fechaFinal" element
             */
            public void setFechaFinal(java.lang.String fechaFinal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAFINAL$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHAFINAL$18);
                    }
                    target.setStringValue(fechaFinal);
                }
            }
            
            /**
             * Sets (as xml) the "fechaFinal" element
             */
            public void xsetFechaFinal(org.apache.xmlbeans.XmlString fechaFinal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHAFINAL$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHAFINAL$18);
                    }
                    target.set(fechaFinal);
                }
            }
            
            /**
             * Unsets the "fechaFinal" element
             */
            public void unsetFechaFinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FECHAFINAL$18, 0);
                }
            }
        }
    }
}
