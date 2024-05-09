package com.skillstorm.grocerygrabber.models;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column
    private String name;

    @Column
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<OrderInfo> orders;

    // constructors
    public Customer(){}

    

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    // @Override
    // public String toString() {
    //     return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", orders=" + orders
    //             + "]";
    // }



    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + customerId;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     result = prime * result + ((address == null) ? 0 : address.hashCode());
    //     result = prime * result + ((orders == null) ? 0 : orders.hashCode());
    //     return result;
    // }



    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Customer other = (Customer) obj;
    //     if (customerId != other.customerId)
    //         return false;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     if (address == null) {
    //         if (other.address != null)
    //             return false;
    //     } else if (!address.equals(other.address))
    //         return false;
    //     if (orders == null) {
    //         if (other.orders != null)
    //             return false;
    //     } else if (!orders.equals(other.orders))
    //         return false;
    //     return true;
    // }

    
}
