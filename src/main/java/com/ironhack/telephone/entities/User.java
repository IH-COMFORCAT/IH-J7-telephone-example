package com.ironhack.telephone.entities;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Embedded
    private Address address;
    @OneToMany(mappedBy = "user")
    private List<Invoice> invoices;
    @OneToOne
    @JoinColumn(name = "router_id")
    private Router router;
    @ManyToMany
    @JoinTable(
            name = "users_plans",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "plan_id")}
    )
    private Set<Plan> plans;


}
