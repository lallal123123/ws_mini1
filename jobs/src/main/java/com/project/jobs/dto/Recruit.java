package com.project.jobs.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Recruit {

    private Long recruit_no; 
    private Long com_no;
    private String career;
    private String education;
    private String skill; 
    private String field; 
    private int pay;
    private String location;
    private String working_time; 
    private String rank; 
    private String title;
    private String com_size;
    private String qualification;
    private String welfare;
    private String seprocedure;
    private String notice;  
    private Date reg_date;
    private Date deadline_date;
    private int p_number; 
}
