/*
 * An XML document type.
 * Localname: mensajeEntrada
 * Namespace: http://afirmaws/ws/custodia
 * Java type: afirmaws.ws.custodia.MensajeEntradaDocument
 *
 * Automatically generated - do not modify.
 */
package afirmaws.ws.custodia;


/**
 * A document containing one mensajeEntrada(@http://afirmaws/ws/custodia) element.
 *
 * This is a complex type.
 */
public interface MensajeEntradaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MensajeEntradaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("mensajeentradab8c5doctype");
    
    /**
     * Gets the "mensajeEntrada" element
     */
    afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada getMensajeEntrada();
    
    /**
     * Sets the "mensajeEntrada" element
     */
    void setMensajeEntrada(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada mensajeEntrada);
    
    /**
     * Appends and returns a new empty "mensajeEntrada" element
     */
    afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada addNewMensajeEntrada();
    
    /**
     * An XML mensajeEntrada(@http://afirmaws/ws/custodia).
     *
     * This is a complex type.
     */
    public interface MensajeEntrada extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MensajeEntrada.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("mensajeentrada0031elemtype");
        
        /**
         * Gets the "peticion" element
         */
        afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion.Enum getPeticion();
        
        /**
         * Gets (as xml) the "peticion" element
         */
        afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion xgetPeticion();
        
        /**
         * Sets the "peticion" element
         */
        void setPeticion(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion.Enum peticion);
        
        /**
         * Sets (as xml) the "peticion" element
         */
        void xsetPeticion(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion peticion);
        
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
         * Gets the "parametros" element
         */
        afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros getParametros();
        
        /**
         * Sets the "parametros" element
         */
        void setParametros(afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros parametros);
        
        /**
         * Appends and returns a new empty "parametros" element
         */
        afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros addNewParametros();
        
        /**
         * An XML peticion(@http://afirmaws/ws/custodia).
         *
         * This is an atomic type that is a restriction of afirmaws.ws.custodia.MensajeEntradaDocument$MensajeEntrada$Peticion.
         */
        public interface Peticion extends afirmaws.ws.custodia.CadenaSinEspacios
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Peticion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("peticione67celemtype");
            
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
             * Enumeration value class for afirmaws.ws.custodia.MensajeEntradaDocument$MensajeEntrada$Peticion.
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
                public static afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion newValue(java.lang.Object obj) {
                  return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion) type.newValue( obj ); }
                
                public static afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion newInstance() {
                  return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Peticion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML parametros(@http://afirmaws/ws/custodia).
         *
         * This is a complex type.
         */
        public interface Parametros extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parametros.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("parametros32a7elemtype");
            
            /**
             * Gets the "idAplicacion" element
             */
            java.lang.String getIdAplicacion();
            
            /**
             * Gets (as xml) the "idAplicacion" element
             */
            org.apache.xmlbeans.XmlString xgetIdAplicacion();
            
            /**
             * Sets the "idAplicacion" element
             */
            void setIdAplicacion(java.lang.String idAplicacion);
            
            /**
             * Sets (as xml) the "idAplicacion" element
             */
            void xsetIdAplicacion(org.apache.xmlbeans.XmlString idAplicacion);
            
            /**
             * Gets the "idTransaccion" element
             */
            java.lang.String getIdTransaccion();
            
            /**
             * Gets (as xml) the "idTransaccion" element
             */
            org.apache.xmlbeans.XmlString xgetIdTransaccion();
            
            /**
             * True if has "idTransaccion" element
             */
            boolean isSetIdTransaccion();
            
            /**
             * Sets the "idTransaccion" element
             */
            void setIdTransaccion(java.lang.String idTransaccion);
            
            /**
             * Sets (as xml) the "idTransaccion" element
             */
            void xsetIdTransaccion(org.apache.xmlbeans.XmlString idTransaccion);
            
            /**
             * Unsets the "idTransaccion" element
             */
            void unsetIdTransaccion();
            
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
             * Gets the "nombreDocumento" element
             */
            java.lang.String getNombreDocumento();
            
            /**
             * Gets (as xml) the "nombreDocumento" element
             */
            org.apache.xmlbeans.XmlString xgetNombreDocumento();
            
            /**
             * True if has "nombreDocumento" element
             */
            boolean isSetNombreDocumento();
            
            /**
             * Sets the "nombreDocumento" element
             */
            void setNombreDocumento(java.lang.String nombreDocumento);
            
            /**
             * Sets (as xml) the "nombreDocumento" element
             */
            void xsetNombreDocumento(org.apache.xmlbeans.XmlString nombreDocumento);
            
            /**
             * Unsets the "nombreDocumento" element
             */
            void unsetNombreDocumento();
            
            /**
             * Gets the "tipoDocumento" element
             */
            java.lang.String getTipoDocumento();
            
            /**
             * Gets (as xml) the "tipoDocumento" element
             */
            org.apache.xmlbeans.XmlString xgetTipoDocumento();
            
            /**
             * True if has "tipoDocumento" element
             */
            boolean isSetTipoDocumento();
            
            /**
             * Sets the "tipoDocumento" element
             */
            void setTipoDocumento(java.lang.String tipoDocumento);
            
            /**
             * Sets (as xml) the "tipoDocumento" element
             */
            void xsetTipoDocumento(org.apache.xmlbeans.XmlString tipoDocumento);
            
            /**
             * Unsets the "tipoDocumento" element
             */
            void unsetTipoDocumento();
            
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
             * Gets the "referencia" element
             */
            java.lang.String getReferencia();
            
            /**
             * Gets (as xml) the "referencia" element
             */
            org.apache.xmlbeans.XmlString xgetReferencia();
            
            /**
             * True if has "referencia" element
             */
            boolean isSetReferencia();
            
            /**
             * Sets the "referencia" element
             */
            void setReferencia(java.lang.String referencia);
            
            /**
             * Sets (as xml) the "referencia" element
             */
            void xsetReferencia(org.apache.xmlbeans.XmlString referencia);
            
            /**
             * Unsets the "referencia" element
             */
            void unsetReferencia();
            
            /**
             * Gets the "idReferencia" element
             */
            java.lang.String getIdReferencia();
            
            /**
             * Gets (as xml) the "idReferencia" element
             */
            org.apache.xmlbeans.XmlString xgetIdReferencia();
            
            /**
             * True if has "idReferencia" element
             */
            boolean isSetIdReferencia();
            
            /**
             * Sets the "idReferencia" element
             */
            void setIdReferencia(java.lang.String idReferencia);
            
            /**
             * Sets (as xml) the "idReferencia" element
             */
            void xsetIdReferencia(org.apache.xmlbeans.XmlString idReferencia);
            
            /**
             * Unsets the "idReferencia" element
             */
            void unsetIdReferencia();
            
            /**
             * Gets the "fechaInicial" element
             */
            java.lang.String getFechaInicial();
            
            /**
             * Gets (as xml) the "fechaInicial" element
             */
            org.apache.xmlbeans.XmlString xgetFechaInicial();
            
            /**
             * True if has "fechaInicial" element
             */
            boolean isSetFechaInicial();
            
            /**
             * Sets the "fechaInicial" element
             */
            void setFechaInicial(java.lang.String fechaInicial);
            
            /**
             * Sets (as xml) the "fechaInicial" element
             */
            void xsetFechaInicial(org.apache.xmlbeans.XmlString fechaInicial);
            
            /**
             * Unsets the "fechaInicial" element
             */
            void unsetFechaInicial();
            
            /**
             * Gets the "fechaFinal" element
             */
            java.lang.String getFechaFinal();
            
            /**
             * Gets (as xml) the "fechaFinal" element
             */
            org.apache.xmlbeans.XmlString xgetFechaFinal();
            
            /**
             * True if has "fechaFinal" element
             */
            boolean isSetFechaFinal();
            
            /**
             * Sets the "fechaFinal" element
             */
            void setFechaFinal(java.lang.String fechaFinal);
            
            /**
             * Sets (as xml) the "fechaFinal" element
             */
            void xsetFechaFinal(org.apache.xmlbeans.XmlString fechaFinal);
            
            /**
             * Unsets the "fechaFinal" element
             */
            void unsetFechaFinal();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros newInstance() {
                  return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada.Parametros) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada newInstance() {
              return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (afirmaws.ws.custodia.MensajeEntradaDocument.MensajeEntrada) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static afirmaws.ws.custodia.MensajeEntradaDocument newInstance() {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static afirmaws.ws.custodia.MensajeEntradaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (afirmaws.ws.custodia.MensajeEntradaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
