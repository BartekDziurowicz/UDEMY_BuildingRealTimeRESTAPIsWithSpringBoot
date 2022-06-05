package com.springboot.blog.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Column(name = "title", nullable = false)
    private String title;
    @NonNull
    @Column(name = "description", nullable = false)
    private String description;
    @NonNull
    @Column(name = "content", nullable = false)
    private String content;

}
