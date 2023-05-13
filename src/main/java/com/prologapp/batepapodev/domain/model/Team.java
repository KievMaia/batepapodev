package com.prologapp.batepapodev.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder(toBuilder = true, setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(schema = "public", name = "time")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @OneToMany(mappedBy = "team")
    private List<User> users;

}
