package com.project.jobs.regMemberDao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.project.jobs.dto.Member;

public interface RegMember {

	 @Select("SELECT * FROM member WHERE mem_no = #{mem_no}")
	    Member getMemberById(Long mem_no);

	    @Select("SELECT * FROM member")
	    List<Member> getAllMembers();

	    @Insert("INSERT INTO member (mem_id, mem_pw, mem_name, mem_birth, mem_tel, mem_email, mem_gender, make_date) VALUES (#{mem_id}, #{mem_pw}, #{mem_name}, #{mem_birth}, #{mem_tel}, #{mem_email}, #{mem_gender}, #{make_date})")
	    @Options(useGeneratedKeys = true, keyProperty = "mem_no")
	    void insertMember(Member member);

	    @Update("UPDATE member SET mem_id = #{mem_id}, mem_pw = #{mem_pw}, mem_name = #{mem_name}, mem_birth = #{mem_birth}, mem_tel = #{mem_tel}, mem_email = #{mem_email}, mem_gender = #{mem_gender}, make_date = #{make_date} WHERE mem_no = #{mem_no}")
	    void updateMember(Member member);

	    @Delete("DELETE FROM member WHERE mem_no = #{mem_no}")
	    void deleteMember(Long mem_no);
}
