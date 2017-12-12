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
public class ProductType {

    @Id
    @GeneratedValue
    private Long typeId;

    @NotNull
    private String typeName;

    @NotNull
    private String typeLink;

}
