package com.example.JPA.Embedded;


import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

    @EmbeddedId
    private  OrderId id;

    @Embedded
    private AddressInfo addressInfo;

    private String orderInfo;

    private String anotherField;
}
