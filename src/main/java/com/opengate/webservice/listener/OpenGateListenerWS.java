/**
 * OpenGateListenerWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.opengate.webservice.listener;

public interface OpenGateListenerWS extends java.rmi.Remote {
    public void handleException(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String handleCommand(java.lang.String in0) throws java.rmi.RemoteException;
    public void handleEvent(java.lang.String in0) throws java.rmi.RemoteException;
    public void handleResponse(long in0, int in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException;
    public void handleNotification(java.lang.String in0) throws java.rmi.RemoteException;
}
