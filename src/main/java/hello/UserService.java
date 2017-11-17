package hello;

import hello.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
