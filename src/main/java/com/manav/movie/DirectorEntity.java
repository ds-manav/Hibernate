package com.manav.movie;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 @Entity
 @Table(name = "DirectorEntity")
public class DirectorEntity {
	 @Id
	 private int directorId;
	 @Column
	 private String directorname;
	 @Column
	 private Date directorborn;
	 public void setdirectorId(int id) {
		 this.directorId = id;
	 }
	 public void setdirectorname(String name) {
		 this.directorname = name;
	 }
	 public void setdirectorborn(Date date) {
		 this.directorborn = date;
	 }
	 public int getdirectorId() {
		 return directorId;
	 }
	 public String getdirectorname() {
		  return this.directorname;
	 }
	 public Date getdirectorborn() {
		 return this.directorborn;
	 }
	
}
