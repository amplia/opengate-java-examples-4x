package com.opengate.webservice.example.listener;

import com.opengate.webservice.service.OpenGateWS;
import com.opengate.webservice.service.OpenGateWSServiceLocator;

/**
 * <p>
 * <b>OpenGate M2M/Mobility Communications Platform</b>
 * </p>
 * <p>
 * <i>Wireless your bussiness</i>
 * </p>
 * <p>
 * <b>Description:</b><br/> A simple example about how to get webservice
 * listener status from OpenGate WebService Connector.
 * </p>
 * <p>
 * If you want more info about this example please send an email to <a
 * href="mailto:support@amplia.es">Amplia Support</a>
 * <p>
 * Copyright 2007 Amplia Soluciones S.L. All rights reserved.
 * 
 * @author Amplia Soluciones S.L
 */
public class GetListenerStatus {
	public static void main(String[] args) throws Exception {

		// OpenGate user data
		String role = "application";
		String login = "default_application";
		String passwd = "default";
		String channel = "default_channel";
		String organization = "default_organization";
		// End Point for OpenGate WebService Connector
		String endPoint = "http://172.19.17.63:9092/opengate/services/OpenGateWS";
		String listenerEndPoint = "http://172.19.17.64:8191/og_listener/services/OpenGateListenerWS";

		OpenGateWSServiceLocator locator = new OpenGateWSServiceLocator();
		locator.setOpenGateWSEndpointAddress(endPoint);
		OpenGateWS service = locator.getOpenGateWS();

		String xmlResponse = service.getListenerStatus(role, login, passwd,
				channel, organization, listenerEndPoint);

		if (xmlResponse != null) {
			System.out.println("Request for listener status sent"
					+ ". Response: ");
			System.out.println(xmlResponse);
		}

	}

}
