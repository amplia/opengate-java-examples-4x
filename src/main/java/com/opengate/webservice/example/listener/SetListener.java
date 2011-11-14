package com.opengate.webservice.example.listener;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

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
 * <b>Description:</b><br/>
 * A simple example about how to set webservice listener status in OpenGate
 * WebService Connector.
 * </p>
 * <p>
 * If you want more info about this example please send an email to <a
 * href="mailto:support@amplia.es">Amplia Support</a>
 * <p>
 * Copyright 2007 Amplia Soluciones S.L. All rights reserved.
 * 
 * @author Amplia Soluciones S.L
 */
public class SetListener {
	public static void main(String[] args) throws Exception {

		// OpenGate user data
		String role = "application";
		String login = "default_application";
		String passwd = "default";
		String channel = "default_channel";
		String organization = "default_organization";
		// End Point for OpenGate WebService Connector
		String endPoint = "http://172.19.17.59:8888/opengate/services/OpenGateWS";
		// End Point for your OpenGate WebService listener implementation
		int port = 9095;
		String ip = "172.19.17.10";
		String listenerEndPoint = "http://" + ip + ":" + port
				+ "/ogListener/services/OpenGateListenerWS";

		// Startup Jetty Server
		Server server = new Server(port);
		WebAppContext context = new WebAppContext();
		context.setContextPath("/ogListener");
		context.setWar("webapp/ogListener");
		server.setHandler(context);

		server.start();
		// ***************************************************************

		OpenGateWSServiceLocator locator = new OpenGateWSServiceLocator();
		locator.setOpenGateWSEndpointAddress(endPoint);
		OpenGateWS service = locator.getOpenGateWS();

		String xmlResponse = service.setListener(role, login, passwd, channel,
				organization, listenerEndPoint);

		if (xmlResponse != null) {
			System.out.println("Request for listener configuration sent"
					+ ". Response: ");
			System.out.println(xmlResponse);
		}

	}

}
