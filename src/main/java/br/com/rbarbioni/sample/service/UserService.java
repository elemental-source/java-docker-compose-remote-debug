package br.com.rbarbioni.sample.service;

import br.com.rbarbioni.sample.model.User;
import br.com.rbarbioni.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save (User user){
        return this.userRepository.save(user);
    }
}