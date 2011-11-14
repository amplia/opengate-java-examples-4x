/**
 * OpenGateListenerWSSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.opengate.webservice.listener;

public class OpenGateListenerWSSoapBindingSkeleton implements com.opengate.webservice.listener.OpenGateListenerWS, org.apache.axis.wsdl.Skeleton {
    private com.opengate.webservice.listener.OpenGateListenerWS impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("handleException", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:OpenGateListenerWS", "handleException"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("handleException") == null) {
            _myOperations.put("handleException", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("handleException")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("handleCommand", _params, new javax.xml.namespace.QName("", "handleCommandReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:OpenGateListenerWS", "handleCommand"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("handleCommand") == null) {
            _myOperations.put("handleCommand", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("handleCommand")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("handleEvent", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:OpenGateListenerWS", "handleEvent"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("handleEvent") == null) {
            _myOperations.put("handleEvent", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("handleEvent")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("handleResponse", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:OpenGateListenerWS", "handleResponse"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("handleResponse") == null) {
            _myOperations.put("handleResponse", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("handleResponse")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("handleNotification", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:OpenGateListenerWS", "handleNotification"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("handleNotification") == null) {
            _myOperations.put("handleNotification", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("handleNotification")).add(_oper);
    }

    public OpenGateListenerWSSoapBindingSkeleton() {
        this.impl = new com.opengate.webservice.listener.OpenGateListenerImpl();
    }

    public OpenGateListenerWSSoapBindingSkeleton(com.opengate.webservice.listener.OpenGateListenerWS impl) {
        this.impl = impl;
    }
    public void handleException(java.lang.String in0) throws java.rmi.RemoteException
    {
        impl.handleException(in0);
    }

    public java.lang.String handleCommand(java.lang.String in0) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.handleCommand(in0);
        return ret;
    }

    public void handleEvent(java.lang.String in0) throws java.rmi.RemoteException
    {
        impl.handleEvent(in0);
    }

    public void handleResponse(long in0, int in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException
    {
        impl.handleResponse(in0, in1, in2, in3);
    }

    public void handleNotification(java.lang.String in0) throws java.rmi.RemoteException
    {
        impl.handleNotification(in0);
    }

}
