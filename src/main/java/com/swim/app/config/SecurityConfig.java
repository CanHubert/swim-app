package com.swim.app.config;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private IUserService userService;
	
//	 @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http
//	                .authorizeRequests()
//	                    .antMatchers(
//	                            "/registration**",
//	                            "/js/**",
//	                            "/css/**",
//	                            "/img/**",
//	                            "/webjars/**").permitAll()
//	                    .anyRequest().authenticated()
//	                .and()
//	                    .formLogin()
//	                        .loginPage("/login")
//	                            .permitAll()
//	                .and()
//	                    .logout()
//	                        .invalidateHttpSession(true)
//	                        .clearAuthentication(true)
//	                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//	                        .logoutSuccessUrl("/login?logout")
//	                .permitAll();
//	    }
	
//	 @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//	        auth.inMemoryAuthentication()
//	                .withUser("user").password("{noop}password").roles("USER")
//	                .and()
//	                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");
//
//	    }
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest()
//				.authenticated().and()
//				// .formLogin().and()
//				.httpBasic();
//		http.authorizeRequests()
//	    .antMatchers(HttpMethod.GET, "/api/v1/**").permitAll()
//	    .anyRequest().authenticated();
//		http.httpBasic().and().authorizeRequests()
//		.antMatchers("/api/v1/**").hasRole("ADMIN")
//		.antMatchers("/api/users").permitAll().and().csrf().disable().formLogin().disable();
//	}
	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//	    web.ignoring().antMatchers("/api/v1/**");
//	}
//
//	    @Bean
//	    public BCryptPasswordEncoder passwordEncoder(){
//	        return new BCryptPasswordEncoder();
//	    }
//
//	    @Bean
//	    public DaoAuthenticationProvider authenticationProvider(){
//	        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
//	        auth.setUserDetailsService(userService);
//	        auth.setPasswordEncoder(passwordEncoder());
//	        return auth;
//	    }

//	    @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	        auth.authenticationProvider(authenticationProvider());
//	    }

}
