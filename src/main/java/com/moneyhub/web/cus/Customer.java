package com.moneyhub.web.cus;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
@Table(name="CUSTOMER")
public class Customer {
//	private String cno,
//	cemail,
//	cpwd,
//	cname,
//	cntcd,		// 고객 국가 코드
//	cphone,
//	cstcd,		// 고객상태코드
//	sdate,		// 가입일
//	wdate,		// 탈퇴일
//	udate;		// 수정일

	/*	private String 
	  CNO, CEMAIL, CPWD, CNAME, CNTCD, 
	  CPHONE, CSTCD, SDATE, WDATE, UDATE;		*/
	
	@Id
	@GeneratedValue
	@Column(name="ID", nullable=false) 
	private Long id;
	@Column(name="CEMAIL", nullable=false)
	private String cemail;
	@Column(name="CPWD", nullable=false)
	private String cpwd;
	@Column(name="CNAME", nullable=false)
	private String cname;
	@Column(name="CNTCD", nullable=true)
	private String cntcd;
	@Column(name="CPHONE", nullable=false)
	private String cphone;
	@Column(name="CSTCD", nullable=true)
	private String cstcd;
	@Temporal(TemporalType.DATE)
	@Column(name="SDATE", nullable=true)
	private Date sdate;
	@Column(name="WDATE", nullable=true)
	private String wdate;
	@Column(name="UDATE", nullable=true)
	private String udate;
	
	@Column(name="GENDER", nullable=true)
	private String gender;
	@Column(name="HAK", nullable=true)
	private int hak;
	@Column(name="BAN", nullable=true)
	private int ban;
	@Column(name="SCORE", nullable=true)
	private int score;

	
}
