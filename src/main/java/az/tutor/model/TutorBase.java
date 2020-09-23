package az.tutor.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public abstract class TutorBase implements Serializable {

    protected long id;
    protected LocalDateTime insertDate;
    protected LocalDateTime lastUpdateDate;
    protected int status;

}
