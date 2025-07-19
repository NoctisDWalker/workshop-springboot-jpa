package com.projectspring.coursespring.config;
import com.projectspring.coursespring.resources.UserResource;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projectspring.coursespring.entities.User;
import com.projectspring.coursespring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    private final UserResource userResource;

	@Autowired
	private UserRepository userRepository;

    TesteConfig(UserResource userResource) {
        this.userResource = userResource;
    }

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
