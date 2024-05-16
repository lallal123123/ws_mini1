package com.project.jobs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Skill {

	private Long skill_no;
	private Long s_resume_no;
	private String keyword;
	private Long mem_no;
}
