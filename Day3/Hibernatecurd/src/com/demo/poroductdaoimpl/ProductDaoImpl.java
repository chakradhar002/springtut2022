package com.demo.poroductdaoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Product;
import com.demo.poroductdao.ProductDao;
import com.demo.util.HibernateUtil;

public class ProductDaoImpl implements ProductDao {

	static Session session =null;
	static  Transaction transcation =null;
    SessionFactory sessionfatory = null;
		

	public  Product addProductDetails(Product product) {
		System.out.println(product.getColor());
		session=HibernateUtil.getSessionFactory().openSession();
		transcation =session.beginTransaction();
		session.save(product);//this line will form a insert query
		transcation.commit();
		session.close();
		return product;
	}
	


}
