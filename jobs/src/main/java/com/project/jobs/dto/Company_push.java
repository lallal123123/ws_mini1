package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company_push {

	private Long c_push_no;
	private String content; 
	private Date reg_date;
	private Long target_no;
	private String hidden; 
}
