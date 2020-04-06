package com.jpa.example.advanced.mapping.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "CATEGORY")
public class Category extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
    @JsonManagedReference
    private List<Item> items;

    @JsonBackReference
    @ManyToOne
    private Category parent;

    @JsonManagedReference
    @OneToMany(mappedBy = "parent")
    private List<Category> child;
}
