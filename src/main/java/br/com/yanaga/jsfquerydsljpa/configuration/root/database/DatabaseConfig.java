package br.com.yanaga.jsfquerydsljpa.configuration.root.database;

import javax.sql.DataSource;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public interface DatabaseConfig {

	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception;

	public DataSource dataSource();

}