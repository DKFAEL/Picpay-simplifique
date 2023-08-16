package com.picpaysimplified.domain.user.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String primeiroNome;
    private  String ultimoNome;
    @Column(unique = true)
    private  String documento;
    @Column(unique = true)
    private  String email;
    private  String senha;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

}
