package com.picpaysimplified.domain.user.transaction;

import com.picpaysimplified.domain.user.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class transaction {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private BigDecimal amount;
        @ManyToOne
        @JoinColumn(name = "sender_id")
        private User sender;
        @ManyToOne
        @JoinColumn(name = "receiver_id")
        private User receiver;
        private LocalDateTime timestamp;
}
