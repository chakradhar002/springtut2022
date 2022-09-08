package com.demo.productdao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.entity.Product;

/**
 * @author Chakradhar alt+shift+j for generating java docs
 *
 */

/*
 * Data Access Object Pattern or DAO pattern is used to separate low level data
 * accessing API or operations from high level business services. Following are
 * the participants in Data Access Object Pattern.
 * 
 * Data Access Object Interface - This interface defines the standard operations
 * to be performed on a model object(s).
 * 
 * Data Access Object concrete class - This class implements above interface.
 * This class is responsible to get data from a data source which can be
 * database / xml or any other storage mechanism.
 * 
 * Model Object or Value Object - This object is simple POJO containing get/set
 * methods to store data retrieved using DAO class.
 */

public class ProductDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/// save or insert logic
	public int saveProduct(Product p) {

		String sqlquery = "insert into product values('" + p.getId() + "','" + p.getName() + "','" + p.getColor() + "')";
		

		return jdbcTemplate.update(sqlquery);

	}

}
