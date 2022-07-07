package com.FoodorderingSystem.Service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.FoodorderingSystem.Entity.Cart;
import com.FoodorderingSystem.Entity.Category;
import com.FoodorderingSystem.Entity.Customer;
import com.FoodorderingSystem.Entity.Item;
import com.FoodorderingSystem.Repo.CartRepo;
import com.FoodorderingSystem.Repo.CategoryRepo;
import com.FoodorderingSystem.Repo.CustomerRepo;
import com.FoodorderingSystem.Repo.ItemRepo;
import com.FoodorderingSystem.Repo.UserRepo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MyService.class})
@ExtendWith(SpringExtension.class)
class MyServiceTest {
    @MockBean
    private CartRepo cartRepo;

    @MockBean
    private CategoryRepo categoryRepo;

    @MockBean
    private CustomerRepo customerRepo;

    @MockBean
    private ItemRepo itemRepo;

    @Autowired
    private MyService myService;

    @MockBean
    private UserRepo userRepo;

    /**
     * Method under test: {@link MyService#newCustomer(Customer)}
     */
    @Test
    void testNewCustomer() {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");
        when(customerRepo.save((Customer) any())).thenReturn(customer);

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setMobile(1L);
        customer1.setName("Name");
        assertSame(customer, myService.newCustomer(customer1));
        verify(customerRepo).save((Customer) any());
    }

    /**
     * Method under test: {@link MyService#newCustomer(Customer)}
     */
    @Test
    void testNewCustomer2() {
        when(customerRepo.save((Customer) any())).thenThrow(new IllegalArgumentException("foo"));

        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");
        assertThrows(IllegalArgumentException.class, () -> myService.newCustomer(customer));
        verify(customerRepo).save((Customer) any());
    }

    /**
     * Method under test: {@link MyService#newCustomer(Customer)}
     */
    @Test
    void testNewCustomer3() {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");
        when(customerRepo.save((Customer) any())).thenReturn(customer);

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setMobile(1L);
        customer1.setName("Name");
        assertSame(customer, myService.newCustomer(customer1));
        verify(customerRepo).save((Customer) any());
    }

    /**
     * Method under test: {@link MyService#newCustomer(Customer)}
     */
    @Test
    void testNewCustomer4() {
        when(customerRepo.save((Customer) any())).thenThrow(new IllegalArgumentException("foo"));

        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");
        assertThrows(IllegalArgumentException.class, () -> myService.newCustomer(customer));
        verify(customerRepo).save((Customer) any());
    }

    /**
     * Method under test: {@link MyService#allCustomer()}
     */
    @Test
    void testAllCustomer() {
        ArrayList<Customer> customerList = new ArrayList<>();
        when(customerRepo.findAll()).thenReturn(customerList);
        List<Customer> actualAllCustomerResult = myService.allCustomer();
        assertSame(customerList, actualAllCustomerResult);
        assertTrue(actualAllCustomerResult.isEmpty());
        verify(customerRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allCustomer()}
     */
    @Test
    void testAllCustomer2() {
        when(customerRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allCustomer());
        verify(customerRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allCustomer()}
     */
    @Test
    void testAllCustomer3() {
        ArrayList<Customer> customerList = new ArrayList<>();
        when(customerRepo.findAll()).thenReturn(customerList);
        List<Customer> actualAllCustomerResult = myService.allCustomer();
        assertSame(customerList, actualAllCustomerResult);
        assertTrue(actualAllCustomerResult.isEmpty());
        verify(customerRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allCustomer()}
     */
    @Test
    void testAllCustomer4() {
        when(customerRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allCustomer());
        verify(customerRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#newItem(Item)}
     */
    @Test
    void testNewItem() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(itemRepo.save((Item) any())).thenReturn(item);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");

        Item item1 = new Item();
        item1.setCategory(category1);
        item1.setIid(1);
        item1.setImage("Image");
        item1.setIname("Iname");
        item1.setIprice("Iprice");
        assertSame(item, myService.newItem(item1));
        verify(itemRepo).save((Item) any());
    }

    /**
     * Method under test: {@link MyService#newItem(Item)}
     */
    @Test
    void testNewItem2() {
        when(itemRepo.save((Item) any())).thenThrow(new IllegalArgumentException("foo"));

        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        assertThrows(IllegalArgumentException.class, () -> myService.newItem(item));
        verify(itemRepo).save((Item) any());
    }

    /**
     * Method under test: {@link MyService#newItem(Item)}
     */
    @Test
    void testNewItem3() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(itemRepo.save((Item) any())).thenReturn(item);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");

        Item item1 = new Item();
        item1.setCategory(category1);
        item1.setIid(1);
        item1.setImage("Image");
        item1.setIname("Iname");
        item1.setIprice("Iprice");
        assertSame(item, myService.newItem(item1));
        verify(itemRepo).save((Item) any());
    }

    /**
     * Method under test: {@link MyService#newItem(Item)}
     */
    @Test
    void testNewItem4() {
        when(itemRepo.save((Item) any())).thenThrow(new IllegalArgumentException("foo"));

        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        assertThrows(IllegalArgumentException.class, () -> myService.newItem(item));
        verify(itemRepo).save((Item) any());
    }

    /**
     * Method under test: {@link MyService#allItem()}
     */
    @Test
    void testAllItem() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findAll()).thenReturn(itemList);
        List<Item> actualAllItemResult = myService.allItem();
        assertSame(itemList, actualAllItemResult);
        assertTrue(actualAllItemResult.isEmpty());
        verify(itemRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allItem()}
     */
    @Test
    void testAllItem2() {
        when(itemRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allItem());
        verify(itemRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allItem()}
     */
    @Test
    void testAllItem3() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findAll()).thenReturn(itemList);
        List<Item> actualAllItemResult = myService.allItem();
        assertSame(itemList, actualAllItemResult);
        assertTrue(actualAllItemResult.isEmpty());
        verify(itemRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allItem()}
     */
    @Test
    void testAllItem4() {
        when(itemRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allItem());
        verify(itemRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#newCategory(Category)}
     */
    @Test
    void testNewCategory() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");
        when(categoryRepo.save((Category) any())).thenReturn(category);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");
        assertSame(category, myService.newCategory(category1));
        verify(categoryRepo).save((Category) any());
    }

    /**
     * Method under test: {@link MyService#newCategory(Category)}
     */
    @Test
    void testNewCategory2() {
        when(categoryRepo.save((Category) any())).thenThrow(new IllegalArgumentException("foo"));

        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");
        assertThrows(IllegalArgumentException.class, () -> myService.newCategory(category));
        verify(categoryRepo).save((Category) any());
    }

    /**
     * Method under test: {@link MyService#newCategory(Category)}
     */
    @Test
    void testNewCategory3() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");
        when(categoryRepo.save((Category) any())).thenReturn(category);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");
        assertSame(category, myService.newCategory(category1));
        verify(categoryRepo).save((Category) any());
    }

    /**
     * Method under test: {@link MyService#newCategory(Category)}
     */
    @Test
    void testNewCategory4() {
        when(categoryRepo.save((Category) any())).thenThrow(new IllegalArgumentException("foo"));

        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");
        assertThrows(IllegalArgumentException.class, () -> myService.newCategory(category));
        verify(categoryRepo).save((Category) any());
    }

    /**
     * Method under test: {@link MyService#allCategory()}
     */
    @Test
    void testAllCategory() {
        ArrayList<Category> categoryList = new ArrayList<>();
        when(categoryRepo.findAll()).thenReturn(categoryList);
        List<Category> actualAllCategoryResult = myService.allCategory();
        assertSame(categoryList, actualAllCategoryResult);
        assertTrue(actualAllCategoryResult.isEmpty());
        verify(categoryRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allCategory()}
     */
    @Test
    void testAllCategory2() {
        when(categoryRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allCategory());
        verify(categoryRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allCategory()}
     */
    @Test
    void testAllCategory3() {
        ArrayList<Category> categoryList = new ArrayList<>();
        when(categoryRepo.findAll()).thenReturn(categoryList);
        List<Category> actualAllCategoryResult = myService.allCategory();
        assertSame(categoryList, actualAllCategoryResult);
        assertTrue(actualAllCategoryResult.isEmpty());
        verify(categoryRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allCategory()}
     */
    @Test
    void testAllCategory4() {
        when(categoryRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allCategory());
        verify(categoryRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#getVeg()}
     */
    @Test
    void testGetVeg() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findByveg()).thenReturn(itemList);
        List<Item> actualVeg = myService.getVeg();
        assertSame(itemList, actualVeg);
        assertTrue(actualVeg.isEmpty());
        verify(itemRepo).findByveg();
    }

    /**
     * Method under test: {@link MyService#getVeg()}
     */
    @Test
    void testGetVeg2() {
        when(itemRepo.findByveg()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getVeg());
        verify(itemRepo).findByveg();
    }

    /**
     * Method under test: {@link MyService#getVeg()}
     */
    @Test
    void testGetVeg3() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findByveg()).thenReturn(itemList);
        List<Item> actualVeg = myService.getVeg();
        assertSame(itemList, actualVeg);
        assertTrue(actualVeg.isEmpty());
        verify(itemRepo).findByveg();
    }

    /**
     * Method under test: {@link MyService#getVeg()}
     */
    @Test
    void testGetVeg4() {
        when(itemRepo.findByveg()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getVeg());
        verify(itemRepo).findByveg();
    }

    /**
     * Method under test: {@link MyService#getNonVeg()}
     */
    @Test
    void testGetNonVeg() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findBynonveg()).thenReturn(itemList);
        List<Item> actualNonVeg = myService.getNonVeg();
        assertSame(itemList, actualNonVeg);
        assertTrue(actualNonVeg.isEmpty());
        verify(itemRepo).findBynonveg();
    }

    /**
     * Method under test: {@link MyService#getNonVeg()}
     */
    @Test
    void testGetNonVeg2() {
        when(itemRepo.findBynonveg()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getNonVeg());
        verify(itemRepo).findBynonveg();
    }

    /**
     * Method under test: {@link MyService#getNonVeg()}
     */
    @Test
    void testGetNonVeg3() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findBynonveg()).thenReturn(itemList);
        List<Item> actualNonVeg = myService.getNonVeg();
        assertSame(itemList, actualNonVeg);
        assertTrue(actualNonVeg.isEmpty());
        verify(itemRepo).findBynonveg();
    }

    /**
     * Method under test: {@link MyService#getNonVeg()}
     */
    @Test
    void testGetNonVeg4() {
        when(itemRepo.findBynonveg()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getNonVeg());
        verify(itemRepo).findBynonveg();
    }

    /**
     * Method under test: {@link MyService#getSouthIndian()}
     */
    @Test
    void testGetSouthIndian() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findBysouthindian()).thenReturn(itemList);
        List<Item> actualSouthIndian = myService.getSouthIndian();
        assertSame(itemList, actualSouthIndian);
        assertTrue(actualSouthIndian.isEmpty());
        verify(itemRepo).findBysouthindian();
    }

    /**
     * Method under test: {@link MyService#getSouthIndian()}
     */
    @Test
    void testGetSouthIndian2() {
        when(itemRepo.findBysouthindian()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getSouthIndian());
        verify(itemRepo).findBysouthindian();
    }

    /**
     * Method under test: {@link MyService#getSouthIndian()}
     */
    @Test
    void testGetSouthIndian3() {
        ArrayList<Item> itemList = new ArrayList<>();
        when(itemRepo.findBysouthindian()).thenReturn(itemList);
        List<Item> actualSouthIndian = myService.getSouthIndian();
        assertSame(itemList, actualSouthIndian);
        assertTrue(actualSouthIndian.isEmpty());
        verify(itemRepo).findBysouthindian();
    }

    /**
     * Method under test: {@link MyService#getSouthIndian()}
     */
    @Test
    void testGetSouthIndian4() {
        when(itemRepo.findBysouthindian()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getSouthIndian());
        verify(itemRepo).findBysouthindian();
    }

    /**
     * Method under test: {@link MyService#getItemName(String)}
     */
    @Test
    void testGetItemName() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(itemRepo.findByIname((String) any())).thenReturn(item);
        assertSame(item, myService.getItemName("Item Name"));
        verify(itemRepo).findByIname((String) any());
    }

    /**
     * Method under test: {@link MyService#getItemName(String)}
     */
    @Test
    void testGetItemName2() {
        when(itemRepo.findByIname((String) any())).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getItemName("Item Name"));
        verify(itemRepo).findByIname((String) any());
    }

    /**
     * Method under test: {@link MyService#getItemName(String)}
     */
    @Test
    void testGetItemName3() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(itemRepo.findByIname((String) any())).thenReturn(item);
        assertSame(item, myService.getItemName("Item Name"));
        verify(itemRepo).findByIname((String) any());
    }

    /**
     * Method under test: {@link MyService#getItemName(String)}
     */
    @Test
    void testGetItemName4() {
        when(itemRepo.findByIname((String) any())).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getItemName("Item Name"));
        verify(itemRepo).findByIname((String) any());
    }

    /**
     * Method under test: {@link MyService#billEntry(Cart)}
     */
    @Test
    void testBillEntry() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");

        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");

        Cart cart = new Cart();
        cart.setBill(1);
        cart.setBillid(1);
        cart.setImage("Image");
        cart.setItem(item);
        cart.setcustomer(customer);
        when(cartRepo.save((Cart) any())).thenReturn(cart);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");

        Item item1 = new Item();
        item1.setCategory(category1);
        item1.setIid(1);
        item1.setImage("Image");
        item1.setIname("Iname");
        item1.setIprice("Iprice");

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setMobile(1L);
        customer1.setName("Name");

        Cart cart1 = new Cart();
        cart1.setBill(1);
        cart1.setBillid(1);
        cart1.setImage("Image");
        cart1.setItem(item1);
        cart1.setcustomer(customer1);
        assertSame(cart, myService.billEntry(cart1));
        verify(cartRepo).save((Cart) any());
    }

    /**
     * Method under test: {@link MyService#billEntry(Cart)}
     */
    @Test
    void testBillEntry2() {
        when(cartRepo.save((Cart) any())).thenThrow(new IllegalArgumentException("foo"));

        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");

        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");

        Cart cart = new Cart();
        cart.setBill(1);
        cart.setBillid(1);
        cart.setImage("Image");
        cart.setItem(item);
        cart.setcustomer(customer);
        assertThrows(IllegalArgumentException.class, () -> myService.billEntry(cart));
        verify(cartRepo).save((Cart) any());
    }

    /**
     * Method under test: {@link MyService#billEntry(Cart)}
     */
    @Test
    void testBillEntry3() {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");

        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");

        Cart cart = new Cart();
        cart.setBill(1);
        cart.setBillid(1);
        cart.setImage("Image");
        cart.setItem(item);
        cart.setcustomer(customer);
        when(cartRepo.save((Cart) any())).thenReturn(cart);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");

        Item item1 = new Item();
        item1.setCategory(category1);
        item1.setIid(1);
        item1.setImage("Image");
        item1.setIname("Iname");
        item1.setIprice("Iprice");

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setMobile(1L);
        customer1.setName("Name");

        Cart cart1 = new Cart();
        cart1.setBill(1);
        cart1.setBillid(1);
        cart1.setImage("Image");
        cart1.setItem(item1);
        cart1.setcustomer(customer1);
        assertSame(cart, myService.billEntry(cart1));
        verify(cartRepo).save((Cart) any());
    }

    /**
     * Method under test: {@link MyService#billEntry(Cart)}
     */
    @Test
    void testBillEntry4() {
        when(cartRepo.save((Cart) any())).thenThrow(new IllegalArgumentException("foo"));

        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");

        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");

        Cart cart = new Cart();
        cart.setBill(1);
        cart.setBillid(1);
        cart.setImage("Image");
        cart.setItem(item);
        cart.setcustomer(customer);
        assertThrows(IllegalArgumentException.class, () -> myService.billEntry(cart));
        verify(cartRepo).save((Cart) any());
    }

    /**
     * Method under test: {@link MyService#allBill()}
     */
    @Test
    void testAllBill() {
        ArrayList<Cart> cartList = new ArrayList<>();
        when(cartRepo.findAll()).thenReturn(cartList);
        List<Cart> actualAllBillResult = myService.allBill();
        assertSame(cartList, actualAllBillResult);
        assertTrue(actualAllBillResult.isEmpty());
        verify(cartRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allBill()}
     */
    @Test
    void testAllBill2() {
        when(cartRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allBill());
        verify(cartRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allBill()}
     */
    @Test
    void testAllBill3() {
        ArrayList<Cart> cartList = new ArrayList<>();
        when(cartRepo.findAll()).thenReturn(cartList);
        List<Cart> actualAllBillResult = myService.allBill();
        assertSame(cartList, actualAllBillResult);
        assertTrue(actualAllBillResult.isEmpty());
        verify(cartRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#allBill()}
     */
    @Test
    void testAllBill4() {
        when(cartRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.allBill());
        verify(cartRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#saveRegistration(UserRepo.NewUser)}
     */
    @Test
    void testSaveRegistration() {
        UserRepo.NewUser newUser = new UserRepo.NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(userRepo.save((UserRepo.NewUser) any())).thenReturn(newUser);

        UserRepo.NewUser newUser1 = new UserRepo.NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setPassword("iloveyou");
        newUser1.setUsername("janedoe");
        assertSame(newUser, myService.saveRegistration(newUser1));
        verify(userRepo).save((UserRepo.NewUser) any());
    }

    /**
     * Method under test: {@link MyService#saveRegistration(UserRepo.NewUser)}
     */
    @Test
    void testSaveRegistration2() {
        when(userRepo.save((UserRepo.NewUser) any())).thenThrow(new IllegalArgumentException("foo"));

        UserRepo.NewUser newUser = new UserRepo.NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        assertThrows(IllegalArgumentException.class, () -> myService.saveRegistration(newUser));
        verify(userRepo).save((UserRepo.NewUser) any());
    }

    /**
     * Method under test: {@link MyService#saveRegistration(UserRepo.NewUser)}
     */
    @Test
    void testSaveRegistration3() {
        UserRepo.NewUser newUser = new UserRepo.NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(userRepo.save((UserRepo.NewUser) any())).thenReturn(newUser);

        UserRepo.NewUser newUser1 = new UserRepo.NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setPassword("iloveyou");
        newUser1.setUsername("janedoe");
        assertSame(newUser, myService.saveRegistration(newUser1));
        verify(userRepo).save((UserRepo.NewUser) any());
    }

    /**
     * Method under test: {@link MyService#saveRegistration(UserRepo.NewUser)}
     */
    @Test
    void testSaveRegistration4() {
        when(userRepo.save((UserRepo.NewUser) any())).thenThrow(new IllegalArgumentException("foo"));

        UserRepo.NewUser newUser = new UserRepo.NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        assertThrows(IllegalArgumentException.class, () -> myService.saveRegistration(newUser));
        verify(userRepo).save((UserRepo.NewUser) any());
    }

    /**
     * Method under test: {@link MyService#getUsers(String, String)}
     */
    @Test
    void testGetUsers() {
        when(userRepo.findByUsernameAndPassword((String) any(), (String) any())).thenReturn(new ArrayList<>());
        ArrayList<UserRepo.NewUser> newUserList = new ArrayList<>();
        when(userRepo.findAll()).thenReturn(newUserList);
        List<UserRepo.NewUser> actualUsers = myService.getUsers("janedoe", "iloveyou");
        assertSame(newUserList, actualUsers);
        assertTrue(actualUsers.isEmpty());
        verify(userRepo).findByUsernameAndPassword((String) any(), (String) any());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#getUsers(String, String)}
     */
    @Test
    void testGetUsers2() {
        when(userRepo.findByUsernameAndPassword((String) any(), (String) any()))
                .thenThrow(new IllegalArgumentException("foo"));
        when(userRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getUsers("janedoe", "iloveyou"));
        verify(userRepo).findByUsernameAndPassword((String) any(), (String) any());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#getUsers(String, String)}
     */
    @Test
    void testGetUsers3() {
        when(userRepo.findByUsernameAndPassword((String) any(), (String) any())).thenReturn(new ArrayList<>());
        ArrayList<UserRepo.NewUser> newUserList = new ArrayList<>();
        when(userRepo.findAll()).thenReturn(newUserList);
        List<UserRepo.NewUser> actualUsers = myService.getUsers("janedoe", "iloveyou");
        assertSame(newUserList, actualUsers);
        assertTrue(actualUsers.isEmpty());
        verify(userRepo).findByUsernameAndPassword((String) any(), (String) any());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#getUsers(String, String)}
     */
    @Test
    void testGetUsers4() {
        when(userRepo.findByUsernameAndPassword((String) any(), (String) any()))
                .thenThrow(new IllegalArgumentException("foo"));
        when(userRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.getUsers("janedoe", "iloveyou"));
        verify(userRepo).findByUsernameAndPassword((String) any(), (String) any());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#FindAllUsers()}
     */
    @Test
    void testFindAllUsers() {
        ArrayList<UserRepo.NewUser> newUserList = new ArrayList<>();
        when(userRepo.findAll()).thenReturn(newUserList);
        List<UserRepo.NewUser> actualFindAllUsersResult = myService.FindAllUsers();
        assertSame(newUserList, actualFindAllUsersResult);
        assertTrue(actualFindAllUsersResult.isEmpty());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#FindAllUsers()}
     */
    @Test
    void testFindAllUsers2() {
        when(userRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.FindAllUsers());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#FindAllUsers()}
     */
    @Test
    void testFindAllUsers3() {
        ArrayList<UserRepo.NewUser> newUserList = new ArrayList<>();
        when(userRepo.findAll()).thenReturn(newUserList);
        List<UserRepo.NewUser> actualFindAllUsersResult = myService.FindAllUsers();
        assertSame(newUserList, actualFindAllUsersResult);
        assertTrue(actualFindAllUsersResult.isEmpty());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link MyService#FindAllUsers()}
     */
    @Test
    void testFindAllUsers4() {
        when(userRepo.findAll()).thenThrow(new IllegalArgumentException("foo"));
        assertThrows(IllegalArgumentException.class, () -> myService.FindAllUsers());
        verify(userRepo).findAll();
    }
}

