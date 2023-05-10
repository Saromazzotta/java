package com.sarom.burgertracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sarom.burgertracker.models.Burger;

@Repository 
public interface BurgerRepository extends CrudRepository<Burger, Long> {
	List<Burger> findAll();
}
