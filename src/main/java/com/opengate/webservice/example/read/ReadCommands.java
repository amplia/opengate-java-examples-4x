package com.opengate.webservice.example.read;

import com.opengate.webservice.service.OpenGateWS;
import com.opengate.webservice.service.OpenGateWSServiceLocator;
import com.opengate.webservice.xml.Body;
import com.opengate.webservice.xml.DataUnit;
import com.opengate.webservice.xml.Header;
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
 * <b>Description:</b><br/> A simple example about command reading over
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
public class ReadCommands {
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
		String[] xmlResponses = service.readCommandRequests(role, login,
				passwd, channel, organization, maxMessageNumber);
		if (xmlResponses != null) {
			System.out.println("Number of received messages "
					+ xmlResponses.length);
			for (int i = 0; i < xmlResponses.length; i++) {
				String xmlResponse = xmlResponses[i];
				if (xmlResponse != null) {
					StringReader reader = new StringReader(xmlResponse);
					XmlOgmessage xmlOgmessage = XmlOgmessage.unmarshal(reader);
					Header header = xmlOgmessage.getHeader();
					System.out.println("Message Received:");
					System.out.println("\tOperation Name: "
							+ header.getOpName());
					System.out.println("\tFrom: " + header.getIdentifier());
					Body body = xmlOgmessage.getBody();
					DataUnit[] dataUnits = body.getDataUnit();
					for (int j = 0; j < dataUnits.length; j++) {
						DataUnit dataUnit = dataUnits[j];
						System.out.println("\t\tData Unit ("
								+ dataUnit.getType() + "): "
								+ dataUnit.getContent());

					}
					service.sendResponse(role, login, passwd, channel,
							organization, xmlResponse);
				}// if: xmlResponse != null
			}// for over xmlResponses[]
		} else {
			System.out.println("Responses is null");
		}
	}
}
