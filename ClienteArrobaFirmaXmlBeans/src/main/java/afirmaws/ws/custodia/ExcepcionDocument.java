/*
 * An XML document type.
 * Localname: Excepcion
 * Namespace: http://afirmaws/ws/custodia
 * Java type: afirmaws.ws.custodia.ExcepcionDocument
 *
 * Automatically generated - do not modify.
 */
package afirmaws.ws.custodia;


/**
 * A document containing one Excepcion(@http://afirmaws/ws/custodia) element.
 *
 * This is a complex type.
 */
public interface ExcepcionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExcepcionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("excepcion961bdoctype");
    
    /**
     * Gets the "Excepcion" element
     */
    afirmaws.ws.custodia.ExcepcionDocument.Excepcion getExcepcion();
    
    /**
     * Sets the "Excepcion" element
     */
    void setExcepcion(afirmaws.ws.custodia.ExcepcionDocument.Excepcion excepcion);
    
    /**
     * Appends and returns a new empty "Excepcion" element
     */
    afirmaws.ws.custodia.ExcepcionDocument.Excepcion addNewExcepcion();
    
    /**
     * An XML Excepcion(@http://afirmaws/ws/custodia).
     *
     * This is a complex type.
     */
    public interface Excepcion extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Excepcion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s677E8C8D682D9F115E9A15702EE7E664").resolveHandle("excepcionb267elemtype");
        
        /**
         * Gets the "codigoError" element
         */
        java.lang.String getCodigoError();
        
        /**
         * Gets (as xml) the "codigoError" element
         */
        org.apache.xmlbeans.XmlString xgetCodigoError();
        
        /**
         * Sets the "codigoError" element
         */
        void setCodigoError(java.lang.String codigoError);
        
        /**
         * Sets (as xml) the "codigoError" element
         */
        void xsetCodigoError(org.apache.xmlbeans.XmlString codigoError);
        
        /**
         * Gets the "descripcion" element
         */
        java.lang.String getDescripcion();
        
        /**
         * Gets (as xml) the "descripcion" element
         */
        org.apache.xmlbeans.XmlString xgetDescripcion();
        
        /**
         * Sets the "descripcion" element
         */
        void setDescripcion(java.lang.String descripcion);
        
        /**
         * Sets (as xml) the "descripcion" element
         */
        void xsetDescripcion(org.apache.xmlbeans.XmlString descripcion);
        
        /**
         * Gets the "excepcionAsociada" element
         */
        java.lang.String getExcepcionAsociada();
        
        /**
         * Gets (as xml) the "excepcionAsociada" element
         */
        org.apache.xmlbeans.XmlString xgetExcepcionAsociada();
        
        /**
         * True if has "excepcionAsociada" element
         */
        boolean isSetExcepcionAsociada();
        
        /**
         * Sets the "excepcionAsociada" element
         */
        void setExcepcionAsociada(java.lang.String excepcionAsociada);
        
        /**
         * Sets (as xml) the "excepcionAsociada" element
         */
        void xsetExcepcionAsociada(org.apache.xmlbeans.XmlString excepcionAsociada);
        
        /**
         * Unsets the "excepcionAsociada" element
         */
        void unsetExcepcionAsociada();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static afirmaws.ws.custodia.ExcepcionDocument.Excepcion newInstance() {
              return (afirmaws.ws.custodia.ExcepcionDocument.Excepcion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static afirmaws.ws.custodia.ExcepcionDocument.Excepcion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (afirmaws.ws.custodia.ExcepcionDocument.Excepcion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static afirmaws.ws.custodia.ExcepcionDocument newInstance() {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static afirmaws.ws.custodia.ExcepcionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static afirmaws.ws.custodia.ExcepcionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static afirmaws.ws.custodia.ExcepcionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (afirmaws.ws.custodia.ExcepcionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
