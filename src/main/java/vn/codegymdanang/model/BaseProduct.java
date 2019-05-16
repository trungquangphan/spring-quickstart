package vn.codegymdanang.model;

import com.sun.istack.internal.NotNull;
import org.springframework.stereotype.Component;

@Component
public class BaseProduct {
    private String name = "base_product";
    private int price = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
