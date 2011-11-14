/**
 * OpenGateWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.opengate.webservice.service;

public class OpenGateWSServiceLocator extends org.apache.axis.client.Service implements com.opengate.webservice.service.OpenGateWSService {

    public OpenGateWSServiceLocator() {
    }


    public OpenGateWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OpenGateWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OpenGateWS
    private java.lang.String OpenGateWS_address = "http://localhost:8080/axis/services/OpenGateWS";

    public java.lang.String getOpenGateWSAddress() {
        return OpenGateWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OpenGateWSWSDDServiceName = "OpenGateWS";

    public java.lang.String getOpenGateWSWSDDServiceName() {
        return OpenGateWSWSDDServiceName;
    }

    public void setOpenGateWSWSDDServiceName(java.lang.String name) {
        OpenGateWSWSDDServiceName = name;
    }

    public com.opengate.webservice.service.OpenGateWS getOpenGateWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OpenGateWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOpenGateWS(endpoint);
    }

    public com.opengate.webservice.service.OpenGateWS getOpenGateWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.opengate.webservice.service.OpenGateWSSoapBindingStub _stub = new com.opengate.webservice.service.OpenGateWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getOpenGateWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOpenGateWSEndpointAddress(java.lang.String address) {
        OpenGateWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.opengate.webservice.service.OpenGateWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.opengate.webservice.service.OpenGateWSSoapBindingStub _stub = new com.opengate.webservice.service.OpenGateWSSoapBindingStub(new java.net.URL(OpenGateWS_address), this);
                _stub.setPortName(getOpenGateWSWSDDServiceName());
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
        if ("OpenGateWS".equals(inputPortName)) {
            return getOpenGateWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:OpenGateWS", "OpenGateWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:OpenGateWS", "OpenGateWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OpenGateWS".equals(portName)) {
            setOpenGateWSEndpointAddress(address);
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
