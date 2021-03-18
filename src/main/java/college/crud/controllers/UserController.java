package college.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import college.crud.models.User;
import college.crud.repositories.UsersRepository;

@RestController
@RequestMapping("api/java")
public class UserController {
	@Autowired
	private UsersRepository usersRepository;

	@GetMapping("users")
	public List<User> getAllUsers() {
		return this.usersRepository.findAll();
	}
}
