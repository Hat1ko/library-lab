package com.hat1ko.library.dbl.users.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.AUTO)
    @Column
    private String id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String password;

    @Id
    @Column
    private String roleId;
}
