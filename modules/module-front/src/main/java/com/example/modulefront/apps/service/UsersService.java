package com.example.modulefront.apps.service;

import com.example.core.app.domain.Parent;
import com.example.core.app.domain.ParentRepository;
import com.example.core.app.domain.Users;
import com.example.core.app.domain.UsersRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UsersService {

	private final UsersRepository usersRepository;
	private final ParentRepository parentRepository;


	public void test() {
		List<Users> userList = new ArrayList<>();
		List<Parent> parentList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Parent parent = new Parent();
			parent.setAge(i);
			parent.setName("부모" + i);
			parentList.add(parent);

			Users user = new Users();
			user.setAge(i);
			user.setName("이름" + i);
			user.setParent(parent);
			userList.add(user);
		}

		parentRepository.saveAll(parentList);
		usersRepository.saveAll(userList);
	}

	public void test2() {
		List<Users> users = usersRepository.findAllByParentName("부모1");
	}
}
