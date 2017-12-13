package com.stackfing.handgo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Product {

    @Id
    @GeneratedValue
    private Long pid;

    @NotNull
    private String name;

    @ManyToOne
    private ProductType productType;


}
