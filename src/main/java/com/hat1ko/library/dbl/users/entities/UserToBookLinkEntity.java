package com.hat1ko.library.dbl.users.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userToBookLink")
public class UserToBookLinkEntity {
    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.AUTO)
    @Column
    private String id;

    @Id
    @Column
    private String userId;

    @Id
    @Column
    private String bookId;
}
