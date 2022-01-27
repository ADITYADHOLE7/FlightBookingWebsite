package com.aditya.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DataRepository extends JpaRepository<Data,Long> {
		Data findByFlightnameAndPrice(String flightname,String price);
	}
	


