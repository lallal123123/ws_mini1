package com.project.jobs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mem_recruit {
	
	private Long mem_recruit_no;
	private Long mem_no; 
	private Long recruit_no; 
	private Boolean pass; 
	private Boolean view;
	
	
}
