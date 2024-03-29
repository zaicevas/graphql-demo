package com.aeroplane.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Broker {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Contract contract;

    private String firstName;
    private String lastName;
}