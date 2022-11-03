package com.gmess.workshopmongodb.service;

import com.gmess.workshopmongodb.domain.User;
import com.gmess.workshopmongodb.dto.UserDTO;
import com.gmess.workshopmongodb.mapper.UserMapper;
import com.gmess.workshopmongodb.repository.UserRepository;
import com.gmess.workshopmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    UserMapper userMapper;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found."));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public User update(User obj){
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
         newObj.setName(obj.getName());
         newObj.setEmail(obj.getEmail());
    }


    public User fromDTO(UserDTO objDto){
        return userMapper.toEntity(objDto);
    }


}
