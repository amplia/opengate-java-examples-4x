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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Body.
 * 
 * @version $Revision$ $Date$
 */
public class Body implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataUnitList
     */
    private java.util.ArrayList _dataUnitList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Body() 
     {
        super();
        _dataUnitList = new ArrayList();
    } //-- com.opengate.webservice.xml.Body()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDataUnit
     * 
     * 
     * 
     * @param vDataUnit
     */
    public void addDataUnit(com.opengate.webservice.xml.DataUnit vDataUnit)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataUnitList.add(vDataUnit);
    } //-- void addDataUnit(com.opengate.webservice.xml.DataUnit) 

    /**
     * Method addDataUnit
     * 
     * 
     * 
     * @param index
     * @param vDataUnit
     */
    public void addDataUnit(int index, com.opengate.webservice.xml.DataUnit vDataUnit)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataUnitList.add(index, vDataUnit);
    } //-- void addDataUnit(int, com.opengate.webservice.xml.DataUnit) 

    /**
     * Method clearDataUnit
     * 
     */
    public void clearDataUnit()
    {
        _dataUnitList.clear();
    } //-- void clearDataUnit() 

    /**
     * Method enumerateDataUnit
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateDataUnit()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_dataUnitList.iterator());
    } //-- java.util.Enumeration enumerateDataUnit() 

    /**
     * Method getDataUnit
     * 
     * 
     * 
     * @param index
     * @return DataUnit
     */
    public com.opengate.webservice.xml.DataUnit getDataUnit(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _dataUnitList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.opengate.webservice.xml.DataUnit) _dataUnitList.get(index);
    } //-- com.opengate.webservice.xml.DataUnit getDataUnit(int) 

    /**
     * Method getDataUnit
     * 
     * 
     * 
     * @return DataUnit
     */
    public com.opengate.webservice.xml.DataUnit[] getDataUnit()
    {
        int size = _dataUnitList.size();
        com.opengate.webservice.xml.DataUnit[] mArray = new com.opengate.webservice.xml.DataUnit[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.opengate.webservice.xml.DataUnit) _dataUnitList.get(index);
        }
        return mArray;
    } //-- com.opengate.webservice.xml.DataUnit[] getDataUnit() 

    /**
     * Method getDataUnitCount
     * 
     * 
     * 
     * @return int
     */
    public int getDataUnitCount()
    {
        return _dataUnitList.size();
    } //-- int getDataUnitCount() 

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
     * Method removeDataUnit
     * 
     * 
     * 
     * @param vDataUnit
     * @return boolean
     */
    public boolean removeDataUnit(com.opengate.webservice.xml.DataUnit vDataUnit)
    {
        boolean removed = _dataUnitList.remove(vDataUnit);
        return removed;
    } //-- boolean removeDataUnit(com.opengate.webservice.xml.DataUnit) 

    /**
     * Method setDataUnit
     * 
     * 
     * 
     * @param index
     * @param vDataUnit
     */
    public void setDataUnit(int index, com.opengate.webservice.xml.DataUnit vDataUnit)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _dataUnitList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dataUnitList.set(index, vDataUnit);
    } //-- void setDataUnit(int, com.opengate.webservice.xml.DataUnit) 

    /**
     * Method setDataUnit
     * 
     * 
     * 
     * @param dataUnitArray
     */
    public void setDataUnit(com.opengate.webservice.xml.DataUnit[] dataUnitArray)
    {
        //-- copy array
        _dataUnitList.clear();
        for (int i = 0; i < dataUnitArray.length; i++) {
            _dataUnitList.add(dataUnitArray[i]);
        }
    } //-- void setDataUnit(com.opengate.webservice.xml.DataUnit) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Body
     */
    public static com.opengate.webservice.xml.Body unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.opengate.webservice.xml.Body) Unmarshaller.unmarshal(com.opengate.webservice.xml.Body.class, reader);
    } //-- com.opengate.webservice.xml.Body unmarshal(java.io.Reader) 

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
