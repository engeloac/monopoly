/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usr.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sirbobby
 */
@Entity
@Table(name = "BOX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Box.findAll", query = "SELECT b FROM Box b")
    , @NamedQuery(name = "Box.findById", query = "SELECT b FROM Box b WHERE b.id = :id")
    , @NamedQuery(name = "Box.findByName", query = "SELECT b FROM Box b WHERE b.name = :name")
    , @NamedQuery(name = "Box.findByCost", query = "SELECT b FROM Box b WHERE b.cost = :cost")
    , @NamedQuery(name = "Box.findByRent", query = "SELECT b FROM Box b WHERE b.rent = :rent")
    , @NamedQuery(name = "Box.findByAmounthouses", query = "SELECT b FROM Box b WHERE b.amounthouses = :amounthouses")
    , @NamedQuery(name = "Box.findByAmounthotels", query = "SELECT b FROM Box b WHERE b.amounthotels = :amounthotels")
    , @NamedQuery(name = "Box.findByColor", query = "SELECT b FROM Box b WHERE b.color = :color")})
public class Box implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "COST")
    private Integer cost;
    @Column(name = "RENT")
    private Integer rent;
    @Column(name = "AMOUNTHOUSES")
    private Integer amounthouses;
    @Column(name = "AMOUNTHOTELS")
    private Integer amounthotels;
    @Column(name = "COLOR")
    private String color;
    @JoinColumn(name = "FK_PLAYER", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Player fkPlayer;

    public Box() {
    }

    public Box(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getAmounthouses() {
        return amounthouses;
    }

    public void setAmounthouses(Integer amounthouses) {
        this.amounthouses = amounthouses;
    }

    public Integer getAmounthotels() {
        return amounthotels;
    }

    public void setAmounthotels(Integer amounthotels) {
        this.amounthotels = amounthotels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Player getFkPlayer() {
        return fkPlayer;
    }

    public void setFkPlayer(Player fkPlayer) {
        this.fkPlayer = fkPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Box)) {
            return false;
        }
        Box other = (Box) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.usr.persistence.Box[ id=" + id + " ]";
    }
    
}
