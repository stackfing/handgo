package com.stackfing.handgo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@NoArgsConstructor
@Data
@ToString
public class UserDetail {

    @Id
    @GeneratedValue
    private Long userDetailId;

    @NotNull
    private int status;

    private String headPhoto;

    @NotNull
    private String phoneNumber;

    @NotNull
    @Email
    private String email;

    @NotNull
    private Date createDate;

    @OneToOne(cascade = CascadeType.REMOVE)
    private User user;

}
