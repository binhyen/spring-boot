package com.springboot.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AbsTractDTO<E> {
	
	private Long id;

	private Date createdDate;

	private Date modifiedDate;

	private String createdBy;

	private String modifiedBy;
	
	private List<E> listResult = new ArrayList<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public List<E> getListResult() {
		return listResult;
	}

	public void setListResult(List<E> listResult) {
		this.listResult = listResult;
	}
}
