package com.project.jobs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jobs.dto.Member;
import com.project.jobs.regMemberDao.RegMember;

@Service
public class MemberService {

    @Autowired
    private RegMember RegMember;

    public Member getMemberById(Long mem_no) {
        return RegMember.getMemberById(mem_no);
    }

    public List<Member> getAllMembers() {
        return RegMember.getAllMembers();
    }

    public void insertMember(Member member) {
    	RegMember.insertMember(member);
    }

    public void updateMember(Member member) {
    	RegMember.updateMember(member);
    }

    public void deleteMember(Long mem_no) {
    	RegMember.deleteMember(mem_no);
    }

	public void updateMember(Long id, Member member) {
		// TODO Auto-generated method stub
		
	}
}
