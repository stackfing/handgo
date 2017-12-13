package com.stackfing.handgo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@ToString
public class Provider {

    @Id
    @GeneratedValue
    private Long pid;

    @NotNull
    private String account;

    @NotNull
    private String password;

    @NotNull
    @ColumnDefault("1")
    private int status;

    @NotNull
    @ColumnDefault("1")
    private int permission;

}
