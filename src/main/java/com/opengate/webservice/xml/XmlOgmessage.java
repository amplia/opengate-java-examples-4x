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

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class XmlOgmessage.
 * 
 * @version $Revision$ $Date$
 */
public class XmlOgmessage implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _version
     */
    private int _version = 310;

    /**
     * keeps track of state for field: _version
     */
    private boolean _has_version;

    /**
     * Field _header
     */
    private com.opengate.webservice.xml.Header _header;

    /**
     * Field _body
     */
    private com.opengate.webservice.xml.Body _body;


      //----------------/
     //- Constructors -/
    //----------------/

    public XmlOgmessage() 
     {
        super();
    } //-- com.opengate.webservice.xml.XmlOgmessage()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteVersion
     * 
     */
    public void deleteVersion()
    {
        this._has_version= false;
    } //-- void deleteVersion() 

    /**
     * Returns the value of field 'body'.
     * 
     * @return Body
     * @return the value of field 'body'.
     */
    public com.opengate.webservice.xml.Body getBody()
    {
        return this._body;
    } //-- com.opengate.webservice.xml.Body getBody() 

    /**
     * Returns the value of field 'header'.
     * 
     * @return Header
     * @return the value of field 'header'.
     */
    public com.opengate.webservice.xml.Header getHeader()
    {
        return this._header;
    } //-- com.opengate.webservice.xml.Header getHeader() 

    /**
     * Returns the value of field 'version'.
     * 
     * @return int
     * @return the value of field 'version'.
     */
    public int getVersion()
    {
        return this._version;
    } //-- int getVersion() 

    /**
     * Method hasVersion
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasVersion()
    {
        return this._has_version;
    } //-- boolean hasVersion() 

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
     * Sets the value of field 'body'.
     * 
     * @param body the value of field 'body'.
     */
    public void setBody(com.opengate.webservice.xml.Body body)
    {
        this._body = body;
    } //-- void setBody(com.opengate.webservice.xml.Body) 

    /**
     * Sets the value of field 'header'.
     * 
     * @param header the value of field 'header'.
     */
    public void setHeader(com.opengate.webservice.xml.Header header)
    {
        this._header = header;
    } //-- void setHeader(com.opengate.webservice.xml.Header) 

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(int version)
    {
        this._version = version;
        this._has_version = true;
    } //-- void setVersion(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return XmlOgmessage
     */
    public static com.opengate.webservice.xml.XmlOgmessage unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.opengate.webservice.xml.XmlOgmessage) Unmarshaller.unmarshal(com.opengate.webservice.xml.XmlOgmessage.class, reader);
    } //-- com.opengate.webservice.xml.XmlOgmessage unmarshal(java.io.Reader) 

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
