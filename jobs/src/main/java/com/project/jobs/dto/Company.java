package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {

	private Long com_no; 
	private String com_id; 
	private String com_pw;
	private String com_name; 
	private String com_size;
	private String com_ceo;
	private String com_addr; 
	private String com_companynum; 
	private String com_tel; 
	private String com_email; 
	private String com_url; 
	private Date make_date; 
}
