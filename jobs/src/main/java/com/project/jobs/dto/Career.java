package com.project.jobs.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Career {
	
	private Long career_no;
	private Long s_resume_no;
	private String company;
	private Date join_date;
	private Date quit_date;
	private String main_part;
	private Long mem_no;
}
