package br.com.diogo.pagination.infrasctructure.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.diogo.pagination.infrasctructure.entities.User;

@Repository
public interface UserRepositoryJpa extends JpaRepository<User, Long> {
	
//	Page<User> findAll(Pageable pageable);
}
