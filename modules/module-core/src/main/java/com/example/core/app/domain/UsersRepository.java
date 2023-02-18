package com.example.core.app.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Long> {

	@Query("SELECT U "
		+ "FROM Users U "
		+ "WHERE U.parent.name = :s ")
	List<Users> findAllByParentName(String s);
}
