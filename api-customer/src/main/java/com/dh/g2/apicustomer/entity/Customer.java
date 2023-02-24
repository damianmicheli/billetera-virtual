package com.dh.g2.apicustomer.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter @Setter @NoArgsConstructor
@Entity

@Table(name = "customers")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "id_type")
    private String idType;
    @NonNull
    @Column(name = "id_num")
    private int idNum;
    @NonNull
    @Column(name = "first_name")
    private String firstName;
    @NonNull
    @Column(name = "last_name")
    private String lastName;
    private String gender;
    @Column(name = "date_of_birth")
    private LocalDate birthDate;
}