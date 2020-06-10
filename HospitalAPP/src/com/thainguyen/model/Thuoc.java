/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thainguyen.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "thuoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thuoc.findAll", query = "SELECT t FROM Thuoc t"),
    @NamedQuery(name = "Thuoc.findByTenThuoc", query = "SELECT t FROM Thuoc t WHERE t.tenThuoc = :tenThuoc"),
    @NamedQuery(name = "Thuoc.findByGiaTien", query = "SELECT t FROM Thuoc t WHERE t.giaTien = :giaTien")})
public class Thuoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TEN_THUOC")
    private String tenThuoc;
    @Basic(optional = false)
    @Column(name = "GIA_TIEN")
    private int giaTien;

    public Thuoc() {
    }

    public Thuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public Thuoc(String tenThuoc, int giaTien) {
        this.tenThuoc = tenThuoc;
        this.giaTien = giaTien;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tenThuoc != null ? tenThuoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Thuoc)) {
            return false;
        }
        Thuoc other = (Thuoc) object;
        if ((this.tenThuoc == null && other.tenThuoc != null) || (this.tenThuoc != null && !this.tenThuoc.equals(other.tenThuoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thainguyen.model.Thuoc[ tenThuoc=" + tenThuoc + " ]";
    }
    
}
