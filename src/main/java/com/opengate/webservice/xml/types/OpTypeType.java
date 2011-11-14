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
 * Class OpTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class OpTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 121 type
     */
    public static final int VALUE_121_TYPE = 0;

    /**
     * The instance of the 121 type
     */
    public static final OpTypeType VALUE_121 = new OpTypeType(VALUE_121_TYPE, "121");

    /**
     * The 122 type
     */
    public static final int VALUE_122_TYPE = 1;

    /**
     * The instance of the 122 type
     */
    public static final OpTypeType VALUE_122 = new OpTypeType(VALUE_122_TYPE, "122");

    /**
     * The 123 type
     */
    public static final int VALUE_123_TYPE = 2;

    /**
     * The instance of the 123 type
     */
    public static final OpTypeType VALUE_123 = new OpTypeType(VALUE_123_TYPE, "123");

    /**
     * The 124 type
     */
    public static final int VALUE_124_TYPE = 3;

    /**
     * The instance of the 124 type
     */
    public static final OpTypeType VALUE_124 = new OpTypeType(VALUE_124_TYPE, "124");

    /**
     * The 125 type
     */
    public static final int VALUE_125_TYPE = 4;

    /**
     * The instance of the 125 type
     */
    public static final OpTypeType VALUE_125 = new OpTypeType(VALUE_125_TYPE, "125");

    /**
     * The 126 type
     */
    public static final int VALUE_126_TYPE = 5;

    /**
     * The instance of the 126 type
     */
    public static final OpTypeType VALUE_126 = new OpTypeType(VALUE_126_TYPE, "126");

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

    private OpTypeType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- com.opengate.webservice.xml.types.OpTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * OpTypeType
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
     * Returns the type of this OpTypeType
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
        members.put("121", VALUE_121);
        members.put("122", VALUE_122);
        members.put("123", VALUE_123);
        members.put("124", VALUE_124);
        members.put("125", VALUE_125);
        members.put("126", VALUE_126);
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
     * Returns the String representation of this OpTypeType
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
     * Returns a new OpTypeType based on the given String value.
     * 
     * @param string
     * @return OpTypeType
     */
    public static com.opengate.webservice.xml.types.OpTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid OpTypeType";
            throw new IllegalArgumentException(err);
        }
        return (OpTypeType) obj;
    } //-- com.opengate.webservice.xml.types.OpTypeType valueOf(java.lang.String) 

}
