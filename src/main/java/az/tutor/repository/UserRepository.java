package az.tutor.repository;

import az.tutor.model.Role;
import az.tutor.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void addUser(User user);
    Optional<User> getUserByEmail(String email);
    List<Role> getUserRoles(long userId);
}
