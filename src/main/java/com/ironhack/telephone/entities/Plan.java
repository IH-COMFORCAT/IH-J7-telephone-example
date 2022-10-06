package com.ironhack.telephone.entities;

import lombok.*;

import javax.persistence.*;
import java.math.*;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    @ManyToMany(mappedBy = "plans")
    private Set<User> users;


}
