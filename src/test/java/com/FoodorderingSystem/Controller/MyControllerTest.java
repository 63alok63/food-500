package com.FoodorderingSystem.Controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.FoodorderingSystem.Entity.Cart;
import com.FoodorderingSystem.Entity.Category;
import com.FoodorderingSystem.Entity.Customer;
import com.FoodorderingSystem.Entity.Item;
import com.FoodorderingSystem.Repo.UserRepo;
import com.FoodorderingSystem.Service.MyService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {MyController.class})
@ExtendWith(SpringExtension.class)
class MyControllerTest {
    @Autowired
    private MyController myController;

    @MockBean
    private MyService myService;

    /**
     * Method under test: {@link MyController#allCustomer()}
     */
    @Test
    void testAllCustomer() throws Exception {
        when(myService.allCustomer()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllCustomer");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCustomer()}
     */
    @Test
    void testAllCustomer2() throws Exception {
        when(myService.allCustomer()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getAllCustomer");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCustomer()}
     */
    @Test
    void testAllCustomer3() throws Exception {
        when(myService.allCustomer()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllCustomer");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCustomer()}
     */
    @Test
    void testAllCustomer4() throws Exception {
        when(myService.allCustomer()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getAllCustomer");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCustomer()}
     */
    @Test
    void testAllCustomer5() throws Exception {
        when(myService.allCustomer()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllCustomer");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCustomer()}
     */
    @Test
    void testAllCustomer6() throws Exception {
        when(myService.allCustomer()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getAllCustomer");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allItem()}
     */
    @Test
    void testAllItem() throws Exception {
        when(myService.allItem()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getItem");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allItem()}
     */
    @Test
    void testAllItem2() throws Exception {
        when(myService.allItem()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getItem");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allItem()}
     */
    @Test
    void testAllItem3() throws Exception {
        when(myService.allItem()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getItem");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allItem()}
     */
    @Test
    void testAllItem4() throws Exception {
        when(myService.allItem()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getItem");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allItem()}
     */
    @Test
    void testAllItem5() throws Exception {
        when(myService.allItem()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getItem");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allItem()}
     */
    @Test
    void testAllItem6() throws Exception {
        when(myService.allItem()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getItem");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCategory()}
     */
    @Test
    void testAllCategory() throws Exception {
        when(myService.allCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCategory");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCategory()}
     */
    @Test
    void testAllCategory2() throws Exception {
        when(myService.allCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getCategory");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCategory()}
     */
    @Test
    void testAllCategory3() throws Exception {
        when(myService.allCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCategory");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCategory()}
     */
    @Test
    void testAllCategory4() throws Exception {
        when(myService.allCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getCategory");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCategory()}
     */
    @Test
    void testAllCategory5() throws Exception {
        when(myService.allCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCategory");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allCategory()}
     */
    @Test
    void testAllCategory6() throws Exception {
        when(myService.allCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getCategory");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#Apply(UserRepo.NewUser)}
     */
    @Test
    void testApply2() throws Exception {
        UserRepo.NewUser newUser = new UserRepo.NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(myService.saveRegistration((UserRepo.NewUser) any())).thenReturn(newUser);

        UserRepo.NewUser newUser1 = new UserRepo.NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setPassword("iloveyou");
        newUser1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/registration")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link MyController#Apply(UserRepo.NewUser)}
     */
    @Test
    void testApply3() throws Exception {
        UserRepo.NewUser newUser = new UserRepo.NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(myService.saveRegistration((UserRepo.NewUser) any())).thenReturn(newUser);

        UserRepo.NewUser newUser1 = new UserRepo.NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setPassword("iloveyou");
        newUser1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/registration")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link MyController#createCategory(Category)}
     */
    @Test
    void testCreateCategory2() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");
        when(myService.newCategory((Category) any())).thenReturn(category);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");
        String content = (new ObjectMapper()).writeValueAsString(category1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createCategory")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"cat\":\"Cat\",\"subcat\":\"Subcat\"}"));
    }

    /**
     * Method under test: {@link MyController#createCategory(Category)}
     */
    @Test
    void testCreateCategory3() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");
        when(myService.newCategory((Category) any())).thenReturn(category);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");
        String content = (new ObjectMapper()).writeValueAsString(category1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createCategory")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"cat\":\"Cat\",\"subcat\":\"Subcat\"}"));
    }

    /**
     * Method under test: {@link MyController#createCustomer(Customer)}
     */
    @Test
    void testCreateCustomer2() throws Exception {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");
        when(myService.newCustomer((Customer) any())).thenReturn(customer);

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setMobile(1L);
        customer1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(customer1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createCustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"name\":\"Name\",\"address\":\"42 Main St\",\"mobile\":1}"));
    }

    /**
     * Method under test: {@link MyController#createCustomer(Customer)}
     */
    @Test
    void testCreateCustomer3() throws Exception {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");
        when(myService.newCustomer((Customer) any())).thenReturn(customer);

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setMobile(1L);
        customer1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(customer1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createCustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"name\":\"Name\",\"address\":\"42 Main St\",\"mobile\":1}"));
    }

    /**
     * Method under test: {@link MyController#findName(String)}
     */
    @Test
    void testFindName2() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(myService.getItemName((String) any())).thenReturn(item);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/name/{itemName}", "Item Name");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image\",\"category\":{\"cat\":\"Cat\",\"subcat\":"
                                        + "\"Subcat\"}}"));
    }

    /**
     * Method under test: {@link MyController#findName(String)}
     */
    @Test
    void testFindName3() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(myService.getItemName((String) any())).thenReturn(item);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/name/{itemName}", "Item Name");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image\",\"category\":{\"cat\":\"Cat\",\"subcat\":"
                                        + "\"Subcat\"}}"));
    }

    /**
     * Method under test: {@link MyController#findNonVeg()}
     */
    @Test
    void testFindNonVeg3() throws Exception {
        when(myService.getNonVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getNonVeg");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findNonVeg()}
     */
    @Test
    void testFindNonVeg4() throws Exception {
        when(myService.getNonVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getNonVeg");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findNonVeg()}
     */
    @Test
    void testFindNonVeg5() throws Exception {
        when(myService.getNonVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getNonVeg");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findNonVeg()}
     */
    @Test
    void testFindNonVeg6() throws Exception {
        when(myService.getNonVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getNonVeg");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findSouthIndian()}
     */
    @Test
    void testFindSouthIndian3() throws Exception {
        when(myService.getSouthIndian()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getSouthIndian");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findSouthIndian()}
     */
    @Test
    void testFindSouthIndian4() throws Exception {
        when(myService.getSouthIndian()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getSouthIndian");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findSouthIndian()}
     */
    @Test
    void testFindSouthIndian5() throws Exception {
        when(myService.getSouthIndian()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getSouthIndian");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findSouthIndian()}
     */
    @Test
    void testFindSouthIndian6() throws Exception {
        when(myService.getSouthIndian()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getSouthIndian");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#GetAllUsers()}
     */
    @Test
    void testGetAllUsers3() throws Exception {
        when(myService.FindAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#GetAllUsers()}
     */
    @Test
    void testGetAllUsers4() throws Exception {
        when(myService.FindAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/users");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#GetAllUsers()}
     */
    @Test
    void testGetAllUsers5() throws Exception {
        when(myService.FindAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#GetAllUsers()}
     */
    @Test
    void testGetAllUsers6() throws Exception {
        when(myService.FindAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/users");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getVeg()}
     */
    @Test
    void testGetVeg() throws Exception {
        when(myService.getVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getVeg");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getVeg()}
     */
    @Test
    void testGetVeg2() throws Exception {
        when(myService.getVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getVeg");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getVeg()}
     */
    @Test
    void testGetVeg3() throws Exception {
        when(myService.getVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getVeg");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getVeg()}
     */
    @Test
    void testGetVeg4() throws Exception {
        when(myService.getVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getVeg");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getVeg()}
     */
    @Test
    void testGetVeg5() throws Exception {
        when(myService.getVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getVeg");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#getVeg()}
     */
    @Test
    void testGetVeg6() throws Exception {
        when(myService.getVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getVeg");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#billEntry(Cart)}
     */
    @Test
    void testBillEntry() throws Exception {
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
        when(myService.billEntry((Cart) any())).thenReturn(cart);

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
        String content = (new ObjectMapper()).writeValueAsString(cart1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createBill")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"billid\":1,\"bill\":1,\"image\":\"Image\",\"item\":{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image"
                                        + "\",\"category\":{\"cat\":\"Cat\",\"subcat\":\"Subcat\"}},\"customer\":{\"name\":\"Name\",\"address\":\"42 Main"
                                        + " St\",\"mobile\":1}}"));
    }

    /**
     * Method under test: {@link MyController#billEntry(Cart)}
     */
    @Test
    void testBillEntry2() throws Exception {
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
        when(myService.billEntry((Cart) any())).thenReturn(cart);

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
        String content = (new ObjectMapper()).writeValueAsString(cart1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createBill")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"billid\":1,\"bill\":1,\"image\":\"Image\",\"item\":{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image"
                                        + "\",\"category\":{\"cat\":\"Cat\",\"subcat\":\"Subcat\"}},\"customer\":{\"name\":\"Name\",\"address\":\"42 Main"
                                        + " St\",\"mobile\":1}}"));
    }

    /**
     * Method under test: {@link MyController#billEntry(Cart)}
     */
    @Test
    void testBillEntry3() throws Exception {
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
        when(myService.billEntry((Cart) any())).thenReturn(cart);

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
        String content = (new ObjectMapper()).writeValueAsString(cart1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createBill")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"billid\":1,\"bill\":1,\"image\":\"Image\",\"item\":{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image"
                                        + "\",\"category\":{\"cat\":\"Cat\",\"subcat\":\"Subcat\"}},\"customer\":{\"name\":\"Name\",\"address\":\"42 Main"
                                        + " St\",\"mobile\":1}}"));
    }

    /**
     * Method under test: {@link MyController#allBill()}
     */
    @Test
    void testAllBill() throws Exception {
        when(myService.allBill()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllBill");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allBill()}
     */
    @Test
    void testAllBill2() throws Exception {
        when(myService.allBill()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getAllBill");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allBill()}
     */
    @Test
    void testAllBill3() throws Exception {
        when(myService.allBill()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllBill");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allBill()}
     */
    @Test
    void testAllBill4() throws Exception {
        when(myService.allBill()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getAllBill");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allBill()}
     */
    @Test
    void testAllBill5() throws Exception {
        when(myService.allBill()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllBill");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#allBill()}
     */
    @Test
    void testAllBill6() throws Exception {
        when(myService.allBill()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getAllBill");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#Apply(UserRepo.NewUser)}
     */
    @Test
    void testApply() throws Exception {
        UserRepo.NewUser newUser = new UserRepo.NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(myService.saveRegistration((UserRepo.NewUser) any())).thenReturn(newUser);

        UserRepo.NewUser newUser1 = new UserRepo.NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setPassword("iloveyou");
        newUser1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/registration")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link MyController#createCategory(Category)}
     */
    @Test
    void testCreateCategory() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");
        when(myService.newCategory((Category) any())).thenReturn(category);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");
        String content = (new ObjectMapper()).writeValueAsString(category1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createCategory")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"cat\":\"Cat\",\"subcat\":\"Subcat\"}"));
    }

    /**
     * Method under test: {@link MyController#createCustomer(Customer)}
     */
    @Test
    void testCreateCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setMobile(1L);
        customer.setName("Name");
        when(myService.newCustomer((Customer) any())).thenReturn(customer);

        Customer customer1 = new Customer();
        customer1.setAddress("42 Main St");
        customer1.setMobile(1L);
        customer1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(customer1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createCustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"name\":\"Name\",\"address\":\"42 Main St\",\"mobile\":1}"));
    }

    /**
     * Method under test: {@link MyController#findName(String)}
     */
    @Test
    void testFindName() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(myService.getItemName((String) any())).thenReturn(item);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/name/{itemName}", "Item Name");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image\",\"category\":{\"cat\":\"Cat\",\"subcat\":"
                                        + "\"Subcat\"}}"));
    }

    /**
     * Method under test: {@link MyController#findNonVeg()}
     */
    @Test
    void testFindNonVeg() throws Exception {
        when(myService.getNonVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getNonVeg");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findNonVeg()}
     */
    @Test
    void testFindNonVeg2() throws Exception {
        when(myService.getNonVeg()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getNonVeg");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findSouthIndian()}
     */
    @Test
    void testFindSouthIndian() throws Exception {
        when(myService.getSouthIndian()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getSouthIndian");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#findSouthIndian()}
     */
    @Test
    void testFindSouthIndian2() throws Exception {
        when(myService.getSouthIndian()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/getSouthIndian");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#GetAllUsers()}
     */
    @Test
    void testGetAllUsers() throws Exception {
        when(myService.FindAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#GetAllUsers()}
     */
    @Test
    void testGetAllUsers2() throws Exception {
        when(myService.FindAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/users");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#Home()}
     */
    @Test
    void testHome() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("home"));
    }

    /**
     * Method under test: {@link MyController#Home()}
     */
    @Test
    void testHome2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("home"));
    }

    /**
     * Method under test: {@link MyController#Home()}
     */
    @Test
    void testHome3() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("home"));
    }

    /**
     * Method under test: {@link MyController#Home()}
     */
    @Test
    void testHome4() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("home"));
    }

    /**
     * Method under test: {@link MyController#Home()}
     */
    @Test
    void testHome5() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("home"));
    }

    /**
     * Method under test: {@link MyController#Home()}
     */
    @Test
    void testHome6() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("home"));
    }

    /**
     * Method under test: {@link MyController#item(Item)}
     */
    @Test
    void testItem() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(myService.newItem((Item) any())).thenReturn(item);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");

        Item item1 = new Item();
        item1.setCategory(category1);
        item1.setIid(1);
        item1.setImage("Image");
        item1.setIname("Iname");
        item1.setIprice("Iprice");
        String content = (new ObjectMapper()).writeValueAsString(item1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createItem")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image\",\"category\":{\"cat\":\"Cat\",\"subcat\":"
                                        + "\"Subcat\"}}"));
    }

    /**
     * Method under test: {@link MyController#item(Item)}
     */
    @Test
    void testItem2() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(myService.newItem((Item) any())).thenReturn(item);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");

        Item item1 = new Item();
        item1.setCategory(category1);
        item1.setIid(1);
        item1.setImage("Image");
        item1.setIname("Iname");
        item1.setIprice("Iprice");
        String content = (new ObjectMapper()).writeValueAsString(item1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createItem")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image\",\"category\":{\"cat\":\"Cat\",\"subcat\":"
                                        + "\"Subcat\"}}"));
    }

    /**
     * Method under test: {@link MyController#item(Item)}
     */
    @Test
    void testItem3() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setSubcat("Subcat");

        Item item = new Item();
        item.setCategory(category);
        item.setIid(1);
        item.setImage("Image");
        item.setIname("Iname");
        item.setIprice("Iprice");
        when(myService.newItem((Item) any())).thenReturn(item);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setSubcat("Subcat");

        Item item1 = new Item();
        item1.setCategory(category1);
        item1.setIid(1);
        item1.setImage("Image");
        item1.setIname("Iname");
        item1.setIprice("Iprice");
        String content = (new ObjectMapper()).writeValueAsString(item1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/createItem")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"iid\":1,\"iname\":\"Iname\",\"iprice\":\"Iprice\",\"image\":\"Image\",\"category\":{\"cat\":\"Cat\",\"subcat\":"
                                        + "\"Subcat\"}}"));
    }

    /**
     * Method under test: {@link MyController#logins(String, String)}
     */
    @Test
    void testLogins() throws Exception {
        when(myService.getUsers((String) any(), (String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/login")
                .param("password", "foo")
                .param("username", "foo");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#logins(String, String)}
     */
    @Test
    void testLogins2() throws Exception {
        when(myService.getUsers((String) any(), (String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/login")
                .param("password", "foo")
                .param("username", "foo");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link MyController#logins(String, String)}
     */
    @Test
    void testLogins3() throws Exception {
        when(myService.getUsers((String) any(), (String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/login")
                .param("password", "foo")
                .param("username", "foo");
        MockMvcBuilders.standaloneSetup(myController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }
}

