package az.tutor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;


@AllArgsConstructor
@Getter
public enum UserStatus {
    PENDING(0), ACTIVE(1), DELETED(2);

    private final int status;

    public static UserStatus from(int status) {
        return Arrays.stream(values())
                .filter(f -> f.status == status)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown user status " + status));
    }

}
