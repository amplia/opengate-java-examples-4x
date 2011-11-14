package com.opengate.webservice.example.send;

import com.opengate.webservice.service.OpenGateWS;
import com.opengate.webservice.service.OpenGateWSServiceLocator;
import com.opengate.webservice.xml.*;
import com.opengate.webservice.xml.types.ConnectorTypeType;
import com.opengate.webservice.xml.types.DataUnitTypeType;
import com.opengate.webservice.xml.types.OpTypeType;

import java.io.StringWriter;
import java.util.Date;

/**
 * <p>
 * <b>OpenGate M2M/Mobility Communications Platform</b>
 * </p>
 * <p>
 * <i>Wireless your bussiness</i>
 * </p>
 * <p>
 * <b>Description:</b><br/> A simple example about command sending over
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
public class SendCommand {
	public static void main(String[] args) throws Exception {

		// OpenGate user data
		String role = "application";
		String login = "default_application";
		String passwd = "default";
		String channel = "default_channel";
		String organization = "default_organization";
		// End Point for OpenGate WebService Connector
		String endPoint = "http://172.19.17.63:9092/opengate/services/OpenGateWS";
		String target = "default_client";
		target="default_client";

		OpenGateWSServiceLocator locator = new OpenGateWSServiceLocator();
		locator.setOpenGateWSEndpointAddress(endPoint);
		OpenGateWS service = locator.getOpenGateWS();

		System.out.println("Composing message...");
		XmlOgmessage xmlOgMsg = new XmlOgmessage();
		// Header creation
		Header header = new Header();
		// Operation type COMMAND= 122
		header.setOpType(OpTypeType.VALUE_121);
		header.setOpName("EXAMPLE_WS_COMMAND");
		header.setOpName("EXCEPTION_EXAMPLE");
		header.setTransactionId((int) (System.currentTimeMillis()/1000));
		header.setIdentifier(target);
		// Out connector types for 3.3 version:
		// - TCP= VALUE_2
		// - SMS= VALUE_8
		// - USSD= VALUE_16
		header.setConnectorType(ConnectorTypeType.VALUE_2);
		header.setTimestamp(new Date(System.currentTimeMillis()));
		Notification notification = new Notification();
		notification.setDestinationArrival(false);
		notification.setIfError(false);
		notification.setPlatformDeparture(false);
		header.setNotification(notification);

		// Data body creation
		Body body = new Body();
		DataUnit du = new DataUnit();
		du.setType(DataUnitTypeType.INT);
		du.setContent("1234");
		du.setId(0);// for 3.3 version
		body.addDataUnit(du);
		du = new DataUnit();
		du.setType(DataUnitTypeType.STRING);
		du.setContent("Example Message");
		du.setId(1);// for 3.3 version
		body.addDataUnit(du);
		du = new DataUnit();
		du.setType(DataUnitTypeType.BOOLEAN);
		du.setContent("false");
		du.setId(2);// for 3.3 version
		body.addDataUnit(du);

		xmlOgMsg.setVersion(310);
		xmlOgMsg.setHeader(header);
		xmlOgMsg.setBody(body);

		StringWriter writer = new StringWriter();
		xmlOgMsg.marshal(writer);
		String xmlRequest = writer.toString();

		System.out.println("Calling webservice method...");
		String xmlResponse = service.sendCommand(role, login, passwd, channel,
				organization, xmlRequest, 5000);
		if (xmlResponse != null) {
			System.out.println("Message sent "
					+ xmlOgMsg.getHeader().getOpName() + ". Response: ");
			System.out.println(xmlResponse);
		}
	}
}
