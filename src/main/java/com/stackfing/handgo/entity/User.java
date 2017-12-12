package com.stackfing.handgo.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Data
@ToString
public class User {

    @Id
    @GeneratedValue
    private Long uid;

    @NotNull
    private int status;

    private String headPhoto;

    private String phoneNumber;
}
