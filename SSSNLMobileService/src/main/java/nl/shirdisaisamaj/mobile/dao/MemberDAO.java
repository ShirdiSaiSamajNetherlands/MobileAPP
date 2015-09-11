package nl.shirdisaisamaj.mobile.dao;

import java.util.List;

import nl.shirdisaisamaj.mobile.model.Member;

public interface MemberDAO {
    public String saveMember(Member member);
    public List<Member> retrieveMembers(Member member);
}