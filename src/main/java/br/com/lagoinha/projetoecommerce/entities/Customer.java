package br.com.lagoinha.projetoecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="customer_id")
    private Long Id;

    @Column(nullable = false)
    private  String name;

    @Column(name="tax_id", length = 30, nullable = false)
    private String taxId;

    @Column(nullable = false)
    private String email;

    @Column (length = 20,nullable = false)
    private  String Phone;

    @Column(nullable = false)
    private String address;

    @Column(length = 20,nullable = false)
    private String complement;

    @Column(length = 6, nullable = false)
    private String number;

    @Column(length = 30,nullable = false)
    private  String  neighborhood;

    @Column(length = 40,nullable = false)
    private String city;

    @Column(length = 20, nullable = false)
    private String state;

   /* CREATE TABLE customer (
            customer_id bigserial PRIMARY KEY,
            name varchar(255) NOT NULL,
    tax_id varchar(30) NOT NULL,
    email varchar(255) NOT NULL,
    phone varchar(20) NOT NULL,
    address varchar(255) NOT NULL,
    complement varchar(20),
    number varchar(6) NOT NULL,
    neighborhood varchar(30) NOT NULL,
    city varchar(40) NOT NULL,
    state varchar(20) NOT NULL
);   */
}
