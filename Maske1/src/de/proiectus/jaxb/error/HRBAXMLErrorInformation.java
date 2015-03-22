//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.13 at 09:15:44 PM CET 
//


package de.proiectus.jaxb.error;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="W3CCompatibility">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Wellformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ErrorMessage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorInformation"
})
@XmlRootElement(name = "HRBAXMLErrorInformation")
public class HRBAXMLErrorInformation {

    @XmlElement(name = "ErrorInformation", required = true)
    protected HRBAXMLErrorInformation.ErrorInformation errorInformation;

    /**
     * Gets the value of the errorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HRBAXMLErrorInformation.ErrorInformation }
     *     
     */
    public HRBAXMLErrorInformation.ErrorInformation getErrorInformation() {
        return errorInformation;
    }

    /**
     * Sets the value of the errorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HRBAXMLErrorInformation.ErrorInformation }
     *     
     */
    public void setErrorInformation(HRBAXMLErrorInformation.ErrorInformation value) {
        this.errorInformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="W3CCompatibility">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Wellformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ErrorMessage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timestamp",
        "filename",
        "supplierId",
        "w3CCompatibility",
        "errorMessage"
    })
    public static class ErrorInformation {

        @XmlElement(name = "Timestamp", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlElement(name = "Filename", required = true)
        protected String filename;
        @XmlElement(name = "SupplierId")
        protected int supplierId;
        @XmlElement(name = "W3CCompatibility", required = true)
        protected HRBAXMLErrorInformation.ErrorInformation.W3CCompatibility w3CCompatibility;
        @XmlElement(name = "ErrorMessage")
        protected List<HRBAXMLErrorInformation.ErrorInformation.ErrorMessage> errorMessage;

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Gets the value of the filename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilename() {
            return filename;
        }

        /**
         * Sets the value of the filename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilename(String value) {
            this.filename = value;
        }

        /**
         * Gets the value of the supplierId property.
         * 
         */
        public int getSupplierId() {
            return supplierId;
        }

        /**
         * Sets the value of the supplierId property.
         * 
         */
        public void setSupplierId(int value) {
            this.supplierId = value;
        }

        /**
         * Gets the value of the w3CCompatibility property.
         * 
         * @return
         *     possible object is
         *     {@link HRBAXMLErrorInformation.ErrorInformation.W3CCompatibility }
         *     
         */
        public HRBAXMLErrorInformation.ErrorInformation.W3CCompatibility getW3CCompatibility() {
            return w3CCompatibility;
        }

        /**
         * Sets the value of the w3CCompatibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link HRBAXMLErrorInformation.ErrorInformation.W3CCompatibility }
         *     
         */
        public void setW3CCompatibility(HRBAXMLErrorInformation.ErrorInformation.W3CCompatibility value) {
            this.w3CCompatibility = value;
        }

        /**
         * Gets the value of the errorMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HRBAXMLErrorInformation.ErrorInformation.ErrorMessage }
         * 
         * 
         */
        public List<HRBAXMLErrorInformation.ErrorInformation.ErrorMessage> getErrorMessage() {
            if (errorMessage == null) {
                errorMessage = new ArrayList<HRBAXMLErrorInformation.ErrorInformation.ErrorMessage>();
            }
            return this.errorMessage;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "referenceId",
            "errorCode",
            "additionalInformation"
        })
        public static class ErrorMessage {

            @XmlElement(name = "ReferenceId", required = true)
            protected String referenceId;
            @XmlElement(name = "ErrorCode", required = true)
            protected String errorCode;
            @XmlElement(name = "AdditionalInformation", required = true)
            protected String additionalInformation;

            /**
             * Gets the value of the referenceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceId() {
                return referenceId;
            }

            /**
             * Sets the value of the referenceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceId(String value) {
                this.referenceId = value;
            }

            /**
             * Gets the value of the errorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorCode() {
                return errorCode;
            }

            /**
             * Sets the value of the errorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorCode(String value) {
                this.errorCode = value;
            }

            /**
             * Gets the value of the additionalInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalInformation() {
                return additionalInformation;
            }

            /**
             * Sets the value of the additionalInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalInformation(String value) {
                this.additionalInformation = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Wellformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "wellformed",
            "row",
            "column"
        })
        public static class W3CCompatibility {

            @XmlElement(name = "Wellformed")
            protected boolean wellformed;
            @XmlElement(name = "Row")
            protected Integer row;
            @XmlElement(name = "Column")
            protected Integer column;

            /**
             * Gets the value of the wellformed property.
             * 
             */
            public boolean isWellformed() {
                return wellformed;
            }

            /**
             * Sets the value of the wellformed property.
             * 
             */
            public void setWellformed(boolean value) {
                this.wellformed = value;
            }

            /**
             * Gets the value of the row property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRow() {
                return row;
            }

            /**
             * Sets the value of the row property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRow(Integer value) {
                this.row = value;
            }

            /**
             * Gets the value of the column property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getColumn() {
                return column;
            }

            /**
             * Sets the value of the column property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setColumn(Integer value) {
                this.column = value;
            }

        }

    }

}