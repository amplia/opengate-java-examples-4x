/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package com.opengate.webservice.xml.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ConnectorTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ConnectorTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 1 type
     */
    public static final int VALUE_1_TYPE = 0;

    /**
     * The instance of the 1 type
     */
    public static final ConnectorTypeType VALUE_1 = new ConnectorTypeType(VALUE_1_TYPE, "1");

    /**
     * The 2 type
     */
    public static final int VALUE_2_TYPE = 1;

    /**
     * The instance of the 2 type
     */
    public static final ConnectorTypeType VALUE_2 = new ConnectorTypeType(VALUE_2_TYPE, "2");

    /**
     * The 4 type
     */
    public static final int VALUE_4_TYPE = 2;

    /**
     * The instance of the 4 type
     */
    public static final ConnectorTypeType VALUE_4 = new ConnectorTypeType(VALUE_4_TYPE, "4");

    /**
     * The 8 type
     */
    public static final int VALUE_8_TYPE = 3;

    /**
     * The instance of the 8 type
     */
    public static final ConnectorTypeType VALUE_8 = new ConnectorTypeType(VALUE_8_TYPE, "8");

    /**
     * The 16 type
     */
    public static final int VALUE_16_TYPE = 4;

    /**
     * The instance of the 16 type
     */
    public static final ConnectorTypeType VALUE_16 = new ConnectorTypeType(VALUE_16_TYPE, "16");

    /**
     * The 32 type
     */
    public static final int VALUE_32_TYPE = 5;

    /**
     * The instance of the 32 type
     */
    public static final ConnectorTypeType VALUE_32 = new ConnectorTypeType(VALUE_32_TYPE, "32");

    /**
     * The 64 type
     */
    public static final int VALUE_64_TYPE = 6;

    /**
     * The instance of the 64 type
     */
    public static final ConnectorTypeType VALUE_64 = new ConnectorTypeType(VALUE_64_TYPE, "64");

    /**
     * The 128 type
     */
    public static final int VALUE_128_TYPE = 7;

    /**
     * The instance of the 128 type
     */
    public static final ConnectorTypeType VALUE_128 = new ConnectorTypeType(VALUE_128_TYPE, "128");

    /**
     * The 256 type
     */
    public static final int VALUE_256_TYPE = 8;

    /**
     * The instance of the 256 type
     */
    public static final ConnectorTypeType VALUE_256 = new ConnectorTypeType(VALUE_256_TYPE, "256");

    /**
     * The 512 type
     */
    public static final int VALUE_512_TYPE = 9;

    /**
     * The instance of the 512 type
     */
    public static final ConnectorTypeType VALUE_512 = new ConnectorTypeType(VALUE_512_TYPE, "512");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private ConnectorTypeType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.opengate.webservice.xml.types.ConnectorTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ConnectorTypeType
     * 
     * @return Enumeration
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this ConnectorTypeType
     * 
     * @return int
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     * 
     * 
     * 
     * @return Hashtable
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("1", VALUE_1);
        members.put("2", VALUE_2);
        members.put("4", VALUE_4);
        members.put("8", VALUE_8);
        members.put("16", VALUE_16);
        members.put("32", VALUE_32);
        members.put("64", VALUE_64);
        members.put("128", VALUE_128);
        members.put("256", VALUE_256);
        members.put("512", VALUE_512);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve
     * 
     *  will be called during deserialization to replace the
     * deserialized object with the correct constant instance.
     * <br/>
     * 
     * @return Object
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toString
     * 
     * Returns the String representation of this ConnectorTypeType
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new ConnectorTypeType based on the given String
     * value.
     * 
     * @param string
     * @return ConnectorTypeType
     */
    public static com.opengate.webservice.xml.types.ConnectorTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ConnectorTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ConnectorTypeType) obj;
    } //-- com.opengate.webservice.xml.types.ConnectorTypeType valueOf(java.lang.String) 

}
