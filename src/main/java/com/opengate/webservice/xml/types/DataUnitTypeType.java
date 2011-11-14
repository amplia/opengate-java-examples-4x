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
 * Class DataUnitTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class DataUnitTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The boolean type
     */
    public static final int BOOLEAN_TYPE = 0;

    /**
     * The instance of the boolean type
     */
    public static final DataUnitTypeType BOOLEAN = new DataUnitTypeType(BOOLEAN_TYPE, "boolean");

    /**
     * The char type
     */
    public static final int CHAR_TYPE = 1;

    /**
     * The instance of the char type
     */
    public static final DataUnitTypeType CHAR = new DataUnitTypeType(CHAR_TYPE, "char");

    /**
     * The double type
     */
    public static final int DOUBLE_TYPE = 2;

    /**
     * The instance of the double type
     */
    public static final DataUnitTypeType DOUBLE = new DataUnitTypeType(DOUBLE_TYPE, "double");

    /**
     * The float type
     */
    public static final int FLOAT_TYPE = 3;

    /**
     * The instance of the float type
     */
    public static final DataUnitTypeType FLOAT = new DataUnitTypeType(FLOAT_TYPE, "float");

    /**
     * The int type
     */
    public static final int INT_TYPE = 4;

    /**
     * The instance of the int type
     */
    public static final DataUnitTypeType INT = new DataUnitTypeType(INT_TYPE, "int");

    /**
     * The short type
     */
    public static final int SHORT_TYPE = 5;

    /**
     * The instance of the short type
     */
    public static final DataUnitTypeType SHORT = new DataUnitTypeType(SHORT_TYPE, "short");

    /**
     * The string type
     */
    public static final int STRING_TYPE = 6;

    /**
     * The instance of the string type
     */
    public static final DataUnitTypeType STRING = new DataUnitTypeType(STRING_TYPE, "string");

    /**
     * The u-char type
     */
    public static final int U_CHAR_TYPE = 7;

    /**
     * The instance of the u-char type
     */
    public static final DataUnitTypeType U_CHAR = new DataUnitTypeType(U_CHAR_TYPE, "u-char");

    /**
     * The u-int type
     */
    public static final int U_INT_TYPE = 8;

    /**
     * The instance of the u-int type
     */
    public static final DataUnitTypeType U_INT = new DataUnitTypeType(U_INT_TYPE, "u-int");

    /**
     * The u-short type
     */
    public static final int U_SHORT_TYPE = 9;

    /**
     * The instance of the u-short type
     */
    public static final DataUnitTypeType U_SHORT = new DataUnitTypeType(U_SHORT_TYPE, "u-short");

    /**
     * The array type
     */
    public static final int ARRAY_TYPE = 10;

    /**
     * The instance of the array type
     */
    public static final DataUnitTypeType ARRAY = new DataUnitTypeType(ARRAY_TYPE, "array");

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

    private DataUnitTypeType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.opengate.webservice.xml.types.DataUnitTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * DataUnitTypeType
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
     * Returns the type of this DataUnitTypeType
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
        members.put("boolean", BOOLEAN);
        members.put("char", CHAR);
        members.put("double", DOUBLE);
        members.put("float", FLOAT);
        members.put("int", INT);
        members.put("short", SHORT);
        members.put("string", STRING);
        members.put("u-char", U_CHAR);
        members.put("u-int", U_INT);
        members.put("u-short", U_SHORT);
        members.put("array", ARRAY);
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
     * Returns the String representation of this DataUnitTypeType
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
     * Returns a new DataUnitTypeType based on the given String
     * value.
     * 
     * @param string
     * @return DataUnitTypeType
     */
    public static com.opengate.webservice.xml.types.DataUnitTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DataUnitTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DataUnitTypeType) obj;
    } //-- com.opengate.webservice.xml.types.DataUnitTypeType valueOf(java.lang.String) 

}
