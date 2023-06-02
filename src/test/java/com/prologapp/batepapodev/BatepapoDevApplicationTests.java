package com.prologapp.batepapodev;

import com.prologapp.batepapodev.domain.model.User;
import com.prologapp.batepapodev.domain.repository.UserDao;
import com.prologapp.batepapodev.domain.repository.specs.UserSpecs;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class BatepapoDevApplicationTests {

	@PersistenceContext
	private EntityManager manager;

	@Autowired
	private UserDao userDao;

	@Test
	void criteriaJpqlTest() {

//		final var builder = manager.getCriteriaBuilder();
//		final var query = builder.createQuery(User.class);
//		final var root = query.from(User.class);

//		query.where(builder.equal(root.get("id"), 1));

//		final TypedQuery<User> typedQuery = manager.createQuery(query);

		String jpql = "from User u where u.id = 1";

		final TypedQuery<User> typedQuery = manager.createQuery(jpql, User.class);

		Assertions.assertEquals("João Silva", typedQuery.getSingleResult().getName());
	}

	@Test
	void specificationTest() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
		OffsetDateTime startDate = OffsetDateTime.parse("2023-03-18T00:00:00Z", formatter);
		OffsetDateTime endDate = OffsetDateTime.parse("2023-05-15T23:59:59Z", formatter);

		final Specification<User> userSpecification =
				UserSpecs.filterByDate(startDate, endDate);

		final List<User> users = userDao.findAll(userSpecification);

		Assertions.assertEquals(users.size(), 8);
	}

	@Test
	void specificationByIdTest(){
		final Specification<User> userSpecification = UserSpecs.filterById(1L);
		final List<User> users = userDao.findAll(userSpecification);

		Assertions.assertEquals("Produto", users.get(0).getTeam().getName());
	}
}
