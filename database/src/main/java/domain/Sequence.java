package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Sequence {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    @NotNull
    @Min(value = 1)
    private Integer count;

    @Getter
    @Setter
    @NotNull
    @Pattern(regexp="[[-]?[0-9]+$[ ]]+$",message="only sequence of numbers")
    private String sequence;

}
