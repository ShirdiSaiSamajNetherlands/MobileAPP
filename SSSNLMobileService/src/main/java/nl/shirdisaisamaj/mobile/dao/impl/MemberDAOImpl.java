package nl.shirdisaisamaj.mobile.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import nl.shirdisaisamaj.mobile.constants.GeneralConstants;
import nl.shirdisaisamaj.mobile.dao.MemberDAO;
import nl.shirdisaisamaj.mobile.model.Member;

public class MemberDAOImpl implements MemberDAO {

	private SessionFactory sessionFactory;

	public MemberDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional
	public String saveMember(Member member) {
		sessionFactory.getCurrentSession().save(member);
		return GeneralConstants.SUCCESS;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Member> retrieveMembers(Member member) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Member.class);
		if(member != null){
			if(member.getName() != null){
				criteria.add(Restrictions.eq(GeneralConstants.MEMBER_NAME, member.getName()));
			}
			if(member.getAge() != 0){
				criteria.add(Restrictions.eq(GeneralConstants.MEMBER_AGE, member.getAge()));
			}
			if(member.getMobileNumber() != null){
				criteria.add(Restrictions.eq(GeneralConstants.MEMBER_MOBILE_NUMBER, member.getMobileNumber()));
			}
			if(member.getSeva1() != 0){
				criteria.add(Restrictions.eq(GeneralConstants.MEMBER_SEVA1, member.getSeva1()));
			}
			if(member.getSeva2() != 0){
				criteria.add(Restrictions.eq(GeneralConstants.MEMBER_SEVA2, member.getSeva2()));
			}
			if(member.getSeva3() != 0){
				criteria.add(Restrictions.eq(GeneralConstants.MEMBER_SEVA3, member.getSeva3()));
			}
			if(member.getSeva4() != 0){
				criteria.add(Restrictions.eq(GeneralConstants.MEMBER_SEVA4, member.getSeva4()));
			}
		}
		List<Member> list = (List<Member>)criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		session.close();
		return list;
	}
}