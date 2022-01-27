package com.aditya.spring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
	@Repository
	public interface FlightRepository extends JpaRepository<Login,Long>
	{
		Login findByUsernameAndPassword(String username,String password);

	}


