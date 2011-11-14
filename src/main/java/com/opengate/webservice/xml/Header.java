/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package com.opengate.webservice.xml;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.opengate.webservice.xml.types.ConnectorTypeType;
import com.opengate.webservice.xml.types.OpTypeType;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Date;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Header.
 * 
 * @version $Revision$ $Date$
 */
public class Header implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _transactionId
     */
    private long _transactionId;

    /**
     * keeps track of state for field: _transactionId
     */
    private boolean _has_transactionId;

    /**
     * Field _opName
     */
    private java.lang.String _opName;

    /**
     * Field _opType
     */
    private com.opengate.webservice.xml.types.OpTypeType _opType;

    /**
     * Field _identifier
     */
    private java.lang.String _identifier;

    /**
     * Field _connectorType
     */
    private com.opengate.webservice.xml.types.ConnectorTypeType _connectorType;

    /**
     * Field _timestamp
     */
    private java.util.Date _timestamp;

    /**
     * Field _notification
     */
    private com.opengate.webservice.xml.Notification _notification;

    /**
     * Field _ttl
     */
    private int _ttl;

    /**
     * keeps track of state for field: _ttl
     */
    private boolean _has_ttl;


      //----------------/
     //- Constructors -/
    //----------------/

    public Header() 
     {
        super();
    } //-- com.opengate.webservice.xml.Header()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteTransactionId
     * 
     */
    public void deleteTransactionId()
    {
        this._has_transactionId= false;
    } //-- void deleteTransactionId() 

    /**
     * Method deleteTtl
     * 
     */
    public void deleteTtl()
    {
        this._has_ttl= false;
    } //-- void deleteTtl() 

    /**
     * Returns the value of field 'connectorType'.
     * 
     * @return ConnectorTypeType
     * @return the value of field 'connectorType'.
     */
    public com.opengate.webservice.xml.types.ConnectorTypeType getConnectorType()
    {
        return this._connectorType;
    } //-- com.opengate.webservice.xml.types.ConnectorTypeType getConnectorType() 

    /**
     * Returns the value of field 'identifier'.
     * 
     * @return String
     * @return the value of field 'identifier'.
     */
    public java.lang.String getIdentifier()
    {
        return this._identifier;
    } //-- java.lang.String getIdentifier() 

    /**
     * Returns the value of field 'notification'.
     * 
     * @return Notification
     * @return the value of field 'notification'.
     */
    public com.opengate.webservice.xml.Notification getNotification()
    {
        return this._notification;
    } //-- com.opengate.webservice.xml.Notification getNotification() 

    /**
     * Returns the value of field 'opName'.
     * 
     * @return String
     * @return the value of field 'opName'.
     */
    public java.lang.String getOpName()
    {
        return this._opName;
    } //-- java.lang.String getOpName() 

    /**
     * Returns the value of field 'opType'.
     * 
     * @return OpTypeType
     * @return the value of field 'opType'.
     */
    public com.opengate.webservice.xml.types.OpTypeType getOpType()
    {
        return this._opType;
    } //-- com.opengate.webservice.xml.types.OpTypeType getOpType() 

    /**
     * Returns the value of field 'timestamp'.
     * 
     * @return Date
     * @return the value of field 'timestamp'.
     */
    public java.util.Date getTimestamp()
    {
        return this._timestamp;
    } //-- java.util.Date getTimestamp() 

    /**
     * Returns the value of field 'transactionId'.
     * 
     * @return long
     * @return the value of field 'transactionId'.
     */
    public long getTransactionId()
    {
        return this._transactionId;
    } //-- long getTransactionId() 

    /**
     * Returns the value of field 'ttl'.
     * 
     * @return int
     * @return the value of field 'ttl'.
     */
    public int getTtl()
    {
        return this._ttl;
    } //-- int getTtl() 

    /**
     * Method hasTransactionId
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTransactionId()
    {
        return this._has_transactionId;
    } //-- boolean hasTransactionId() 

    /**
     * Method hasTtl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTtl()
    {
        return this._has_ttl;
    } //-- boolean hasTtl() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'connectorType'.
     * 
     * @param connectorType the value of field 'connectorType'.
     */
    public void setConnectorType(com.opengate.webservice.xml.types.ConnectorTypeType connectorType)
    {
        this._connectorType = connectorType;
    } //-- void setConnectorType(com.opengate.webservice.xml.types.ConnectorTypeType) 

    /**
     * Sets the value of field 'identifier'.
     * 
     * @param identifier the value of field 'identifier'.
     */
    public void setIdentifier(java.lang.String identifier)
    {
        this._identifier = identifier;
    } //-- void setIdentifier(java.lang.String) 

    /**
     * Sets the value of field 'notification'.
     * 
     * @param notification the value of field 'notification'.
     */
    public void setNotification(com.opengate.webservice.xml.Notification notification)
    {
        this._notification = notification;
    } //-- void setNotification(com.opengate.webservice.xml.Notification) 

    /**
     * Sets the value of field 'opName'.
     * 
     * @param opName the value of field 'opName'.
     */
    public void setOpName(java.lang.String opName)
    {
        this._opName = opName;
    } //-- void setOpName(java.lang.String) 

    /**
     * Sets the value of field 'opType'.
     * 
     * @param opType the value of field 'opType'.
     */
    public void setOpType(com.opengate.webservice.xml.types.OpTypeType opType)
    {
        this._opType = opType;
    } //-- void setOpType(com.opengate.webservice.xml.types.OpTypeType) 

    /**
     * Sets the value of field 'timestamp'.
     * 
     * @param timestamp the value of field 'timestamp'.
     */
    public void setTimestamp(java.util.Date timestamp)
    {
        this._timestamp = timestamp;
    } //-- void setTimestamp(java.util.Date) 

    /**
     * Sets the value of field 'transactionId'.
     * 
     * @param transactionId the value of field 'transactionId'.
     */
    public void setTransactionId(long transactionId)
    {
        this._transactionId = transactionId;
        this._has_transactionId = true;
    } //-- void setTransactionId(long) 

    /**
     * Sets the value of field 'ttl'.
     * 
     * @param ttl the value of field 'ttl'.
     */
    public void setTtl(int ttl)
    {
        this._ttl = ttl;
        this._has_ttl = true;
    } //-- void setTtl(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Header
     */
    public static com.opengate.webservice.xml.Header unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.opengate.webservice.xml.Header) Unmarshaller.unmarshal(com.opengate.webservice.xml.Header.class, reader);
    } //-- com.opengate.webservice.xml.Header unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
