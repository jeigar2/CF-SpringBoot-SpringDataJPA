package es.comepiedras.retosprogramacion.spring_data.service;

import es.comepiedras.retosprogramacion.spring_data.model.User;
import es.comepiedras.retosprogramacion.spring_data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User userDetail){
        User user = userRepository.findById(id).orElseThrow();
        user.setUsername(userDetail.getUsername());
        user.setEmail(userDetail.getEmail());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
