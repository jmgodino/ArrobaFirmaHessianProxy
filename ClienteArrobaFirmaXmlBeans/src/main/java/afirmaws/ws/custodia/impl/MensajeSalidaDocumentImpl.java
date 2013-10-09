/*
 * An XML document type.
 * Localname: mensajeSalida
 * Namespace: http://afirmaws/ws/custodia
 * Java type: afirmaws.ws.custodia.MensajeSalidaDocument
 *
 * Automatically generated - do not modify.
 */
package afirmaws.ws.custodia.impl;
/**
 * A document containing one mensajeSalida(@http://afirmaws/ws/custodia) element.
 *
 * This is a complex type.
 */
public class MensajeSalidaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeSalidaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MensajeSalidaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MENSAJESALIDA$0 = 
        new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "mensajeSalida");
    
    
    /**
     * Gets the "mensajeSalida" element
     */
    public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida getMensajeSalida()
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida target = null;
            target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida)get_store().find_element_user(MENSAJESALIDA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mensajeSalida" element
     */
    public void setMensajeSalida(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida mensajeSalida)
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida target = null;
            target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida)get_store().find_element_user(MENSAJESALIDA$0, 0);
            if (target == null)
            {
                target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida)get_store().add_element_user(MENSAJESALIDA$0);
            }
            target.set(mensajeSalida);
        }
    }
    
    /**
     * Appends and returns a new empty "mensajeSalida" element
     */
    public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida addNewMensajeSalida()
    {
        synchronized (monitor())
        {
            check_orphaned();
            afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida target = null;
            target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida)get_store().add_element_user(MENSAJESALIDA$0);
            return target;
        }
    }
    /**
     * An XML mensajeSalida(@http://afirmaws/ws/custodia).
     *
     * This is a complex type.
     */
    public static class MensajeSalidaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida
    {
        private static final long serialVersionUID = 1L;
        
        public MensajeSalidaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PETICION$0 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "peticion");
        private static final javax.xml.namespace.QName VERSIONMSG$2 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "versionMsg");
        private static final javax.xml.namespace.QName RESPUESTA$4 = 
            new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "respuesta");
        
        
        /**
         * Gets the "peticion" element
         */
        public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion.Enum getPeticion()
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
                return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "peticion" element
         */
        public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion xgetPeticion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion target = null;
                target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion)get_store().find_element_user(PETICION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "peticion" element
         */
        public void setPeticion(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion.Enum peticion)
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
        public void xsetPeticion(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion peticion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion target = null;
                target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion)get_store().find_element_user(PETICION$0, 0);
                if (target == null)
                {
                    target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion)get_store().add_element_user(PETICION$0);
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
         * Gets the "respuesta" element
         */
        public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta getRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta target = null;
                target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta)get_store().find_element_user(RESPUESTA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "respuesta" element
         */
        public void setRespuesta(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta respuesta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta target = null;
                target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta)get_store().find_element_user(RESPUESTA$4, 0);
                if (target == null)
                {
                    target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta)get_store().add_element_user(RESPUESTA$4);
                }
                target.set(respuesta);
            }
        }
        
        /**
         * Appends and returns a new empty "respuesta" element
         */
        public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta addNewRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta target = null;
                target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta)get_store().add_element_user(RESPUESTA$4);
                return target;
            }
        }
        /**
         * An XML peticion(@http://afirmaws/ws/custodia).
         *
         * This is an atomic type that is a restriction of afirmaws.ws.custodia.MensajeSalidaDocument$MensajeSalida$Peticion.
         */
        public static class PeticionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion
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
         * An XML respuesta(@http://afirmaws/ws/custodia).
         *
         * This is a complex type.
         */
        public static class RespuestaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta
        {
            private static final long serialVersionUID = 1L;
            
            public RespuestaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RESPUESTA$0 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "Respuesta");
            private static final javax.xml.namespace.QName EXCEPCION$2 = 
                new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "Excepcion");
            
            
            /**
             * Gets the "Respuesta" element
             */
            public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 getRespuesta()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 target = null;
                    target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2)get_store().find_element_user(RESPUESTA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Respuesta" element
             */
            public boolean isSetRespuesta()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESPUESTA$0) != 0;
                }
            }
            
            /**
             * Sets the "Respuesta" element
             */
            public void setRespuesta(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 respuesta)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 target = null;
                    target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2)get_store().find_element_user(RESPUESTA$0, 0);
                    if (target == null)
                    {
                      target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2)get_store().add_element_user(RESPUESTA$0);
                    }
                    target.set(respuesta);
                }
            }
            
            /**
             * Appends and returns a new empty "Respuesta" element
             */
            public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 addNewRespuesta()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 target = null;
                    target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2)get_store().add_element_user(RESPUESTA$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "Respuesta" element
             */
            public void unsetRespuesta()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESPUESTA$0, 0);
                }
            }
            
            /**
             * Gets the "Excepcion" element
             */
            public afirmaws.ws.custodia.ExcepcionDocument.Excepcion getExcepcion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    afirmaws.ws.custodia.ExcepcionDocument.Excepcion target = null;
                    target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().find_element_user(EXCEPCION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Excepcion" element
             */
            public boolean isSetExcepcion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EXCEPCION$2) != 0;
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
                    target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().find_element_user(EXCEPCION$2, 0);
                    if (target == null)
                    {
                      target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().add_element_user(EXCEPCION$2);
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
                    target = (afirmaws.ws.custodia.ExcepcionDocument.Excepcion)get_store().add_element_user(EXCEPCION$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "Excepcion" element
             */
            public void unsetExcepcion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EXCEPCION$2, 0);
                }
            }
            /**
             * An XML Respuesta(@http://afirmaws/ws/custodia).
             *
             * This is a complex type.
             */
            public static class RespuestaImpl2 extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2
            {
                private static final long serialVersionUID = 1L;
                
                public RespuestaImpl2(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName ESTADO$0 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "estado");
                private static final javax.xml.namespace.QName DESCRIPCION$2 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "descripcion");
                private static final javax.xml.namespace.QName IDTRANSACCIONES$4 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "idTransacciones");
                private static final javax.xml.namespace.QName FIRMAELECTRONICA$6 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "firmaElectronica");
                private static final javax.xml.namespace.QName FORMATOFIRMA$8 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "formatoFirma");
                private static final javax.xml.namespace.QName IDDOCUMENTO$10 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "idDocumento");
                private static final javax.xml.namespace.QName DOCUMENTO$12 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "documento");
                private static final javax.xml.namespace.QName BLOQUEFIRMAS$14 = 
                    new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "bloqueFirmas");
                
                
                /**
                 * Gets the "estado" element
                 */
                public boolean getEstado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$0, 0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "estado" element
                 */
                public org.apache.xmlbeans.XmlBoolean xgetEstado()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESTADO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "estado" element
                 */
                public void setEstado(boolean estado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADO$0);
                      }
                      target.setBooleanValue(estado);
                    }
                }
                
                /**
                 * Sets (as xml) the "estado" element
                 */
                public void xsetEstado(org.apache.xmlbeans.XmlBoolean estado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ESTADO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ESTADO$0);
                      }
                      target.set(estado);
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
                 * True if has "descripcion" element
                 */
                public boolean isSetDescripcion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DESCRIPCION$2) != 0;
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
                 * Unsets the "descripcion" element
                 */
                public void unsetDescripcion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DESCRIPCION$2, 0);
                    }
                }
                
                /**
                 * Gets the "idTransacciones" element
                 */
                public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones getIdTransacciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones target = null;
                      target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones)get_store().find_element_user(IDTRANSACCIONES$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "idTransacciones" element
                 */
                public boolean isSetIdTransacciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(IDTRANSACCIONES$4) != 0;
                    }
                }
                
                /**
                 * Sets the "idTransacciones" element
                 */
                public void setIdTransacciones(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones idTransacciones)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones target = null;
                      target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones)get_store().find_element_user(IDTRANSACCIONES$4, 0);
                      if (target == null)
                      {
                        target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones)get_store().add_element_user(IDTRANSACCIONES$4);
                      }
                      target.set(idTransacciones);
                    }
                }
                
                /**
                 * Appends and returns a new empty "idTransacciones" element
                 */
                public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones addNewIdTransacciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones target = null;
                      target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones)get_store().add_element_user(IDTRANSACCIONES$4);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "idTransacciones" element
                 */
                public void unsetIdTransacciones()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(IDTRANSACCIONES$4, 0);
                    }
                }
                
                /**
                 * Gets the "firmaElectronica" element
                 */
                public byte[] getFirmaElectronica()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRMAELECTRONICA$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "firmaElectronica" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetFirmaElectronica()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FIRMAELECTRONICA$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "firmaElectronica" element
                 */
                public boolean isSetFirmaElectronica()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FIRMAELECTRONICA$6) != 0;
                    }
                }
                
                /**
                 * Sets the "firmaElectronica" element
                 */
                public void setFirmaElectronica(byte[] firmaElectronica)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRMAELECTRONICA$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRMAELECTRONICA$6);
                      }
                      target.setByteArrayValue(firmaElectronica);
                    }
                }
                
                /**
                 * Sets (as xml) the "firmaElectronica" element
                 */
                public void xsetFirmaElectronica(org.apache.xmlbeans.XmlBase64Binary firmaElectronica)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FIRMAELECTRONICA$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(FIRMAELECTRONICA$6);
                      }
                      target.set(firmaElectronica);
                    }
                }
                
                /**
                 * Unsets the "firmaElectronica" element
                 */
                public void unsetFirmaElectronica()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FIRMAELECTRONICA$6, 0);
                    }
                }
                
                /**
                 * Gets the "formatoFirma" element
                 */
                public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma.Enum getFormatoFirma()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATOFIRMA$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "formatoFirma" element
                 */
                public afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma xgetFormatoFirma()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma target = null;
                      target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma)get_store().find_element_user(FORMATOFIRMA$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "formatoFirma" element
                 */
                public boolean isSetFormatoFirma()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FORMATOFIRMA$8) != 0;
                    }
                }
                
                /**
                 * Sets the "formatoFirma" element
                 */
                public void setFormatoFirma(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma.Enum formatoFirma)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATOFIRMA$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMATOFIRMA$8);
                      }
                      target.setEnumValue(formatoFirma);
                    }
                }
                
                /**
                 * Sets (as xml) the "formatoFirma" element
                 */
                public void xsetFormatoFirma(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma formatoFirma)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma target = null;
                      target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma)get_store().find_element_user(FORMATOFIRMA$8, 0);
                      if (target == null)
                      {
                        target = (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma)get_store().add_element_user(FORMATOFIRMA$8);
                      }
                      target.set(formatoFirma);
                    }
                }
                
                /**
                 * Unsets the "formatoFirma" element
                 */
                public void unsetFormatoFirma()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FORMATOFIRMA$8, 0);
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
                 * Gets the "documento" element
                 */
                public byte[] getDocumento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTO$12, 0);
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
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DOCUMENTO$12, 0);
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
                      return get_store().count_elements(DOCUMENTO$12) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTO$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTO$12);
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
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DOCUMENTO$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DOCUMENTO$12);
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
                      get_store().remove_element(DOCUMENTO$12, 0);
                    }
                }
                
                /**
                 * Gets the "bloqueFirmas" element
                 */
                public byte[] getBloqueFirmas()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUEFIRMAS$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bloqueFirmas" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetBloqueFirmas()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BLOQUEFIRMAS$14, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "bloqueFirmas" element
                 */
                public boolean isSetBloqueFirmas()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(BLOQUEFIRMAS$14) != 0;
                    }
                }
                
                /**
                 * Sets the "bloqueFirmas" element
                 */
                public void setBloqueFirmas(byte[] bloqueFirmas)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOQUEFIRMAS$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOQUEFIRMAS$14);
                      }
                      target.setByteArrayValue(bloqueFirmas);
                    }
                }
                
                /**
                 * Sets (as xml) the "bloqueFirmas" element
                 */
                public void xsetBloqueFirmas(org.apache.xmlbeans.XmlBase64Binary bloqueFirmas)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BLOQUEFIRMAS$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(BLOQUEFIRMAS$14);
                      }
                      target.set(bloqueFirmas);
                    }
                }
                
                /**
                 * Unsets the "bloqueFirmas" element
                 */
                public void unsetBloqueFirmas()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(BLOQUEFIRMAS$14, 0);
                    }
                }
                /**
                 * An XML idTransacciones(@http://afirmaws/ws/custodia).
                 *
                 * This is a complex type.
                 */
                public static class IdTransaccionesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IdTransaccionesImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName IDTRANSACCION$0 = 
                      new javax.xml.namespace.QName("http://afirmaws/ws/custodia", "idTransaccion");
                    
                    
                    /**
                     * Gets array of all "idTransaccion" elements
                     */
                    public java.lang.String[] getIdTransaccionArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(IDTRANSACCION$0, targetList);
                        java.lang.String[] result = new java.lang.String[targetList.size()];
                        for (int i = 0, len = targetList.size() ; i < len ; i++)
                            result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "idTransaccion" element
                     */
                    public java.lang.String getIdTransaccionArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) array of all "idTransaccion" elements
                     */
                    public org.apache.xmlbeans.XmlString[] xgetIdTransaccionArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(IDTRANSACCION$0, targetList);
                        org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets (as xml) ith "idTransaccion" element
                     */
                    public org.apache.xmlbeans.XmlString xgetIdTransaccionArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return (org.apache.xmlbeans.XmlString)target;
                      }
                    }
                    
                    /**
                     * Returns number of "idTransaccion" element
                     */
                    public int sizeOfIdTransaccionArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(IDTRANSACCION$0);
                      }
                    }
                    
                    /**
                     * Sets array of all "idTransaccion" element
                     */
                    public void setIdTransaccionArray(java.lang.String[] idTransaccionArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(idTransaccionArray, IDTRANSACCION$0);
                      }
                    }
                    
                    /**
                     * Sets ith "idTransaccion" element
                     */
                    public void setIdTransaccionArray(int i, java.lang.String idTransaccion)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDTRANSACCION$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.setStringValue(idTransaccion);
                      }
                    }
                    
                    /**
                     * Sets (as xml) array of all "idTransaccion" element
                     */
                    public void xsetIdTransaccionArray(org.apache.xmlbeans.XmlString[]idTransaccionArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(idTransaccionArray, IDTRANSACCION$0);
                      }
                    }
                    
                    /**
                     * Sets (as xml) ith "idTransaccion" element
                     */
                    public void xsetIdTransaccionArray(int i, org.apache.xmlbeans.XmlString idTransaccion)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDTRANSACCION$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(idTransaccion);
                      }
                    }
                    
                    /**
                     * Inserts the value as the ith "idTransaccion" element
                     */
                    public void insertIdTransaccion(int i, java.lang.String idTransaccion)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = 
                          (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDTRANSACCION$0, i);
                        target.setStringValue(idTransaccion);
                      }
                    }
                    
                    /**
                     * Appends the value as the last "idTransaccion" element
                     */
                    public void addIdTransaccion(java.lang.String idTransaccion)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDTRANSACCION$0);
                        target.setStringValue(idTransaccion);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "idTransaccion" element
                     */
                    public org.apache.xmlbeans.XmlString insertNewIdTransaccion(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IDTRANSACCION$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "idTransaccion" element
                     */
                    public org.apache.xmlbeans.XmlString addNewIdTransaccion()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDTRANSACCION$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "idTransaccion" element
                     */
                    public void removeIdTransaccion(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(IDTRANSACCION$0, i);
                      }
                    }
                }
                /**
                 * An XML formatoFirma(@http://afirmaws/ws/custodia).
                 *
                 * This is an atomic type that is a restriction of afirmaws.ws.custodia.MensajeSalidaDocument$MensajeSalida$Respuesta$Respuesta2$FormatoFirma.
                 */
                public static class FormatoFirmaImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FormatoFirmaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FormatoFirmaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
    }
}
