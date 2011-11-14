/**
 * OpenGateListenerWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.opengate.webservice.listener;

public class OpenGateListenerWSServiceLocator extends org.apache.axis.client.Service implements com.opengate.webservice.listener.OpenGateListenerWSService {

    public OpenGateListenerWSServiceLocator() {
    }


    public OpenGateListenerWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OpenGateListenerWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OpenGateListenerWS
    private java.lang.String OpenGateListenerWS_address = "http://localhost:8080/axis/services/OpenGateListenerWS";

    public java.lang.String getOpenGateListenerWSAddress() {
        return OpenGateListenerWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OpenGateListenerWSWSDDServiceName = "OpenGateListenerWS";

    public java.lang.String getOpenGateListenerWSWSDDServiceName() {
        return OpenGateListenerWSWSDDServiceName;
    }

    public void setOpenGateListenerWSWSDDServiceName(java.lang.String name) {
        OpenGateListenerWSWSDDServiceName = name;
    }

    public com.opengate.webservice.listener.OpenGateListenerWS getOpenGateListenerWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OpenGateListenerWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOpenGateListenerWS(endpoint);
    }

    public com.opengate.webservice.listener.OpenGateListenerWS getOpenGateListenerWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.opengate.webservice.listener.OpenGateListenerWSSoapBindingStub _stub = new com.opengate.webservice.listener.OpenGateListenerWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getOpenGateListenerWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOpenGateListenerWSEndpointAddress(java.lang.String address) {
        OpenGateListenerWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.opengate.webservice.listener.OpenGateListenerWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.opengate.webservice.listener.OpenGateListenerWSSoapBindingStub _stub = new com.opengate.webservice.listener.OpenGateListenerWSSoapBindingStub(new java.net.URL(OpenGateListenerWS_address), this);
                _stub.setPortName(getOpenGateListenerWSWSDDServiceName());
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
        if ("OpenGateListenerWS".equals(inputPortName)) {
            return getOpenGateListenerWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:OpenGateListenerWS", "OpenGateListenerWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:OpenGateListenerWS", "OpenGateListenerWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OpenGateListenerWS".equals(portName)) {
            setOpenGateListenerWSEndpointAddress(address);
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
