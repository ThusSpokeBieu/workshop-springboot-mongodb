package com.gmess.workshopmongodb.config;

import com.gmess.workshopmongodb.domain.User;
import com.gmess.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User maria = User.builder().name("Maria Brown").email("mariabrown@email.com").build();
        User alex = User.builder().name("Alex Green").email("alex@gmail.com").build();
        User bob = User.builder().name("Bob Grey").email("bob@gmail.com").build();

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
