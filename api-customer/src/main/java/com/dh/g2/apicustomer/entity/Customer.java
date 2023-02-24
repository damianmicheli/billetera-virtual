package com.dh.g2.apicustomer.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;



@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String idType;
    @NonNull
    private int idNum;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String gender;
    @NonNull
    private LocalDate birthdate;
}