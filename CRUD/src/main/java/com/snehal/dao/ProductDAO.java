package com.snehal.dao;

import com.snehal.entity.Product;
import com.snehal.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO {

    public void save(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(product);

        tx.commit();
        session.close();
    }

    public List<Product> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product> list = session.createQuery("from Product", Product.class).list();
        session.close();
        return list;
    }
}
