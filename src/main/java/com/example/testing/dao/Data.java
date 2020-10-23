package com.example.testing.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name_id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "color")
    String color;
    @Column(name = "age")
    Long age;
}
