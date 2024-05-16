package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cs_question {

	private Long cs_no;
	private Long mem_no;
	private String title;
	private String content;
	private Date reg_date;
	private String category;
	private Boolean ch_private; 
}
