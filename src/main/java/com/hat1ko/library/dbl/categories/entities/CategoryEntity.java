package com.hat1ko.library.dbl.categories.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.AUTO)
    @Column
    private String id;

    @Column
    private String name;
}
