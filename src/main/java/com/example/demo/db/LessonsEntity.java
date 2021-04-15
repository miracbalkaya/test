package com.example.demo.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "lessons")
public class LessonsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="quota")
    private String quota;

    @Column(name="episodeid")
    private Integer episodeid;
}
