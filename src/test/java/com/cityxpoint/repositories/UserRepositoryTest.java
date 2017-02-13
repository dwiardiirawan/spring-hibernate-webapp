package com.cityxpoint.repositories;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cityxpoint.config.RootConfig;
import com.cityxpoint.model.User;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void findByUsername() {
		User britney = new User();
		britney.setUsername("britneyspears");
		britney.setPassword("password");
		britney.setDisplayName("Britney Spears");
		britney.setEmail("britneyspears@gmail.com");
		britney.setDescription("No Description");
		britney.setJoinedDate(new Date());
		britney.setCreatedBy("System");
		
		britney = userRepository.save(britney);
		
		User gaga = new User();
		gaga.setUsername("ladygaga");
		gaga.setPassword("password");
		gaga.setDisplayName("Lady Gaga");
		gaga.setEmail("ladygaga@gmail.com");
		gaga.setDescription("No Description");
		gaga.setJoinedDate(new Date());
		gaga.setCreatedBy("System");
		
		gaga = userRepository.save(gaga);
		
		List<User> result = userRepository.findByUsername(britney.getUsername());
		assertThat(result.size(), is(1));
		
	}

}
