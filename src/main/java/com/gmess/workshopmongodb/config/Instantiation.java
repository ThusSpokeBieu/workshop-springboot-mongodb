package com.gmess.workshopmongodb.config;

import com.gmess.workshopmongodb.domain.Post;
import com.gmess.workshopmongodb.domain.User;
import com.gmess.workshopmongodb.repository.PostRepository;
import com.gmess.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = User.builder().name("Maria Brown").email("mariabrown@email.com").build();
        User alex = User.builder().name("Alex Green").email("alex@gmail.com").build();
        User bob = User.builder().name("Bob Grey").email("bob@gmail.com").build();

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Going in a Trip!", "Going to Sao Paulo Brazil!", maria);
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Good Morning!", "I woke up so happy today!", maria);

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
