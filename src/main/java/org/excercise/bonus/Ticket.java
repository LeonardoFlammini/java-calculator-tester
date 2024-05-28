package org.excercise.bonus;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ticket {
    private String name;
    private int discount;
    private BigDecimal price, fare, km;


    public Ticket(String name, int age, BigDecimal km) {
        this.name = name;
        this.discount = setDiscount(age);
        this.km = km;
        this.fare = new BigDecimal(0.5);
        this.price = setPrice();
    }

    private BigDecimal setPrice() {
        BigDecimal discountRate = new BigDecimal(discount).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
        BigDecimal totalFare = km.multiply(fare);
        BigDecimal discountAmount = totalFare.multiply(discountRate);
        BigDecimal finalFare = totalFare.subtract(discountAmount);


        return finalFare.setScale(2, RoundingMode.HALF_UP);


    }

    private int setDiscount(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Not valid age");
        } else if (age > 0 && age < 18) {
            return 20;
        } else if (age > 65) {
            return 40;
        } else {
            return 0;
        }
    }

    public BigDecimal getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", discount=" + discount + "%" +
                ", price=" + price +
                ", fare/km=" + fare +
                ", km=" + km +
                '}';
    }
}
