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
    private Long typeId;    //类型id

    @NotNull
    private String typeName;    //类型名

}
