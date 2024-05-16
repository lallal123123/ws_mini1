package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mem_push {
	
	private Long m_push_no; 
	private Long target_no;
	private String content;
	private Date reg_date;
	private String hidden;
}
