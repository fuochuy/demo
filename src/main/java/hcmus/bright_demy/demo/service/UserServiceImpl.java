package hcmus.bright_demy.demo.service;

import hcmus.bright_demy.demo.model.User;
import hcmus.bright_demy.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
