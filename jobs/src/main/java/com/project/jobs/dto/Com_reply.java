package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Com_reply {
	
	private Long com_reply_no ;
	private Long com_community_no;
	private Long com_no; 
	private String content;
	private Date regdate;
}
