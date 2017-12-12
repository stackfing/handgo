package com.stackfing.handgo.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Data
@ToString
public class UserLocate {

    @Id
    @GeneratedValue
    @Min(1)
    @Max(5)
    private int locateId;

    @NotNull
    private String locate;

    @NotNull
    @ColumnDefault("0")
    private int isPrimary;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private User user;

}
