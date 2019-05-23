package br.com.globalweb.utils;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport
{    
	@Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}