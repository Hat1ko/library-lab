package com.hat1ko.library.dbl.books.entities;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.AccessType;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.AUTO)
    @Column
    private String id;

    @Column
    private String author;

    @Column
    private String name;

    @Column
    private Integer creationYear;

    @Id
    @Column
    private String categoryId;
}
