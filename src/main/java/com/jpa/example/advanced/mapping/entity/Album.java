package com.jpa.example.advanced.mapping.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "ALBUM")
@DiscriminatorValue("A")
public class Album extends Item {
    private String artist;
    private String etc;
}
