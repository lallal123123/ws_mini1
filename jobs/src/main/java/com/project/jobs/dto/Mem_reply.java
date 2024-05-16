package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mem_reply {
	
	private Long mem_reply_no;
	private Long mem_community_no;
	private Long mem_no;
	private String content;
	private Date reg_date;

}
