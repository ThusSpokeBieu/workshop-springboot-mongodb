package com.gmess.workshopmongodb.service;

import com.gmess.workshopmongodb.domain.Post;
import com.gmess.workshopmongodb.repository.PostRepository;
import com.gmess.workshopmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found."));
    }
}
