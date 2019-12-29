package com.moneyhub.web.cus;

import java.util.Date;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class CustomerDTO {
	private Long id;
	private String cemail;
	private String cpwd;
	private String cname;
	private String cntcd;
	private String cphone;
	private String cstcd;
	private Date sdate;
	private String wdate;
	private String udate;

	private String gender;
	private int hak;
	private int ban;
	private int score;
	private String role;

}
