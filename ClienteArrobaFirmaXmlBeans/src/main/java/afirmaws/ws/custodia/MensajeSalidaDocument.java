/*
 * An XML document type.
 * Localname: mensajeSalida
 * Namespace: http://afirmaws/ws/custodia
 * Java type: afirmaws.ws.custodia.MensajeSalidaDocument
 *
 * Automatically generated - do not modify.
 */
package afirmaws.ws.custodia;


/**
 * A document containing one mensajeSalida(@http://afirmaws/ws/custodia) element.
 *
 * This is a complex type.
 */
public interface MensajeSalidaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MensajeSalidaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("mensajesalida9e02doctype");
    
    /**
     * Gets the "mensajeSalida" element
     */
    afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida getMensajeSalida();
    
    /**
     * Sets the "mensajeSalida" element
     */
    void setMensajeSalida(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida mensajeSalida);
    
    /**
     * Appends and returns a new empty "mensajeSalida" element
     */
    afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida addNewMensajeSalida();
    
    /**
     * An XML mensajeSalida(@http://afirmaws/ws/custodia).
     *
     * This is a complex type.
     */
    public interface MensajeSalida extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MensajeSalida.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("mensajesalida85b5elemtype");
        
        /**
         * Gets the "peticion" element
         */
        afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion.Enum getPeticion();
        
        /**
         * Gets (as xml) the "peticion" element
         */
        afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion xgetPeticion();
        
        /**
         * Sets the "peticion" element
         */
        void setPeticion(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion.Enum peticion);
        
        /**
         * Sets (as xml) the "peticion" element
         */
        void xsetPeticion(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion peticion);
        
        /**
         * Gets the "versionMsg" element
         */
        java.lang.String getVersionMsg();
        
        /**
         * Gets (as xml) the "versionMsg" element
         */
        org.apache.xmlbeans.XmlString xgetVersionMsg();
        
        /**
         * Sets the "versionMsg" element
         */
        void setVersionMsg(java.lang.String versionMsg);
        
        /**
         * Sets (as xml) the "versionMsg" element
         */
        void xsetVersionMsg(org.apache.xmlbeans.XmlString versionMsg);
        
        /**
         * Gets the "respuesta" element
         */
        afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta getRespuesta();
        
        /**
         * Sets the "respuesta" element
         */
        void setRespuesta(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta respuesta);
        
        /**
         * Appends and returns a new empty "respuesta" element
         */
        afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta addNewRespuesta();
        
        /**
         * An XML peticion(@http://afirmaws/ws/custodia).
         *
         * This is an atomic type that is a restriction of afirmaws.ws.custodia.MensajeSalidaDocument$MensajeSalida$Peticion.
         */
        public interface Peticion extends afirmaws.ws.custodia.CadenaSinEspacios
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Peticion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("peticion82c0elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ALMACENAR_DOCUMENTO = Enum.forString("AlmacenarDocumento");
            static final Enum ELIMINAR_CONTENIDO_DOCUMENTO = Enum.forString("EliminarContenidoDocumento");
            static final Enum ACTUALIZAR_REFERENCIA = Enum.forString("ActualizarReferencia");
            static final Enum OBTENER_TRANSACCIONES_POR_FECHA = Enum.forString("ObtenerTransaccionesPorFecha");
            static final Enum OBTENER_TRANSACCIONES = Enum.forString("ObtenerTransacciones");
            static final Enum OBTENER_ID_DOCUMENTO = Enum.forString("ObtenerIdDocumento");
            static final Enum OBTENER_FIRMA_TRANSACCION = Enum.forString("ObtenerFirmaTransaccion");
            static final Enum OBTENER_CONTENIDO_DOCUMENTO = Enum.forString("ObtenerContenidoDocumento");
            static final Enum OBTENER_BLOQUE_FIRMAS = Enum.forString("ObtenerBloqueFirmas");
            static final Enum OBTENER_TRANSACCIONES_REFERENCIA = Enum.forString("ObtenerTransaccionesReferencia");
            static final Enum OBTENER_CONTENIDO_DOCUMENTO_ID = Enum.forString("ObtenerContenidoDocumentoId");
            
            static final int INT_ALMACENAR_DOCUMENTO = Enum.INT_ALMACENAR_DOCUMENTO;
            static final int INT_ELIMINAR_CONTENIDO_DOCUMENTO = Enum.INT_ELIMINAR_CONTENIDO_DOCUMENTO;
            static final int INT_ACTUALIZAR_REFERENCIA = Enum.INT_ACTUALIZAR_REFERENCIA;
            static final int INT_OBTENER_TRANSACCIONES_POR_FECHA = Enum.INT_OBTENER_TRANSACCIONES_POR_FECHA;
            static final int INT_OBTENER_TRANSACCIONES = Enum.INT_OBTENER_TRANSACCIONES;
            static final int INT_OBTENER_ID_DOCUMENTO = Enum.INT_OBTENER_ID_DOCUMENTO;
            static final int INT_OBTENER_FIRMA_TRANSACCION = Enum.INT_OBTENER_FIRMA_TRANSACCION;
            static final int INT_OBTENER_CONTENIDO_DOCUMENTO = Enum.INT_OBTENER_CONTENIDO_DOCUMENTO;
            static final int INT_OBTENER_BLOQUE_FIRMAS = Enum.INT_OBTENER_BLOQUE_FIRMAS;
            static final int INT_OBTENER_TRANSACCIONES_REFERENCIA = Enum.INT_OBTENER_TRANSACCIONES_REFERENCIA;
            static final int INT_OBTENER_CONTENIDO_DOCUMENTO_ID = Enum.INT_OBTENER_CONTENIDO_DOCUMENTO_ID;
            
            /**
             * Enumeration value class for afirmaws.ws.custodia.MensajeSalidaDocument$MensajeSalida$Peticion.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ALMACENAR_DOCUMENTO
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_ALMACENAR_DOCUMENTO = 1;
                static final int INT_ELIMINAR_CONTENIDO_DOCUMENTO = 2;
                static final int INT_ACTUALIZAR_REFERENCIA = 3;
                static final int INT_OBTENER_TRANSACCIONES_POR_FECHA = 4;
                static final int INT_OBTENER_TRANSACCIONES = 5;
                static final int INT_OBTENER_ID_DOCUMENTO = 6;
                static final int INT_OBTENER_FIRMA_TRANSACCION = 7;
                static final int INT_OBTENER_CONTENIDO_DOCUMENTO = 8;
                static final int INT_OBTENER_BLOQUE_FIRMAS = 9;
                static final int INT_OBTENER_TRANSACCIONES_REFERENCIA = 10;
                static final int INT_OBTENER_CONTENIDO_DOCUMENTO_ID = 11;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("AlmacenarDocumento", INT_ALMACENAR_DOCUMENTO),
                      new Enum("EliminarContenidoDocumento", INT_ELIMINAR_CONTENIDO_DOCUMENTO),
                      new Enum("ActualizarReferencia", INT_ACTUALIZAR_REFERENCIA),
                      new Enum("ObtenerTransaccionesPorFecha", INT_OBTENER_TRANSACCIONES_POR_FECHA),
                      new Enum("ObtenerTransacciones", INT_OBTENER_TRANSACCIONES),
                      new Enum("ObtenerIdDocumento", INT_OBTENER_ID_DOCUMENTO),
                      new Enum("ObtenerFirmaTransaccion", INT_OBTENER_FIRMA_TRANSACCION),
                      new Enum("ObtenerContenidoDocumento", INT_OBTENER_CONTENIDO_DOCUMENTO),
                      new Enum("ObtenerBloqueFirmas", INT_OBTENER_BLOQUE_FIRMAS),
                      new Enum("ObtenerTransaccionesReferencia", INT_OBTENER_TRANSACCIONES_REFERENCIA),
                      new Enum("ObtenerContenidoDocumentoId", INT_OBTENER_CONTENIDO_DOCUMENTO_ID),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion newValue(java.lang.Object obj) {
                  return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion) type.newValue( obj ); }
                
                public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion newInstance() {
                  return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Peticion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML respuesta(@http://afirmaws/ws/custodia).
         *
         * This is a complex type.
         */
        public interface Respuesta extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Respuesta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("respuesta29e1elemtype");
            
            /**
             * Gets the "Respuesta" element
             */
            afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 getRespuesta();
            
            /**
             * True if has "Respuesta" element
             */
            boolean isSetRespuesta();
            
            /**
             * Sets the "Respuesta" element
             */
            void setRespuesta(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 respuesta);
            
            /**
             * Appends and returns a new empty "Respuesta" element
             */
            afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 addNewRespuesta();
            
            /**
             * Unsets the "Respuesta" element
             */
            void unsetRespuesta();
            
            /**
             * Gets the "Excepcion" element
             */
            afirmaws.ws.custodia.ExcepcionDocument.Excepcion getExcepcion();
            
            /**
             * True if has "Excepcion" element
             */
            boolean isSetExcepcion();
            
            /**
             * Sets the "Excepcion" element
             */
            void setExcepcion(afirmaws.ws.custodia.ExcepcionDocument.Excepcion excepcion);
            
            /**
             * Appends and returns a new empty "Excepcion" element
             */
            afirmaws.ws.custodia.ExcepcionDocument.Excepcion addNewExcepcion();
            
            /**
             * Unsets the "Excepcion" element
             */
            void unsetExcepcion();
            
            /**
             * An XML Respuesta(@http://afirmaws/ws/custodia).
             *
             * This is a complex type.
             */
            public interface Respuesta2 extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Respuesta2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("respuesta2bedelemtype");
                
                /**
                 * Gets the "estado" element
                 */
                boolean getEstado();
                
                /**
                 * Gets (as xml) the "estado" element
                 */
                org.apache.xmlbeans.XmlBoolean xgetEstado();
                
                /**
                 * Sets the "estado" element
                 */
                void setEstado(boolean estado);
                
                /**
                 * Sets (as xml) the "estado" element
                 */
                void xsetEstado(org.apache.xmlbeans.XmlBoolean estado);
                
                /**
                 * Gets the "descripcion" element
                 */
                java.lang.String getDescripcion();
                
                /**
                 * Gets (as xml) the "descripcion" element
                 */
                org.apache.xmlbeans.XmlString xgetDescripcion();
                
                /**
                 * True if has "descripcion" element
                 */
                boolean isSetDescripcion();
                
                /**
                 * Sets the "descripcion" element
                 */
                void setDescripcion(java.lang.String descripcion);
                
                /**
                 * Sets (as xml) the "descripcion" element
                 */
                void xsetDescripcion(org.apache.xmlbeans.XmlString descripcion);
                
                /**
                 * Unsets the "descripcion" element
                 */
                void unsetDescripcion();
                
                /**
                 * Gets the "idTransacciones" element
                 */
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones getIdTransacciones();
                
                /**
                 * True if has "idTransacciones" element
                 */
                boolean isSetIdTransacciones();
                
                /**
                 * Sets the "idTransacciones" element
                 */
                void setIdTransacciones(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones idTransacciones);
                
                /**
                 * Appends and returns a new empty "idTransacciones" element
                 */
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones addNewIdTransacciones();
                
                /**
                 * Unsets the "idTransacciones" element
                 */
                void unsetIdTransacciones();
                
                /**
                 * Gets the "firmaElectronica" element
                 */
                byte[] getFirmaElectronica();
                
                /**
                 * Gets (as xml) the "firmaElectronica" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetFirmaElectronica();
                
                /**
                 * True if has "firmaElectronica" element
                 */
                boolean isSetFirmaElectronica();
                
                /**
                 * Sets the "firmaElectronica" element
                 */
                void setFirmaElectronica(byte[] firmaElectronica);
                
                /**
                 * Sets (as xml) the "firmaElectronica" element
                 */
                void xsetFirmaElectronica(org.apache.xmlbeans.XmlBase64Binary firmaElectronica);
                
                /**
                 * Unsets the "firmaElectronica" element
                 */
                void unsetFirmaElectronica();
                
                /**
                 * Gets the "formatoFirma" element
                 */
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma.Enum getFormatoFirma();
                
                /**
                 * Gets (as xml) the "formatoFirma" element
                 */
                afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma xgetFormatoFirma();
                
                /**
                 * True if has "formatoFirma" element
                 */
                boolean isSetFormatoFirma();
                
                /**
                 * Sets the "formatoFirma" element
                 */
                void setFormatoFirma(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma.Enum formatoFirma);
                
                /**
                 * Sets (as xml) the "formatoFirma" element
                 */
                void xsetFormatoFirma(afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma formatoFirma);
                
                /**
                 * Unsets the "formatoFirma" element
                 */
                void unsetFormatoFirma();
                
                /**
                 * Gets the "idDocumento" element
                 */
                java.lang.String getIdDocumento();
                
                /**
                 * Gets (as xml) the "idDocumento" element
                 */
                org.apache.xmlbeans.XmlString xgetIdDocumento();
                
                /**
                 * True if has "idDocumento" element
                 */
                boolean isSetIdDocumento();
                
                /**
                 * Sets the "idDocumento" element
                 */
                void setIdDocumento(java.lang.String idDocumento);
                
                /**
                 * Sets (as xml) the "idDocumento" element
                 */
                void xsetIdDocumento(org.apache.xmlbeans.XmlString idDocumento);
                
                /**
                 * Unsets the "idDocumento" element
                 */
                void unsetIdDocumento();
                
                /**
                 * Gets the "documento" element
                 */
                byte[] getDocumento();
                
                /**
                 * Gets (as xml) the "documento" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetDocumento();
                
                /**
                 * True if has "documento" element
                 */
                boolean isSetDocumento();
                
                /**
                 * Sets the "documento" element
                 */
                void setDocumento(byte[] documento);
                
                /**
                 * Sets (as xml) the "documento" element
                 */
                void xsetDocumento(org.apache.xmlbeans.XmlBase64Binary documento);
                
                /**
                 * Unsets the "documento" element
                 */
                void unsetDocumento();
                
                /**
                 * Gets the "bloqueFirmas" element
                 */
                byte[] getBloqueFirmas();
                
                /**
                 * Gets (as xml) the "bloqueFirmas" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetBloqueFirmas();
                
                /**
                 * True if has "bloqueFirmas" element
                 */
                boolean isSetBloqueFirmas();
                
                /**
                 * Sets the "bloqueFirmas" element
                 */
                void setBloqueFirmas(byte[] bloqueFirmas);
                
                /**
                 * Sets (as xml) the "bloqueFirmas" element
                 */
                void xsetBloqueFirmas(org.apache.xmlbeans.XmlBase64Binary bloqueFirmas);
                
                /**
                 * Unsets the "bloqueFirmas" element
                 */
                void unsetBloqueFirmas();
                
                /**
                 * An XML idTransacciones(@http://afirmaws/ws/custodia).
                 *
                 * This is a complex type.
                 */
                public interface IdTransacciones extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdTransacciones.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("idtransacciones617belemtype");
                    
                    /**
                     * Gets array of all "idTransaccion" elements
                     */
                    java.lang.String[] getIdTransaccionArray();
                    
                    /**
                     * Gets ith "idTransaccion" element
                     */
                    java.lang.String getIdTransaccionArray(int i);
                    
                    /**
                     * Gets (as xml) array of all "idTransaccion" elements
                     */
                    org.apache.xmlbeans.XmlString[] xgetIdTransaccionArray();
                    
                    /**
                     * Gets (as xml) ith "idTransaccion" element
                     */
                    org.apache.xmlbeans.XmlString xgetIdTransaccionArray(int i);
                    
                    /**
                     * Returns number of "idTransaccion" element
                     */
                    int sizeOfIdTransaccionArray();
                    
                    /**
                     * Sets array of all "idTransaccion" element
                     */
                    void setIdTransaccionArray(java.lang.String[] idTransaccionArray);
                    
                    /**
                     * Sets ith "idTransaccion" element
                     */
                    void setIdTransaccionArray(int i, java.lang.String idTransaccion);
                    
                    /**
                     * Sets (as xml) array of all "idTransaccion" element
                     */
                    void xsetIdTransaccionArray(org.apache.xmlbeans.XmlString[] idTransaccionArray);
                    
                    /**
                     * Sets (as xml) ith "idTransaccion" element
                     */
                    void xsetIdTransaccionArray(int i, org.apache.xmlbeans.XmlString idTransaccion);
                    
                    /**
                     * Inserts the value as the ith "idTransaccion" element
                     */
                    void insertIdTransaccion(int i, java.lang.String idTransaccion);
                    
                    /**
                     * Appends the value as the last "idTransaccion" element
                     */
                    void addIdTransaccion(java.lang.String idTransaccion);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "idTransaccion" element
                     */
                    org.apache.xmlbeans.XmlString insertNewIdTransaccion(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "idTransaccion" element
                     */
                    org.apache.xmlbeans.XmlString addNewIdTransaccion();
                    
                    /**
                     * Removes the ith "idTransaccion" element
                     */
                    void removeIdTransaccion(int i);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones newInstance() {
                        return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.IdTransacciones) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML formatoFirma(@http://afirmaws/ws/custodia).
                 *
                 * This is an atomic type that is a restriction of afirmaws.ws.custodia.MensajeSalidaDocument$MensajeSalida$Respuesta$Respuesta2$FormatoFirma.
                 */
                public interface FormatoFirma extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatoFirma.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("formatofirmac074elemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum CMS = Enum.forString("CMS");
                    static final Enum CMS_T = Enum.forString("CMS-T");
                    static final Enum CADES_BES = Enum.forString("CADES-BES");
                    static final Enum CADES_T = Enum.forString("CADES-T");
                    static final Enum ODF = Enum.forString("ODF");
                    static final Enum PDF = Enum.forString("PDF");
                    static final Enum PKCS_7 = Enum.forString("PKCS7");
                    static final Enum XADES_BES = Enum.forString("XADES-BES");
                    static final Enum XADES_T = Enum.forString("XADES-T");
                    static final Enum XMLDSIG = Enum.forString("XMLDSIG");
                    
                    static final int INT_CMS = Enum.INT_CMS;
                    static final int INT_CMS_T = Enum.INT_CMS_T;
                    static final int INT_CADES_BES = Enum.INT_CADES_BES;
                    static final int INT_CADES_T = Enum.INT_CADES_T;
                    static final int INT_ODF = Enum.INT_ODF;
                    static final int INT_PDF = Enum.INT_PDF;
                    static final int INT_PKCS_7 = Enum.INT_PKCS_7;
                    static final int INT_XADES_BES = Enum.INT_XADES_BES;
                    static final int INT_XADES_T = Enum.INT_XADES_T;
                    static final int INT_XMLDSIG = Enum.INT_XMLDSIG;
                    
                    /**
                     * Enumeration value class for afirmaws.ws.custodia.MensajeSalidaDocument$MensajeSalida$Respuesta$Respuesta2$FormatoFirma.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_CMS
                     * Enum.forString(s); // returns the enum value for a string
                     * Enum.forInt(i); // returns the enum value for an int
                     * </pre>
                     * Enumeration objects are immutable singleton objects that
                     * can be compared using == object equality. They have no
                     * public constructor. See the constants defined within this
                     * class for all the valid values.
                     */
                    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                    {
                      /**
                       * Returns the enum value for a string, or null if none.
                       */
                      public static Enum forString(java.lang.String s)
                          { return (Enum)table.forString(s); }
                      /**
                       * Returns the enum value corresponding to an int, or null if none.
                       */
                      public static Enum forInt(int i)
                          { return (Enum)table.forInt(i); }
                      
                      private Enum(java.lang.String s, int i)
                          { super(s, i); }
                      
                      static final int INT_CMS = 1;
                      static final int INT_CMS_T = 2;
                      static final int INT_CADES_BES = 3;
                      static final int INT_CADES_T = 4;
                      static final int INT_ODF = 5;
                      static final int INT_PDF = 6;
                      static final int INT_PKCS_7 = 7;
                      static final int INT_XADES_BES = 8;
                      static final int INT_XADES_T = 9;
                      static final int INT_XMLDSIG = 10;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("CMS", INT_CMS),
                          new Enum("CMS-T", INT_CMS_T),
                          new Enum("CADES-BES", INT_CADES_BES),
                          new Enum("CADES-T", INT_CADES_T),
                          new Enum("ODF", INT_ODF),
                          new Enum("PDF", INT_PDF),
                          new Enum("PKCS7", INT_PKCS_7),
                          new Enum("XADES-BES", INT_XADES_BES),
                          new Enum("XADES-T", INT_XADES_T),
                          new Enum("XMLDSIG", INT_XMLDSIG),
                        }
                      );
                      private static final long serialVersionUID = 1L;
                      private java.lang.Object readResolve() { return forInt(intValue()); } 
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma newValue(java.lang.Object obj) {
                        return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma) type.newValue( obj ); }
                      
                      public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma newInstance() {
                        return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2.FormatoFirma) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 newInstance() {
                      return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta.Respuesta2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta newInstance() {
                  return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida.Respuesta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida newInstance() {
              return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (afirmaws.ws.custodia.MensajeSalidaDocument.MensajeSalida) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static afirmaws.ws.custodia.MensajeSalidaDocument newInstance() {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static afirmaws.ws.custodia.MensajeSalidaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (afirmaws.ws.custodia.MensajeSalidaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
