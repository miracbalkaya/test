package com.example.demo.episodeFaculty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "view1")
public class EpisodeFacultyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="episodeid")
    private Integer episodeid;

    @Column(name="episodename")
    private String episodename;

    @Column(name="name")
    private String name;
}
