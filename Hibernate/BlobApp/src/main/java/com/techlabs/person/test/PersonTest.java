package com.techlabs.person.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.UUID;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.BlobType;

import com.techlabs.entity.Person;

public class PersonTest {

	public static void main(String[] args) throws SerialException, SQLException, IOException {

		File file = new File("C:\\Users\\choti\\Desktop\\sejal vijay naik-photo.jpg");
		byte[] bFile = new byte[(int) file.length()];

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Person person = new Person(new SerialBlob(bFile), "sejal");
		Person person2 = new Person();

		Configuration configConfiguration = new Configuration();
		SessionFactory sessionFactory = configConfiguration.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		/*
		 * Transaction transaction = null;
		 * 
		 * try {
		 * 
		 * transaction = session.beginTransaction(); // session.save(person);
		 * 
		 * transaction.commit();
		 * 
		 * } catch (HibernateException e) { transaction.rollback(); } finally {
		 * session.close(); }
		 */

		person2 = (Person) session.get(Person.class, UUID.fromString("10879cb9-4b4a-4cab-ae89-acb8e7065553"));
		session.close();
		System.out.println(person2);

		Blob image = person2.getImage();
		byte[] imageBytes = image.getBytes(1l, (int) image.length());

		FileOutputStream fos = new FileOutputStream("myInage.jpg");
		fos.write(imageBytes);
		fos.close();

	}

}
