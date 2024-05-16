package com.project.jobs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Portfolio {

	private Long portfolio_no;
	private Long s_resume_no;
	private String url;
	private String file;
	private Long mem_no;
}
