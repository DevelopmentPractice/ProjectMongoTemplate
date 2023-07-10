package edu.development.practice.mongo.template.service;

import edu.development.practice.mongo.template.entity.User;
import edu.development.practice.mongo.template.request.UserRequest;

public interface UserService {

    User insert(UserRequest request);

}
