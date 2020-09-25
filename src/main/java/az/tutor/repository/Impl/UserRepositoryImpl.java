package az.tutor.repository.Impl;

import az.tutor.ErrorMessages;
import az.tutor.model.Role;
import az.tutor.model.User;
import az.tutor.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
@Log4j2
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addUser(User user) {
        try {
            boolean success = true;
            KeyHolder keyHolder;

        } catch (Exception ex) {
            log.error(ErrorMessages.ERROR_REGISTER + user, ex);
            throw new RuntimeException(ErrorMessages.ERROR_REGISTER + user, ex);
        }
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Role> getUserRoles(long userId) {
        return null;
    }
}
