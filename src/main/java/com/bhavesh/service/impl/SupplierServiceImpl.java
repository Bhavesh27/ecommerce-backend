package com.bhavesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhavesh.dao.SupplierDao;
import com.bhavesh.model.Supplier;
import com.bhavesh.service.SupplierService;

@Service (value="supplierService")
@Transactional
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	SupplierDao supplierDao;

	
	public void addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierDao.addSupplier(supplier);
	}

	public void updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierDao.updateSupplier(supplier);
	}

	public void deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierDao.deleteSupplier(supplier);
	}

	
	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return supplierDao.getAllSuppliers();
	}

	
	public Supplier getSupplierById(int supplier_id) {
		// TODO Auto-generated method stub
		return supplierDao.getSupplierById(supplier_id);
	}
}
