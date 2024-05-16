package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Com_community {
	
	private Long com_community_no;
	private Long com_no;
	private String title; 
	private String content; 
	private Date redate;
	private String category; 

}
