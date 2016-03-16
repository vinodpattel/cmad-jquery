//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.04 at 11:46:25 PM IST 
//

package com.cisco.cmad.rogastis.api;

import java.math.BigInteger;
import java.util.Date;

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
 *         &lt;element name="answerId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postedOn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="likes" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dislikes" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="loginId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="questionId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "answerId", "answer", "postedOn", "likes",
		"dislikes", "loginId", "questionId" })
@XmlRootElement(name = "answer")
@Entity
@Table(name = "answer")
public class Answer {

	@Id
	@GeneratedValue
	@XmlElement(required = true)
	protected BigInteger answerId;
	@XmlElement(required = true)
	protected String answer;
	@XmlElement(required = true)
	protected Date postedOn;
	@XmlElement(required = true)
	protected BigInteger likes;
	@XmlElement(required = true)
	protected BigInteger dislikes;
	@XmlElement(required = true)
	protected String loginId;
	@XmlElement(required = true)
	protected BigInteger questionId;

	/**
	 * Gets the value of the answerId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	@Column(name = "answerId")
	public BigInteger getAnswerId() {
		return answerId;
	}

	/**
	 * Sets the value of the answerId property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setAnswerId(BigInteger value) {
		this.answerId = value;
	}

	/**
	 * Gets the value of the answer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * Sets the value of the answer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAnswer(String value) {
		this.answer = value;
	}

	/**
	 * Gets the value of the postedOn property.
	 * 
	 * @return possible object is {@link Date }
	 * 
	 */
	public Date getPostedOn() {
		return postedOn;
	}

	/**
	 * Sets the value of the postedOn property.
	 * 
	 * @param value
	 *            allowed object is {@link Date }
	 * 
	 */
	public void setPostedOn(Date value) {
		this.postedOn = value;
	}

	/**
	 * Gets the value of the likes property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getLikes() {
		return likes;
	}

	/**
	 * Sets the value of the likes property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setLikes(BigInteger value) {
		this.likes = value;
	}

	/**
	 * Gets the value of the dislikes property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getDislikes() {
		return dislikes;
	}

	/**
	 * Sets the value of the dislikes property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setDislikes(BigInteger value) {
		this.dislikes = value;
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
	 *            allowed object is {@link String }
	 * 
	 */
	public void setloginId(String value) {
		this.loginId = value;
	}

	/**
	 * Gets the value of the questionId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "questionId")
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

}
