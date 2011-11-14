/**
 * OpenGateListenerImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.opengate.webservice.listener;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import com.opengate.webservice.util.XmlFormatter;
import com.opengate.webservice.xml.Body;
import com.opengate.webservice.xml.DataUnit;
import com.opengate.webservice.xml.Header;
import com.opengate.webservice.xml.Notification;
import com.opengate.webservice.xml.XmlOgmessage;
import com.opengate.webservice.xml.types.ConnectorTypeType;
import com.opengate.webservice.xml.types.DataUnitTypeType;
import com.opengate.webservice.xml.types.OpTypeType;

/**
 * <p>
 * <b>OpenGate M2M/Mobility Communications Platform</b>
 * </p>
 * <p>
 * <i>Wireless your bussiness</i>
 * </p>
 * <p>
 * <b>Description:</b><br/>
 * A simple example about how to manage incomming messages in a webservice
 * listener implementation of OpenGate WebService Listener.
 * </p>
 * <p>
 * If you want more info about this example please send an email to <a
 * href="mailto:support@amplia.es">Amplia Support</a>
 * <p>
 * Copyright 2007 Amplia Soluciones S.L. All rights reserved.
 * 
 * @author Amplia Soluciones S.L
 */
public class OpenGateListenerImpl implements
		com.opengate.webservice.listener.OpenGateListenerWS {

	@Override
	public void handleException(String _message)
			throws java.rmi.RemoteException {

		System.out.println("=================================================");
		System.out.println("Exception received:");
		System.out.println(_message);

		StringReader reader = new StringReader(_message);
		try {
			// Unmarshalling message
			XmlOgmessage xmlOgmessage = XmlOgmessage.unmarshal(reader);
			// Getting header information
			Header header = xmlOgmessage.getHeader();
			System.out.println("\tOperation Name: " + header.getOpName());
			System.out.println("\tFrom: " + header.getIdentifier());
			Body body = xmlOgmessage.getBody();
			DataUnit[] dataUnits = body.getDataUnit();
			for (int j = 0; j < dataUnits.length; j++) {
				DataUnit dataUnit = dataUnits[j];
				System.out.println("\t\tData Unit (" + dataUnit.getType()
						+ "): " + dataUnit.getContent());

			}
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String handleCommand(String _message)
			throws java.rmi.RemoteException {
		System.out.println("=================================================");
		System.out.println("Command received:");
		System.out.println(_message);

		StringReader reader = new StringReader(_message);
		XmlOgmessage xmlOgmessage;
		String xmlResponse = null;

		try {
			// Unmarshalling message
			xmlOgmessage = XmlOgmessage.unmarshal(reader);
			// Getting header information
			Header header = xmlOgmessage.getHeader();
			String operationName = header.getOpName();
			System.out.println("\tOperation Name: " + operationName);
			String from = header.getIdentifier();
			System.out.println("\tFrom: " + from);
			Body body = xmlOgmessage.getBody();
			DataUnit[] dataUnits = body.getDataUnit();
			for (int j = 0; j < dataUnits.length; j++) {
				DataUnit dataUnit = dataUnits[j];
				System.out.println("\t\tData Unit (" + dataUnit.getType()
						+ "): " + dataUnit.getContent());

			}

			XmlOgmessage responseXmlOgMsg = new XmlOgmessage();
			// Header creation
			Header responseHeader = new Header();
			// Operation type EVENT= 122
			responseHeader.setOpType(OpTypeType.VALUE_122);
			responseHeader.setOpName(operationName);
			responseHeader.setTransactionId((int) System.currentTimeMillis());
			responseHeader.setIdentifier(from);
			// Out connector types for 3.3 version:
			// - TCP= VALUE_2
			// - SMS= VALUE_8
			// - USSD= VALUE_16
			responseHeader.setConnectorType(ConnectorTypeType.VALUE_2);
			responseHeader.setTimestamp(new Date(System.currentTimeMillis()));
			Notification notification = new Notification();
			notification.setDestinationArrival(false);
			notification.setIfError(false);
			notification.setPlatformDeparture(false);
			responseHeader.setNotification(notification);

			// Body data creation
			Body responseBody = new Body();
			DataUnit du = new DataUnit();
			du.setType(DataUnitTypeType.INT);
			du.setContent("1234");
			du.setId(0);// for 3.3 version
			responseBody.addDataUnit(du);
			du = new DataUnit();
			du.setType(DataUnitTypeType.STRING);
			du.setContent("Response Message");
			du.setId(1);// for 3.3 version
			responseBody.addDataUnit(du);
			du = new DataUnit();
			du.setType(DataUnitTypeType.BOOLEAN);
			du.setContent("false");
			du.setId(2);// for 3.3 version
			responseBody.addDataUnit(du);

			responseXmlOgMsg.setVersion(310);
			responseXmlOgMsg.setHeader(responseHeader);
			responseXmlOgMsg.setBody(responseBody);

			StringWriter writer = new StringWriter();
			responseXmlOgMsg.marshal(writer);
			xmlResponse = writer.toString();

		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}

		return xmlResponse;
	}

	@Override
	public void handleEvent(String _message) throws java.rmi.RemoteException {
		System.out.println("=================================================");
		System.out.println("Event received:");
		System.out.println(XmlFormatter.format(_message));
		StringReader reader = new StringReader(_message);
		XmlOgmessage xmlOgmessage;
		try {
			// Unmarshalling message
			xmlOgmessage = XmlOgmessage.unmarshal(reader);
			// Getting header information
			Header header = xmlOgmessage.getHeader();
			System.out.println("\tOperation Name: " + header.getOpName());
			System.out.println("\tFrom: " + header.getIdentifier());
			Body body = xmlOgmessage.getBody();
			DataUnit[] dataUnits = body.getDataUnit();
			for (int j = 0; j < dataUnits.length; j++) {
				DataUnit dataUnit = dataUnits[j];
				System.out.println("\t\tData Unit (" + dataUnit.getType()
						+ "): " + dataUnit.getContent());

			}
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void handleResponse(long _messageId, int _errorCode,
			String _errorString, String _message)
			throws java.rmi.RemoteException {
		System.out.println("=================================================");
		System.out.println("Response received:");
		System.out.println(_message);
		StringReader reader = new StringReader(_message);
		XmlOgmessage xmlOgmessage;
		try {
			// Unmarshalling message
			xmlOgmessage = XmlOgmessage.unmarshal(reader);
			// Getting header information
			Header header = xmlOgmessage.getHeader();
			System.out.println("\tOperation Name: " + header.getOpName());
			System.out.println("\tFrom: " + header.getIdentifier());
			Body body = xmlOgmessage.getBody();
			DataUnit[] dataUnits = body.getDataUnit();
			for (int j = 0; j < dataUnits.length; j++) {
				DataUnit dataUnit = dataUnits[j];
				System.out.println("\t\tData Unit (" + dataUnit.getType()
						+ "): " + dataUnit.getContent());

			}
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void handleNotification(String _message)
			throws java.rmi.RemoteException {
		System.out.println("=================================================");
		System.out.println("Notification received:");
		System.out.println(_message);
		StringReader reader = new StringReader(_message);
		try {
			// Unmarshalling message
			XmlOgmessage xmlOgmessage = XmlOgmessage.unmarshal(reader);
			// Getting header information
			Header header = xmlOgmessage.getHeader();
			System.out.println("\tFrom: " + header.getIdentifier());

			// Getting notification level
			Notification notification = header.getNotification();
			boolean destinationArrival = notification.getDestinationArrival();
			boolean ifError = notification.getIfError();
			boolean platformDeparture = notification.getPlatformDeparture();
			String notificationLevel;
			if (destinationArrival) {
				notificationLevel = "Destination Arrival";
			} else if (ifError) {
				notificationLevel = "If Error";
			} else if (platformDeparture) {
				notificationLevel = "Platform Departure";
			} else {
				notificationLevel = "Unknow";
			}

			// Status code extraction
			Body body = xmlOgmessage.getBody();
			DataUnit[] dataUnits = body.getDataUnit();
			DataUnit dataUnit = dataUnits[0];
			String statusCode = dataUnit.getContent();
			String status;
			// Check if status code is Ok
			if (statusCode.equals("100")) {
				status = "Ok";
			} else {
				status = "NoK";
			}

			System.out.println(notificationLevel + ": " + status);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}
}
