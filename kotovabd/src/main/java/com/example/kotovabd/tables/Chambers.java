package com.example.kotovabd.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "chambers")
public class Chambers implements Serializable {

    @Id
    @Column(name = "chambers_id")
    private Long id_chamber;

    @JsonIgnore
    @OneToMany(mappedBy = "chambers")
    private Collection<Chambers> chambers;

    public Chambers() {}

    public Chambers(Long id_chamber, Collection<Chambers> chambers){
        this.id_chamber = id_chamber;
        this.chambers = chambers;
    }

    public Collection<com.example.kotovabd.tables.Chambers> getChambers() {
        return chambers;
    }

    public void setId_chamber(Long id_chamber) {
        this.id_chamber = id_chamber;
    }

    public Long getId_chamber() {
        return id_chamber;
    }

    public void setChambers(Collection<com.example.kotovabd.tables.Chambers> Chambers) {
        this.chambers = Chambers;
    }
}
