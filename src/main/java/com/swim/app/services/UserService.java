package com.swim.app.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swim.app.auth.UserRegistration;
import com.swim.app.dao.IUserDao;
import com.swim.app.entity.Role;
import com.swim.app.entity.User;


@Service
@Transactional
public class UserService {
	
//	@Autowired
//	private IUserDao dao;
//	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	
//
//	@Override
//	public User find(long id) {
//		return dao.find(id);
//	}
//
//
//	@Override
//	public List<User> findAll() {
//		return dao.findAll();
//	}
//
//	@Override
//	public void save(User user) {
//		dao.save(user);
//	}

//	@Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = dao.findByEmail(email);
//        if (user == null){
//            throw new UsernameNotFoundException("Invalid username or password.");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getEmail(),
//                user.getPassword(),
//                mapRolesToAuthorities(user.getRoles()));
//    }
//
//    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
//        return roles.stream()
//                .map(role -> new SimpleGrantedAuthority(role.getName()))
//                .collect(Collectors.toList());
//    }
//
//	@Override
//	public User save(UserRegistration registration) {
//		User user = new User();
//		user.setFirstName(registration.getFirstName());
//		user.setLastName(registration.getLastName());
//		user.setEmail(registration.getEmail());
//		user.setPassword(passwordEncoder.encode(registration.getPassword()));
//		user.setRoles(Arrays.asList(new Role("ROLE_USER")));
//		return dao.save(user);
//	}

	
}
