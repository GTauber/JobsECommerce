package br.com.taubercommerce.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class JobsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Lob
    private String description;
    private String company;
    private BigDecimal price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "JobsModel{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
