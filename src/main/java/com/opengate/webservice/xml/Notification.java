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
 * Class Notification.
 * 
 * @version $Revision$ $Date$
 */
public class Notification implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _platformDeparture
     */
    private boolean _platformDeparture;

    /**
     * keeps track of state for field: _platformDeparture
     */
    private boolean _has_platformDeparture;

    /**
     * Field _destinationArrival
     */
    private boolean _destinationArrival;

    /**
     * keeps track of state for field: _destinationArrival
     */
    private boolean _has_destinationArrival;

    /**
     * Field _ifError
     */
    private boolean _ifError;

    /**
     * keeps track of state for field: _ifError
     */
    private boolean _has_ifError;


      //----------------/
     //- Constructors -/
    //----------------/

    public Notification() 
     {
        super();
    } //-- com.opengate.webservice.xml.Notification()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteDestinationArrival
     * 
     */
    public void deleteDestinationArrival()
    {
        this._has_destinationArrival= false;
    } //-- void deleteDestinationArrival() 

    /**
     * Method deleteIfError
     * 
     */
    public void deleteIfError()
    {
        this._has_ifError= false;
    } //-- void deleteIfError() 

    /**
     * Method deletePlatformDeparture
     * 
     */
    public void deletePlatformDeparture()
    {
        this._has_platformDeparture= false;
    } //-- void deletePlatformDeparture() 

    /**
     * Returns the value of field 'destinationArrival'.
     * 
     * @return boolean
     * @return the value of field 'destinationArrival'.
     */
    public boolean getDestinationArrival()
    {
        return this._destinationArrival;
    } //-- boolean getDestinationArrival() 

    /**
     * Returns the value of field 'ifError'.
     * 
     * @return boolean
     * @return the value of field 'ifError'.
     */
    public boolean getIfError()
    {
        return this._ifError;
    } //-- boolean getIfError() 

    /**
     * Returns the value of field 'platformDeparture'.
     * 
     * @return boolean
     * @return the value of field 'platformDeparture'.
     */
    public boolean getPlatformDeparture()
    {
        return this._platformDeparture;
    } //-- boolean getPlatformDeparture() 

    /**
     * Method hasDestinationArrival
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDestinationArrival()
    {
        return this._has_destinationArrival;
    } //-- boolean hasDestinationArrival() 

    /**
     * Method hasIfError
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIfError()
    {
        return this._has_ifError;
    } //-- boolean hasIfError() 

    /**
     * Method hasPlatformDeparture
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPlatformDeparture()
    {
        return this._has_platformDeparture;
    } //-- boolean hasPlatformDeparture() 

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
     * Sets the value of field 'destinationArrival'.
     * 
     * @param destinationArrival the value of field
     * 'destinationArrival'.
     */
    public void setDestinationArrival(boolean destinationArrival)
    {
        this._destinationArrival = destinationArrival;
        this._has_destinationArrival = true;
    } //-- void setDestinationArrival(boolean) 

    /**
     * Sets the value of field 'ifError'.
     * 
     * @param ifError the value of field 'ifError'.
     */
    public void setIfError(boolean ifError)
    {
        this._ifError = ifError;
        this._has_ifError = true;
    } //-- void setIfError(boolean) 

    /**
     * Sets the value of field 'platformDeparture'.
     * 
     * @param platformDeparture the value of field
     * 'platformDeparture'.
     */
    public void setPlatformDeparture(boolean platformDeparture)
    {
        this._platformDeparture = platformDeparture;
        this._has_platformDeparture = true;
    } //-- void setPlatformDeparture(boolean) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Notification
     */
    public static com.opengate.webservice.xml.Notification unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.opengate.webservice.xml.Notification) Unmarshaller.unmarshal(com.opengate.webservice.xml.Notification.class, reader);
    } //-- com.opengate.webservice.xml.Notification unmarshal(java.io.Reader) 

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
