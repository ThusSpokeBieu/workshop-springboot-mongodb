package com.gmess.workshopmongodb.resource;

import com.gmess.workshopmongodb.domain.Post;
import com.gmess.workshopmongodb.domain.User;
import com.gmess.workshopmongodb.dto.UserDTO;
import com.gmess.workshopmongodb.mapper.UserMapper;
import com.gmess.workshopmongodb.service.PostService;
import com.gmess.workshopmongodb.service.UserService;
import com.gmess.workshopmongodb.util.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostService service;


    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value="/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value="text", defaultValue="") String text){
        text = URL.decodeParam(text);
        List<Post> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }
}
