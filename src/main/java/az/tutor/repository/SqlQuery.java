package az.tutor.repository;

import az.tutor.model.Role;
import az.tutor.model.UserStatus;

import java.time.LocalDateTime;
import java.util.Set;

public class SqlQuery {

    public static final String ADD_USER = "insert into " +
            "user(firstname, lastname, username, email, mobile, password, user_status, status) " +
            "values(?, ?, ?, ?, ?, ?, ?, 1";

    public static final String ADD_USER_ROLE = "insert into user_role(user_id, role_id) values(?, ?)";

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String mobile;
    private String password;
    private UserStatus userStatus;
    private Set<Role> roles;
    private LocalDateTime registrationDate;
    private LocalDateTime activationDate;
}
