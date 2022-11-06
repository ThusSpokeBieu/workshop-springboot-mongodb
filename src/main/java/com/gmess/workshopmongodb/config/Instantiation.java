package com.gmess.workshopmongodb.config;

import com.gmess.workshopmongodb.domain.Post;
import com.gmess.workshopmongodb.domain.User;
import com.gmess.workshopmongodb.dto.AuthorDTO;
import com.gmess.workshopmongodb.dto.CommentDTO;
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
        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = Post.builder()
                .date(sdf.parse("21/03/2018"))
                .title("Going to a travel!")
                .body("See ya soon, Sao Paulo - Brazil!")
                .author(new AuthorDTO(maria))
                .build();
        Post post2 =  Post.builder()
                .date(sdf.parse("23/03/2018"))
                .title("Good morning!")
                .body("I woke up so happy today!")
                .author(new AuthorDTO(maria))
                .build();

        CommentDTO comment1 = CommentDTO.builder()
                .text("Have a nice trip!")
                .date(sdf.parse("21/03/2018"))
                .author(new AuthorDTO(alex))
                .build();
        CommentDTO comment2 = CommentDTO.builder()
                .text("Sao paulo is such a wonderful place!")
                .date(sdf.parse("22/03/2018"))
                .author(new AuthorDTO(bob))
                .build();
        CommentDTO comment3 = CommentDTO.builder()
                .text("what's up? :D")
                .date(sdf.parse("23/03/2018"))
                .author(new AuthorDTO(alex))
                .build();
        post1.setComments(Arrays.asList(comment1,comment2));
        post2.setComments(Arrays.asList(comment3));

        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.setPosts(Arrays.asList(post1, post2));
        userRepository.save(maria);
    }
}
