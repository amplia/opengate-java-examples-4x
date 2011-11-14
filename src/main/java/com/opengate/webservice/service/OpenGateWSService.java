/**
 * OpenGateWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.opengate.webservice.service;

public interface OpenGateWSService extends javax.xml.rpc.Service {
    public java.lang.String getOpenGateWSAddress();

    public com.opengate.webservice.service.OpenGateWS getOpenGateWS() throws javax.xml.rpc.ServiceException;

    public com.opengate.webservice.service.OpenGateWS getOpenGateWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
