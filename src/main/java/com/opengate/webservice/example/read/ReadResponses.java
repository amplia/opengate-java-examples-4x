package com.opengate.webservice.example.read;

import com.opengate.webservice.service.OpenGateWS;
import com.opengate.webservice.service.OpenGateWSServiceLocator;
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
 * <b>Description:</b><br/> A simple example about response reading over
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

public class ReadResponses {
	public static void main(String[] args) throws Exception {

		// OpenGate user data
		String role = "application";
		String login = "default_application";
		String passwd = "default";
		String channel = "default_channel";
		String organization = "default_organization";
		// End Point for OpenGate WebService Connector
		String endPoint = "http://172.19.17.63:9092/opengate/services/OpenGateWS";
		// Max number of messages to read in this example
		int maxMessageNumber = 10;

		OpenGateWSServiceLocator locator = new OpenGateWSServiceLocator();
		locator.setOpenGateWSEndpointAddress(endPoint);
		OpenGateWS service = locator.getOpenGateWS();

		System.out.println("Calling webservice method...");
		String[] xmlResponses = service.readResponses(role, login, passwd,
				channel, organization, maxMessageNumber);
		if (xmlResponses != null) {
			for (int i = 0; i < xmlResponses.length; i++) {
				String xmlResponse = xmlResponses[i];
				if (xmlResponse != null) {
					System.out.println("=====================================");
					System.out.println("Received response:");
					StringReader reader = new StringReader(xmlResponse);
					XmlOgmessage xmlOgmessage = XmlOgmessage.unmarshal(reader);
					System.out.println("\tTransaction id:"
							+ xmlOgmessage.getHeader().getTransactionId());
					System.out.println("\t" + xmlResponse);
				}
			}
		}
	}
}
