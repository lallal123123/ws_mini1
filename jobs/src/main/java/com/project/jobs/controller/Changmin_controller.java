package com.project.jobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.jobs.dto.Member;
import com.project.jobs.service.MemberService;

@Controller
@RequestMapping("/members")
public class Changmin_controller {

	@Autowired
	private MemberService memberService;

	@GetMapping
	public String getAllMembers(Model model) {
		List<Member> members = memberService.getAllMembers();
		model.addAttribute("members", members);
		return "member/list";
	}

	@GetMapping("/{id}")
	public String getMemberById(@PathVariable Long id, Model model) {
		Member member = memberService.getMemberById(id);
		if (member == null) {
			return "error/404"; 
		}
		model.addAttribute("member", member);
		return "member/detail";
	}

	@GetMapping("/create")
	public String createMemberForm(Model model) {
		model.addAttribute("member", new Member());
		return "member/form"; 
	}

	@PostMapping("/create")
	public String createMember(@ModelAttribute Member member) {
		memberService.insertMember(member);
		return "redirect:/members";
	}

	@GetMapping("/edit/{id}")
	public String updateMemberForm(@PathVariable Long id, Model model) {
		Member member = memberService.getMemberById(id);
		if (member == null) {
			return "error/404";
		}
		model.addAttribute("member", member);
		return "member/form";
	}

	@PostMapping("/edit/{id}")
	public String updateMember(@PathVariable Long id, @ModelAttribute Member member) {
		memberService.updateMember(id, member);
		return "redirect:/members";
	}

	@GetMapping("/delete/{id}")
	public String deleteMember(@PathVariable Long id) {
		memberService.deleteMember(id);
		return "redirect:/members";
	}
}
