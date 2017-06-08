/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usr.persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sirbobby
 */
@Entity
@Table(name = "ORDERSEQUENCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordersequence.findAll", query = "SELECT o FROM Ordersequence o")
    , @NamedQuery(name = "Ordersequence.findById", query = "SELECT o FROM Ordersequence o WHERE o.id = :id")
    , @NamedQuery(name = "Ordersequence.findByOrden", query = "SELECT o FROM Ordersequence o WHERE o.orden = :orden")})
public class Ordersequence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ORDEN")
    private String orden;
    @OneToMany(mappedBy = "ordersequence")
    private List<Game> gameList;

    public Ordersequence() {
    }

    public Ordersequence(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @XmlTransient
    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
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
        if (!(object instanceof Ordersequence)) {
            return false;
        }
        Ordersequence other = (Ordersequence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.usr.persistence.Ordersequence[ id=" + id + " ]";
    }
    
}
