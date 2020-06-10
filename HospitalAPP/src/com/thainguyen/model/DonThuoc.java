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
@Table(name = "don_thuoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DonThuoc.findAll", query = "SELECT d FROM DonThuoc d"),
    @NamedQuery(name = "DonThuoc.findByIdHoSo", query = "SELECT d FROM DonThuoc d WHERE d.idHoSo = :idHoSo"),
    @NamedQuery(name = "DonThuoc.findByTenThuoc1", query = "SELECT d FROM DonThuoc d WHERE d.tenThuoc1 = :tenThuoc1"),
    @NamedQuery(name = "DonThuoc.findBySoLuong1", query = "SELECT d FROM DonThuoc d WHERE d.soLuong1 = :soLuong1"),
    @NamedQuery(name = "DonThuoc.findByTenThuoc2", query = "SELECT d FROM DonThuoc d WHERE d.tenThuoc2 = :tenThuoc2"),
    @NamedQuery(name = "DonThuoc.findBySoLuong2", query = "SELECT d FROM DonThuoc d WHERE d.soLuong2 = :soLuong2"),
    @NamedQuery(name = "DonThuoc.findByTenThuoc3", query = "SELECT d FROM DonThuoc d WHERE d.tenThuoc3 = :tenThuoc3"),
    @NamedQuery(name = "DonThuoc.findBySoLuong3", query = "SELECT d FROM DonThuoc d WHERE d.soLuong3 = :soLuong3"),
    @NamedQuery(name = "DonThuoc.findByTenThuoc4", query = "SELECT d FROM DonThuoc d WHERE d.tenThuoc4 = :tenThuoc4"),
    @NamedQuery(name = "DonThuoc.findBySoLuong4", query = "SELECT d FROM DonThuoc d WHERE d.soLuong4 = :soLuong4"),
    @NamedQuery(name = "DonThuoc.findByTenThuoc5", query = "SELECT d FROM DonThuoc d WHERE d.tenThuoc5 = :tenThuoc5"),
    @NamedQuery(name = "DonThuoc.findBySoLuong5", query = "SELECT d FROM DonThuoc d WHERE d.soLuong5 = :soLuong5"),
    @NamedQuery(name = "DonThuoc.findByTrangThai", query = "SELECT d FROM DonThuoc d WHERE d.trangThai = :trangThai")})
public class DonThuoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_HO_SO")
    private Integer idHoSo;
    @Column(name = "TEN_THUOC_1")
    private String tenThuoc1;
    @Column(name = "SO_LUONG_1")
    private Integer soLuong1;
    @Column(name = "TEN_THUOC_2")
    private String tenThuoc2;
    @Column(name = "SO_LUONG_2")
    private Integer soLuong2;
    @Column(name = "TEN_THUOC_3")
    private String tenThuoc3;
    @Column(name = "SO_LUONG_3")
    private Integer soLuong3;
    @Column(name = "TEN_THUOC_4")
    private String tenThuoc4;
    @Column(name = "SO_LUONG_4")
    private Integer soLuong4;
    @Column(name = "TEN_THUOC_5")
    private String tenThuoc5;
    @Column(name = "SO_LUONG-5")
    private Integer soLuong5;
    @Column(name = "trang_thai")
    private Integer trangThai;

    public DonThuoc() {
    }

    public DonThuoc(Integer idHoSo) {
        this.idHoSo = idHoSo;
    }

    public Integer getIdHoSo() {
        return idHoSo;
    }

    public void setIdHoSo(Integer idHoSo) {
        this.idHoSo = idHoSo;
    }

    public String getTenThuoc1() {
        return tenThuoc1;
    }

    public void setTenThuoc1(String tenThuoc1) {
        this.tenThuoc1 = tenThuoc1;
    }

    public Integer getSoLuong1() {
        return soLuong1;
    }

    public void setSoLuong1(Integer soLuong1) {
        this.soLuong1 = soLuong1;
    }

    public String getTenThuoc2() {
        return tenThuoc2;
    }

    public void setTenThuoc2(String tenThuoc2) {
        this.tenThuoc2 = tenThuoc2;
    }

    public Integer getSoLuong2() {
        return soLuong2;
    }

    public void setSoLuong2(Integer soLuong2) {
        this.soLuong2 = soLuong2;
    }

    public String getTenThuoc3() {
        return tenThuoc3;
    }

    public void setTenThuoc3(String tenThuoc3) {
        this.tenThuoc3 = tenThuoc3;
    }

    public Integer getSoLuong3() {
        return soLuong3;
    }

    public void setSoLuong3(Integer soLuong3) {
        this.soLuong3 = soLuong3;
    }

    public String getTenThuoc4() {
        return tenThuoc4;
    }

    public void setTenThuoc4(String tenThuoc4) {
        this.tenThuoc4 = tenThuoc4;
    }

    public Integer getSoLuong4() {
        return soLuong4;
    }

    public void setSoLuong4(Integer soLuong4) {
        this.soLuong4 = soLuong4;
    }

    public String getTenThuoc5() {
        return tenThuoc5;
    }

    public void setTenThuoc5(String tenThuoc5) {
        this.tenThuoc5 = tenThuoc5;
    }

    public Integer getSoLuong5() {
        return soLuong5;
    }

    public void setSoLuong5(Integer soLuong5) {
        this.soLuong5 = soLuong5;
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
        if (!(object instanceof DonThuoc)) {
            return false;
        }
        DonThuoc other = (DonThuoc) object;
        if ((this.idHoSo == null && other.idHoSo != null) || (this.idHoSo != null && !this.idHoSo.equals(other.idHoSo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thainguyen.model.DonThuoc[ idHoSo=" + idHoSo + " ]";
    }
    
}
