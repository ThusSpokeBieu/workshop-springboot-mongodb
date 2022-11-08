package com.gmess.workshopmongodb.service;

import com.gmess.workshopmongodb.domain.Post;
import com.gmess.workshopmongodb.dto.PostDTO;
import com.gmess.workshopmongodb.mapper.PostMapper;
import com.gmess.workshopmongodb.repository.PostRepository;
import com.gmess.workshopmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    @Autowired
    PostMapper postMapper;

    public List<Post> findAll(){
        return repo.findAll();
    }

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found."));
    }

    public List<Post> findByTitle (String text){
        return repo.searchTitle(text);
    }

    public Post insert(Post obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public Post update(Post obj){
        Post newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(Post newObj, Post obj) {
        newObj.setTitle(obj.getTitle());
        newObj.setBody(obj.getBody());
    }

    public List<Post> fullSearch (String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repo.fullSearch(text, minDate, maxDate);
    }

    public Post fromDTO(PostDTO objDto){
        return postMapper.toEntity(objDto);
    }
}
