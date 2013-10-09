/**
 * CustodiaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.picoto.axis;

public class CustodiaServiceLocator extends org.apache.axis.client.Service implements com.picoto.axis.CustodiaService {

    public CustodiaServiceLocator() {
    }


    public CustodiaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustodiaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ObtenerIdDocumento
    private java.lang.String ObtenerIdDocumento_address = "http://afirma.redsara.es/afirmaws/services/ObtenerIdDocumento";

    public java.lang.String getObtenerIdDocumentoAddress() {
        return ObtenerIdDocumento_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ObtenerIdDocumentoWSDDServiceName = "ObtenerIdDocumento";

    public java.lang.String getObtenerIdDocumentoWSDDServiceName() {
        return ObtenerIdDocumentoWSDDServiceName;
    }

    public void setObtenerIdDocumentoWSDDServiceName(java.lang.String name) {
        ObtenerIdDocumentoWSDDServiceName = name;
    }

    public com.picoto.axis.Custodia getObtenerIdDocumento() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ObtenerIdDocumento_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getObtenerIdDocumento(endpoint);
    }

    public com.picoto.axis.Custodia getObtenerIdDocumento(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.picoto.axis.ObtenerIdDocumentoSoapBindingStub _stub = new com.picoto.axis.ObtenerIdDocumentoSoapBindingStub(portAddress, this);
            _stub.setPortName(getObtenerIdDocumentoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setObtenerIdDocumentoEndpointAddress(java.lang.String address) {
        ObtenerIdDocumento_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.picoto.axis.Custodia.class.isAssignableFrom(serviceEndpointInterface)) {
                com.picoto.axis.ObtenerIdDocumentoSoapBindingStub _stub = new com.picoto.axis.ObtenerIdDocumentoSoapBindingStub(new java.net.URL(ObtenerIdDocumento_address), this);
                _stub.setPortName(getObtenerIdDocumentoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ObtenerIdDocumento".equals(inputPortName)) {
            return getObtenerIdDocumento();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://afirmaws/services/ObtenerIdDocumento", "CustodiaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://afirmaws/services/ObtenerIdDocumento", "ObtenerIdDocumento"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ObtenerIdDocumento".equals(portName)) {
            setObtenerIdDocumentoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
