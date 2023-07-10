package edu.development.practice.mongo.template.service.impl;

import edu.development.practice.mongo.template.entity.User;
import edu.development.practice.mongo.template.request.UserRequest;
import edu.development.practice.mongo.template.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final MongoTemplate mongoTemplate;
    @Override
    public User insert(UserRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());
        return mongoTemplate.insert(user);

    }
}
