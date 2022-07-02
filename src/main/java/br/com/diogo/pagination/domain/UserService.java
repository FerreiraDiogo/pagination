package br.com.diogo.pagination.domain;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.diogo.pagination.infrasctructure.entities.User;
import br.com.diogo.pagination.infrasctructure.repositories.UserRepositoryJpa;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepositoryJpa userRepository;
	
	public Page<User> findAllUsersPaged(Pageable pageable){
		
		return  userRepository.findAll(pageable);
		
	}
}
