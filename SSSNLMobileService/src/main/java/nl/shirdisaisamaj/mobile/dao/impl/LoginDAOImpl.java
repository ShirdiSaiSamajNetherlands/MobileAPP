package nl.shirdisaisamaj.mobile.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import nl.shirdisaisamaj.mobile.constants.GeneralConstants;
import nl.shirdisaisamaj.mobile.dao.LoginDAO;
import nl.shirdisaisamaj.mobile.model.Credential;

public class LoginDAOImpl implements LoginDAO {

	private SessionFactory sessionFactory;

	public LoginDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public String authendicate(Credential credential) {
		long count = 0;
		if(credential != null){
			Session session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Credential.class);
			criteria.add(Restrictions.eq(GeneralConstants.CREDENTIAL_USERNAME, credential.getUsername()));
			criteria.add(Restrictions.eq(GeneralConstants.CREDENTIAL_PASSWORD, credential.getPassword()));
			count = (Long)criteria.setProjection(Projections.rowCount()).uniqueResult();
			session.close();
		}
		return count > 0 ? GeneralConstants.AUTHENDICATED : GeneralConstants.NOT_AUTHENDICATED;
	}
}