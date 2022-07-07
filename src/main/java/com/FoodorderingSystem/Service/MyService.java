package com.FoodorderingSystem.Service;


import java.util.List;

import com.FoodorderingSystem.Entity.*;
import com.FoodorderingSystem.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {

	
	@Autowired
    public CartRepo cartRepo;
	
	@Autowired
    public ItemRepo itemRepo;	
	
	@Autowired
	public CustomerRepo customerRepo;

	@Autowired
	public CategoryRepo cateRepo;

	@Autowired
	public UserRepo userRepo;
	
	
	public Customer newCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}
	
	public List<Customer> allCustomer(){
		return customerRepo.findAll();
	}

	
	public Item newItem(Item item) {
		return itemRepo.save(item);
		
	}
	public List<Item> allItem() {
		return itemRepo.findAll(); 
	}
	
	public Category newCategory(Category category) {
		return cateRepo.save(category);
		}

	public List<Category> allCategory() {
		return cateRepo.findAll();
	}
   
	public List<Item> getVeg() {
		return itemRepo.findByveg();
	}
	public List<Item> getNonVeg() {
		return itemRepo.findBynonveg();
	}
	public List<Item> getSouthIndian() {
		return itemRepo.findBysouthindian();
	}
	
	public Item getItemName(String itemName) {
		return itemRepo.findByIname(itemName);
	}

	public Cart billEntry(Cart cart) {
		
		return cartRepo.save(cart);
	}
	
	public List<Cart> allBill(){
		return cartRepo.findAll();
	}

	public UserRepo.NewUser saveRegistration(UserRepo.NewUser reg) {
		// TODO Auto-generated method stub
		return userRepo.save(reg);

	}
	/*
	 * public void login(Login login) { // TODO Auto-generated method stub
	 * loginRepo.findAll(); }
	 */

	public List<UserRepo.NewUser> getUsers(String username, String password) {
		try {
			userRepo.findByUsernameAndPassword(username,password);
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();

		}
		return userRepo.findAll();


	}

	public List<UserRepo.NewUser> FindAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	 
	
	
    
}

