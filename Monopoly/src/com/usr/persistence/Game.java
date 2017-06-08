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
@Table(name = "GAME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Game.findAll", query = "SELECT g FROM Game g")
    , @NamedQuery(name = "Game.findById", query = "SELECT g FROM Game g WHERE g.id = :id")
    , @NamedQuery(name = "Game.findByDategame", query = "SELECT g FROM Game g WHERE g.dategame = :dategame")})
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATEGAME")
    private String dategame;
    @JoinColumn(name = "ORDERSEQUENCE", referencedColumnName = "ID")
    @ManyToOne
    private Ordersequence ordersequence;
    @JoinColumn(name = "PLAYER2_FK", referencedColumnName = "ID")
    @ManyToOne
    private Player player2Fk;
    @JoinColumn(name = "PLAYER1_FK", referencedColumnName = "ID")
    @ManyToOne
    private Player player1Fk;
    @JoinColumn(name = "PLAYER3_FK", referencedColumnName = "ID")
    @ManyToOne
    private Player player3Fk;

    public Game() {
    }

    public Game(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDategame() {
        return dategame;
    }

    public void setDategame(String dategame) {
        this.dategame = dategame;
    }

    public Ordersequence getOrdersequence() {
        return ordersequence;
    }

    public void setOrdersequence(Ordersequence ordersequence) {
        this.ordersequence = ordersequence;
    }

    public Player getPlayer2Fk() {
        return player2Fk;
    }

    public void setPlayer2Fk(Player player2Fk) {
        this.player2Fk = player2Fk;
    }

    public Player getPlayer1Fk() {
        return player1Fk;
    }

    public void setPlayer1Fk(Player player1Fk) {
        this.player1Fk = player1Fk;
    }

    public Player getPlayer3Fk() {
        return player3Fk;
    }

    public void setPlayer3Fk(Player player3Fk) {
        this.player3Fk = player3Fk;
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
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.usr.persistence.Game[ id=" + id + " ]";
    }
    
}
