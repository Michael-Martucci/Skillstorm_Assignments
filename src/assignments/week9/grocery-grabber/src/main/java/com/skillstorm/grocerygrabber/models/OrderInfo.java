package com.skillstorm.grocerygrabber.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name = "order_info")
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column
    private String scheduledTime;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<GroceryItem> groceryItems;

    //constructors

    public OrderInfo(){}

    

    public OrderInfo(int orderId, String scheduledTime, Customer customer) {
        this.orderId = orderId;
        this.scheduledTime = scheduledTime;
        this.customer = customer;
    }



    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    // @Override
    // public String toString() {
    //     return "OrderInfo [orderId=" + orderId + ", scheduledTime=" + scheduledTime + ", customer=" + customer
    //             + ", groceryItems=" + groceryItems + "]";
    // }



    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + orderId;
    //     result = prime * result + ((scheduledTime == null) ? 0 : scheduledTime.hashCode());
    //     result = prime * result + ((customer == null) ? 0 : customer.hashCode());
    //     result = prime * result + ((groceryItems == null) ? 0 : groceryItems.hashCode());
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
    //     OrderInfo other = (OrderInfo) obj;
    //     if (orderId != other.orderId)
    //         return false;
    //     if (scheduledTime == null) {
    //         if (other.scheduledTime != null)
    //             return false;
    //     } else if (!scheduledTime.equals(other.scheduledTime))
    //         return false;
    //     if (customer == null) {
    //         if (other.customer != null)
    //             return false;
    //     } else if (!customer.equals(other.customer))
    //         return false;
    //     if (groceryItems == null) {
    //         if (other.groceryItems != null)
    //             return false;
    //     } else if (!groceryItems.equals(other.groceryItems))
    //         return false;
    //     return true;
    // }

    

}
