package com.FoodorderingSystem.Controller;

import java.util.List;

import com.FoodorderingSystem.Entity.*;
import com.FoodorderingSystem.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.FoodorderingSystem.Service.MyService;


@RestController
@CrossOrigin(origins = "*")
 
public class MyController {

	@Autowired
	MyService myservice;
	
	
	
@GetMapping("/")
public String Home() {
	return "home";
}
@PostMapping("/createCustomer")
 public Customer createCustomer(@RequestBody Customer customer) {
	 return myservice.newCustomer(customer);
 }
@GetMapping("/getAllCustomer")
public List<Customer> allCustomer() {
	return myservice.allCustomer();
}
@GetMapping("/getItem")
public List<Item>allItem(){
	return myservice.allItem();
} 

@PostMapping("/createItem")
public Item item(@RequestBody Item i) {
	return myservice.newItem(i);
}
@GetMapping("/getCategory")
public List<Category>allCategory(){
	return myservice.allCategory();
}
@PostMapping("/createCategory")
public Category createCategory(@RequestBody Category category) {
	return myservice.newCategory(category);
}
@GetMapping("/getVeg")
public List<Item> getVeg(){
	return myservice.getVeg();
}
@GetMapping("/getNonVeg")
public List<Item> findNonVeg(){
	return myservice.getNonVeg();
}
@GetMapping("/getSouthIndian")
public List<Item> findSouthIndian(){
	return myservice.getSouthIndian();
}
@GetMapping("/name/{itemName}")
public Item findName(@PathVariable String itemName) {
	return myservice.getItemName(itemName);
}

@PostMapping("/createBill")
public Cart billEntry(@RequestBody Cart cart) {
	return myservice.billEntry(cart);
}

@GetMapping("/getAllBill")
public List<Cart> allBill(){
	return myservice.allBill();
}


	@PostMapping("/registration")
	public UserRepo.NewUser Apply(@RequestBody UserRepo.NewUser reg) {
		return myservice.saveRegistration(reg);

	}

	@PostMapping("/login")
	public List<UserRepo.NewUser> logins(@RequestParam String username, String password) {
		return myservice.getUsers(username,password);

	}
	@GetMapping("/users")
	public List<UserRepo.NewUser> GetAllUsers() {
		return myservice.FindAllUsers();
	}
}
