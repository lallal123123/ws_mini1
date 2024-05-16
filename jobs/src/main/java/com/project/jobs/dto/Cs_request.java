package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cs_request {
	
	private Long request_no;
	private Long cs_no;
	private String content;
	private Date reg_date;
	private String title;
}
