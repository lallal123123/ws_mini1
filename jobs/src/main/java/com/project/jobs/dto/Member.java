package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {

	private Long mem_no; 
	private String mem_id; 
	private String mem_pw;
	private String mem_name; 
	private String mem_birth;
	private String mem_tel;
	private String mem_email;
	private String mem_gender;
	private Date make_date; 
}
