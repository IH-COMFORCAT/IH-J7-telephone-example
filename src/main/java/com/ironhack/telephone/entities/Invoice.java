package com.ironhack.telephone.entities;

import lombok.*;

import javax.persistence.*;
import java.math.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String month;
    private BigDecimal total;
    private boolean isPaid;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
