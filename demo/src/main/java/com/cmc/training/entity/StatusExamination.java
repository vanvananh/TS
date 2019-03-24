/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmc.training.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author User
 */
@Entity
@Table(name = "status_examination", uniqueConstraints = @UniqueConstraint(columnNames = "status_name"))
public class StatusExamination implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "status_id", unique = true, nullable = false)
  private Integer statusId;

  @Basic(optional = false)
  @Column(name = "status_name", unique = true, nullable = false, length = 50)
  private String statusName;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
  @JsonIgnore
  private Collection<Examination> examinationCollection;

  @Basic(optional = false)
  @Column(name = "status_name_search", unique = true, nullable = false, length = 101)
  private String statusNameSearch;

  public StatusExamination() {
  }

  public StatusExamination(Integer statusId) {
    this.statusId = statusId;
  }

  /**
   * @return the statusNameSearch
   */
  public String getStatusNameSearch() {
    return statusNameSearch;
  }

  /**
   * @param statusNameSearch
   *          the statusNameSearch to set
   */
  public void setStatusNameSearch(String statusNameSearch) {
    this.statusNameSearch = statusNameSearch;
  }

  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public Collection<Examination> getExaminationCollection() {
    return examinationCollection;
  }

  public void setExaminationCollection(Collection<Examination> examinationCollection) {
    this.examinationCollection = examinationCollection;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (statusId != null ? statusId.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof StatusExamination)) {
      return false;
    }
    StatusExamination other = (StatusExamination) object;
    if ((this.statusId == null && other.statusId != null)
        || (this.statusId != null && !this.statusId.equals(other.statusId))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "entity.StatusExamination[ statusId=" + statusId + " ]";
  }

}
