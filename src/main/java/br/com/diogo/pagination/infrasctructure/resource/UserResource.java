package br.com.diogo.pagination.infrasctructure.resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.diogo.pagination.domain.UserService;
import br.com.diogo.pagination.infrasctructure.entities.User;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor
public class UserResource {
		
	private final UserService service;
	
	@GetMapping(path = "/jpa")
	public ResponseEntity<Page<User>> findUsersPagedOnJpa(@PageableDefault(size = 2) Pageable pageable){
		
		var users = service.findAllUsersPaged(pageable);
		
		if(users.getContent().isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		
		return ResponseEntity.ok(users);
	}
}
