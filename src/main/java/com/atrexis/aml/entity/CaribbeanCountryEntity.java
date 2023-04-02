package com.atrexis.aml.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "CaribbeanCountryList", schema = "riskpassaml")
public class CaribbeanCountryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "isoCode")
    private String isoCode;
    @Basic
    @Column(name = "countryName")
    private String countryName;
    @Basic
    @Column(name = "ftpDirectory")
    private String ftpDirectory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFtpDirectory() {
        return ftpDirectory;
    }

    public void setFtpDirectory(String ftpDirectory) {
        this.ftpDirectory = ftpDirectory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaribbeanCountryEntity that = (CaribbeanCountryEntity) o;
        return id == that.id && Objects.equals(isoCode, that.isoCode) && Objects.equals(countryName, that.countryName) && Objects.equals(ftpDirectory, that.ftpDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isoCode, countryName, ftpDirectory);
    }
}
