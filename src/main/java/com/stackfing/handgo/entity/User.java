package com.stackfing.handgo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@NoArgsConstructor
@Data
@ToString
public class User {

    @Id
    @GeneratedValue
    private Long uid;

    @NotNull
    @ColumnDefault("1")
    private int permission;

    private Date lastLogin;

    @NotNull
    private String account;

    @NotNull
    private String password;


}
