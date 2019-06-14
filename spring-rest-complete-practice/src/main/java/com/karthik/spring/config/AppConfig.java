package com.karthik.spring.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

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
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.karthik.spring")
@PropertySource({ "classpath:persistence-mysql.properties" })
public class AppConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;

	@Bean
	public DataSource mydatasource() {
		ComboPooledDataSource cds = new ComboPooledDataSource();

		try {
			cds.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		cds.setJdbcUrl(env.getProperty("jdbc.url"));
		cds.setUser(env.getProperty("jdbc.user"));
		cds.setPassword(env.getProperty("jdbc.password"));
		cds.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		cds.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		cds.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
		cds.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
		return cds;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(mydatasource());
		lsfb.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
		lsfb.setHibernateProperties(getHibernateProperties());
		return lsfb;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sf) {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sf);
		return htm;
	}

	private Properties getHibernateProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect",
				env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.show_sql",
				env.getProperty("hibernate.show_sql"));
		return props;
	}

	private int getIntProperty(String s) {
		int returnVal = Integer.parseInt(env.getProperty(s));
		return returnVal;
	}

}
