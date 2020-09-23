package az.tutor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class User extends TutorBase implements Serializable {

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
