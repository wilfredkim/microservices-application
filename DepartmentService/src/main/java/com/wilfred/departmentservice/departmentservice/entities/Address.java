package com.wilfred.departmentservice.departmentservice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Getter
@Setter
public class Address {
    @Column(name = "postal_address")
    private String postalAddress;
}
