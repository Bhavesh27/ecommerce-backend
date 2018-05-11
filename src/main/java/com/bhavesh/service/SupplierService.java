package com.bhavesh.service;

import java.util.List;

import com.bhavesh.model.Supplier;

public interface SupplierService {

	public void addSupplier(Supplier supplier);
	public void updateSupplier(Supplier supplier);
	public void deleteSupplier(Supplier supplier);
	public List<Supplier> getAllSuppliers();
	public Supplier getSupplierById(int supplier_id);
	
}
