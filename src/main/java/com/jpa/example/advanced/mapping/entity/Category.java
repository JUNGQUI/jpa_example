package com.jpa.example.advanced.mapping.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "category")
public class Category extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "category_item", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
    @JsonManagedReference
    private List<Item> items;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    @JsonManagedReference
    @OneToMany(mappedBy = "parent")
    private List<Category> child;
}
