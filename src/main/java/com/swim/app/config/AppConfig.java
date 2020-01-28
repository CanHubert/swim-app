package com.swim.app.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = "com.swim.app")
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix(env.getProperty("view.suffix"));
		resolver.setPrefix(env.getProperty("view.prefix"));
		return resolver;
	}
	
	@Bean
	public DataSource getDataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		try {
			dataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			logger.warning("ERROR creating dataSource");
		}
		
		dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		dataSource.setUser(env.getProperty("jdbc.user"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		dataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		dataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		dataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
		dataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
		return dataSource;
	}
	
	 private Properties getHibernateProperties() {

	        // set hibernate properties
	        Properties props = new Properties();
	        props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
	        props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
	        props.setProperty("hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
	        return props;               
	    }

	    @Bean
	    public LocalSessionFactoryBean sessionFactory(){
	        // create session factorys
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        // set the properties
	        sessionFactory.setDataSource(getDataSource());
	        sessionFactory.setPackagesToScan(env.getProperty("hiberante.packagesToScan"));
	        sessionFactory.setHibernateProperties(getHibernateProperties());
	        return sessionFactory;
	    }

	    @Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	        // setup transaction manager based on session factory
	        HibernateTransactionManager txManager = new HibernateTransactionManager();
	        txManager.setSessionFactory(sessionFactory);
	        return txManager;
	    }  
	
	private int getIntProperty(String property) {
		return Integer.parseInt(env.getProperty(property));
	}
}
