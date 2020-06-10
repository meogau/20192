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
@Table(name = "benh_nhan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BenhNhan.findAll", query = "SELECT b FROM BenhNhan b"),
    @NamedQuery(name = "BenhNhan.findById", query = "SELECT b FROM BenhNhan b WHERE b.id = :id"),
    @NamedQuery(name = "BenhNhan.findByTen", query = "SELECT b FROM BenhNhan b WHERE b.ten = :ten"),
    @NamedQuery(name = "BenhNhan.findByNgaySinh", query = "SELECT b FROM BenhNhan b WHERE b.ngaySinh = :ngaySinh"),
    @NamedQuery(name = "BenhNhan.findByDiaChi", query = "SELECT b FROM BenhNhan b WHERE b.diaChi = :diaChi"),
    @NamedQuery(name = "BenhNhan.findBySoBh", query = "SELECT b FROM BenhNhan b WHERE b.soBh = :soBh")})
public class BenhNhan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TEN")
    private String ten;
    @Column(name = "NGAY_SINH")
    private String ngaySinh;
    @Column(name = "DIA_CHI")
    private String diaChi;
    @Column(name = "SO_BH")
    private String soBh;

    public BenhNhan() {
    }

    public BenhNhan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoBh() {
        return soBh;
    }

    public void setSoBh(String soBh) {
        this.soBh = soBh;
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
        if (!(object instanceof BenhNhan)) {
            return false;
        }
        BenhNhan other = (BenhNhan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thainguyen.model.BenhNhan[ id=" + id + " ]";
    }
    
}
