package com.project.jobs.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Notice {
	
	private Long notice_no;
	private Long mem_no;
	private String title;
	private String content;
	private Date reg_date;

}
