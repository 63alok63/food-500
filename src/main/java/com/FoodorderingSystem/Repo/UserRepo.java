package com.FoodorderingSystem.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;


@Repository
public interface UserRepo extends JpaRepository<UserRepo.NewUser, String>  {

	List<NewUser> findByUsernameAndPassword(String username, String password);


	@Entity
	class NewUser {

		@Id
		private String username;
		private String email;
		private String password;
		public NewUser() {
			}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public NewUser(String username, String email, String password) {
			super();
			this.username = username;
			this.email = email;
			this.password = password;
		}
		@Override
		public String toString() {
			return "NewUser [username=" + username + ", email=" + email + ", password=" + password + "]";
		}

	}
}
