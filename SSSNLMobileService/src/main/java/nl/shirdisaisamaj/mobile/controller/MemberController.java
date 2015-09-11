package nl.shirdisaisamaj.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.shirdisaisamaj.mobile.dao.MemberDAO;
import nl.shirdisaisamaj.mobile.helper.Helper;
import nl.shirdisaisamaj.mobile.model.Member;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberDAO memberDao;
	
	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public List<Member> listAll() {
		return memberDao.retrieveMembers(null);
	}
	
	@RequestMapping(value="/listByFilter", method = RequestMethod.POST)
	public List<Member> listByFilter(@RequestBody Member member) {
		return memberDao.retrieveMembers(member);
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@RequestBody Member member) {
		return memberDao.saveMember(Helper.processMember(member));
	}
}