package az.tutor.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Role {

    private Long id;
    private RoleName name;

    public Role(RoleName name) {
        this.name = name;
    }
}
