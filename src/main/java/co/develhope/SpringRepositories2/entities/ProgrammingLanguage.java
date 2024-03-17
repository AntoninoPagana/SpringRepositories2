package co.develhope.SpringRepositories2.entities;

import jakarta.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Integer firstAppearance;
    @Column(nullable = false)
    private String inventor;
}
