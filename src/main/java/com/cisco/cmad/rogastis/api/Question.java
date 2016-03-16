//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.04 at 11:46:25 PM IST 
//

package com.cisco.cmad.rogastis.api;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="questionId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "questionId", "question", "loginId" })
@XmlRootElement(name = "question")
@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue
	@XmlElement(required = true)
	protected BigInteger questionId;
	@XmlElement(required = true)
	protected String question;
	@XmlElement(required = true)
	protected String loginId;

	/**
	 * Gets the value of the questionId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	@Column(name = "questionId")
	public BigInteger getQuestionId() {
		return questionId;
	}

	/**
	 * Sets the value of the questionId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setQuestionId(BigInteger value) {
		this.questionId = value;
	}

	/**
	 * Gets the value of the question property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Sets the value of the question property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQuestion(String value) {
		this.question = value;
	}

	/**
	 * Gets the value of the loginId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "loginId")
	public String getloginId() {
		return loginId;
	}

	/**
	 * Sets the value of the loginId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setloginId(String value) {
		this.loginId = value;
	}

}
