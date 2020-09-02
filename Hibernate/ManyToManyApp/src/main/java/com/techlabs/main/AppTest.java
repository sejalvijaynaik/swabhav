package com.techlabs.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Actor;
import com.techlabs.entity.Movie;

public class AppTest {

	public static void main(String[] args) {

		// Setting individual objects-------------------------------------------

		Actor srk = new Actor();
		srk.setId(1);
		srk.setActorName("SRK");

		Actor hrithik = new Actor();
		hrithik.setId(2);
		hrithik.setActorName("Hrithik");

		Actor katrina = new Actor();
		katrina.setId(3);
		katrina.setActorName("Katrina");

		Movie k3g = new Movie();
		k3g.setId(1);
		k3g.setMovieName("K3G");

		Movie znmd = new Movie();
		znmd.setId(2);
		znmd.setMovieName("ZNMD");

		Movie abcd = new Movie();
		abcd.setId(3);
		abcd.setMovieName("ABCD");

		// Creating lists of all objects-------------------------------------------

		Set<Movie> srkMovies = new HashSet<Movie>();
		srkMovies.add(k3g);
		srkMovies.add(abcd);
		srk.setMovies(srkMovies);

		Set<Movie> hrithikMovies = new HashSet<Movie>();
		hrithikMovies.add(k3g);
		hrithikMovies.add(znmd);
		hrithikMovies.add(abcd);
		hrithik.setMovies(hrithikMovies);

		Set<Movie> katrinaMovies = new HashSet<Movie>();
		katrinaMovies.add(znmd);
		katrinaMovies.add(abcd);
		katrina.setMovies(katrinaMovies);

		Set<Actor> k3gActors = new HashSet<Actor>();
		k3gActors.add(srk);
		k3gActors.add(hrithik);
		k3g.setActors(k3gActors);

		Set<Actor> znmdActors = new HashSet<Actor>();
		znmdActors.add(hrithik);
		znmdActors.add(katrina);
		znmd.setActors(znmdActors);

		Set<Actor> abcdActors = new HashSet<Actor>();
		abcdActors.add(srk);
		abcdActors.add(hrithik);
		abcdActors.add(katrina);
		abcd.setActors(abcdActors);

		Configuration configConfiguration = new Configuration();
		SessionFactory sessionFactory = configConfiguration.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			session.save(k3g);
			session.save(znmd);
			session.save(abcd);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public static void printMovies(Session session) {

		Criteria criteria = session.createCriteria(Movie.class);
		List<Movie> movies = criteria.list();

		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
}
