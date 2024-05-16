package com.project.jobs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Site_resume {

	private Long s_resume_no; 
	private String mem_no; 
	private String img_url; 
	private String hope_job; 
	private String addr;
	private String part; 
	private String military; 
	private String etc; 
	private String motive; 
	private String personality; 
	private String aspiration; 
	private String growth; 
}
