package br.com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class seguranca {
	
	
	@Autowired
	public void configuracaoGlobal(AuthenticationManagerBuilder builder) {
		try {
			builder.inMemoryAuthentication()
			.withUser("x").password("123").roles("ADMIN")
			.and()
			.withUser("y").password("123").roles("MASTER");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
