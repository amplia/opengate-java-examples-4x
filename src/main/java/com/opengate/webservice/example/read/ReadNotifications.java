package com.opengate.webservice.example.read;

import com.opengate.webservice.service.OpenGateWS;
import com.opengate.webservice.service.OpenGateWSServiceLocator;
import com.opengate.webservice.xml.DataUnit;
import com.opengate.webservice.xml.Notification;
import com.opengate.webservice.xml.XmlOgmessage;

import java.io.StringReader;

/**
 * <p>
 * <b>OpenGate M2M/Mobility Communications Platform</b>
 * </p>
 * <p>
 * <i>Wireless your bussiness</i>
 * </p>
 * <p>
 * <b>Description:</b><br/> A simple example about notification reading over
 * OpenGate WebService Connector.
 * </p>
 * <p>
 * If you want more info about this example please send an email to <a
 * href="mailto:support@amplia.es">Amplia Support</a>
 * <p>
 * Copyright 2007 Amplia Soluciones S.L. All rights reserved.
 * 
 * @author Amplia Soluciones S.L
 */
public class ReadNotifications {
	public static void main(String[] args) throws Exception {

		// OpenGate user data
		String role = "application";
		String login = "default_application";
		String passwd = "default";
		String channel = "default_channel";
		String organization = "default_organization";
		// End Point for OpenGate WebService Connector
		String endPoint = "http://172.19.17.63:9092/opengate/services/OpenGateWS";

		OpenGateWSServiceLocator locator = new OpenGateWSServiceLocator();
		locator.setOpenGateWSEndpointAddress(endPoint);
		OpenGateWS service = locator.getOpenGateWS();

		System.out.println("Calling webservice method...");
//		String[] xmlResponses = service.readNotification(role, login, passwd,
//				channel, organization, "415668069");
		String[] xmlResponses = service.readNotifications(role, login, passwd, channel, organization, 10);
		if (xmlResponses != null) {
			for (int i = 0; i < xmlResponses.length; i++) {
				String xmlResponse = xmlResponses[i];
				if (xmlResponse != null) {
					StringReader reader = new StringReader(xmlResponse);
					XmlOgmessage xmlOgmessage = XmlOgmessage.unmarshal(reader);

					Notification notification = xmlOgmessage.getHeader()
							.getNotification();
					long transactionId = xmlOgmessage.getHeader().getTransactionId();
					// Si el mensaje que se esta tratando es una
					// notificacion el campo notificacion solo puede
					// tener un tipo de notificacion, no asi para el
					// resto de clases de mensajes (eventos, comandos ...).
					if (notification.getPlatformDeparture()) {
						System.out.println("Platform departure notification " + transactionId);
					}
					if (notification.getDestinationArrival()) {
						System.out.println("Destination arrival notification " + transactionId);
					}
					if (notification.getIfError()) {
						/*
						 * Error notification message contains a unique data
						 * with error code
						 */
						DataUnit[] dataUnits = xmlOgmessage.getBody()
								.getDataUnit();
						String errorCode = dataUnits[0].getContent();
						System.out.println("Error notification " + errorCode + " with trId: " + transactionId);
					}
				}
			}
		}
	}
}
