package com.user.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name="USER_TABLE", schema = "USERS")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

}
