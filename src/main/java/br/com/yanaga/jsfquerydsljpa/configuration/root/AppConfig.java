package br.com.yanaga.jsfquerydsljpa.configuration.root;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.yanaga.jsfquerydsljpa.app.Receita;

@EnableTransactionManagement
@ComponentScan(basePackageClasses = { Receita.class, AppConfig.class })
@Configuration
public class AppConfig {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory);
	}
}