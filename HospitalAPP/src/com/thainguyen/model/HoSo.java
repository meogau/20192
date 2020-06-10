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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "ho_so")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HoSo.findAll", query = "SELECT h FROM HoSo h"),
    @NamedQuery(name = "HoSo.findByIdHoSo", query = "SELECT h FROM HoSo h WHERE h.idHoSo = :idHoSo"),
    @NamedQuery(name = "HoSo.findByIdBenhNhan", query = "SELECT h FROM HoSo h WHERE h.idBenhNhan = :idBenhNhan"),
    @NamedQuery(name = "HoSo.findByTrieuChung", query = "SELECT h FROM HoSo h WHERE h.trieuChung = :trieuChung"),
    @NamedQuery(name = "HoSo.findByChanDoan", query = "SELECT h FROM HoSo h WHERE h.chanDoan = :chanDoan"),
    @NamedQuery(name = "HoSo.findByXetNghiem", query = "SELECT h FROM HoSo h WHERE h.xetNghiem = :xetNghiem"),
    @NamedQuery(name = "HoSo.findByKetLuan", query = "SELECT h FROM HoSo h WHERE h.ketLuan = :ketLuan"),
    @NamedQuery(name = "HoSo.findByTrangThai", query = "SELECT h FROM HoSo h WHERE h.trangThai = :trangThai")})
public class HoSo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_HO_SO")
    private Integer idHoSo;
    @Column(name = "ID_BENH_NHAN")
    private Integer idBenhNhan;
    @Column(name = "TRIEU_CHUNG")
    private String trieuChung;
    @Column(name = "CHAN_DOAN")
    private String chanDoan;
    @Column(name = "XET_NGHIEM")
    private String xetNghiem;
    @Column(name = "KET_LUAN")
    private String ketLuan;
    @Column(name = "TRANG_THAI")
    private Integer trangThai;

    public HoSo() {
    }

    public HoSo(Integer idHoSo) {
        this.idHoSo = idHoSo;
    }

    public Integer getIdHoSo() {
        return idHoSo;
    }

    public void setIdHoSo(Integer idHoSo) {
        this.idHoSo = idHoSo;
    }

    public Integer getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(Integer idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public String getXetNghiem() {
        return xetNghiem;
    }

    public void setXetNghiem(String xetNghiem) {
        this.xetNghiem = xetNghiem;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHoSo != null ? idHoSo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HoSo)) {
            return false;
        }
        HoSo other = (HoSo) object;
        if ((this.idHoSo == null && other.idHoSo != null) || (this.idHoSo != null && !this.idHoSo.equals(other.idHoSo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thainguyen.model.HoSo[ idHoSo=" + idHoSo + " ]";
    }
    
}
