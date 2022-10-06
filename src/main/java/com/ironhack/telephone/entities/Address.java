package com.ironhack.telephone.entities;

import lombok.*;

import javax.persistence.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String postAddress;
    private String city;
    private Integer postalCode;



}
