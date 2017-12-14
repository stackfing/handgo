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
    private Long pid;   //id

    @NotNull
    private String productName; //产品名

    @NotNull
    private String productPhoto;    //产品图片地址

    @ManyToOne
    private ProductType productType;    //产品类型

    @NotNull
    private Float nowPrice; //价格

    @NotNull
    private int quantity;   //供货数量

    @NotNull
    private int sold;   //已经出售数量

    @NotNull
    private int status; //产品状态

}
