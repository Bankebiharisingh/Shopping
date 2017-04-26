package com.niit.shoppingcart;

/*import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

public class CategoryTestCase{
	@Autowired static AnnotationConfigApplicationContext context;
	@Autowired static CategoryDAO categoryDAO;
	@Autowired static Category category;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get the userDAO from context
		categoryDAO =  (UserDAO) context.getBean("userDAO");
		
		//get the user from context
		
		category = (User)context.getBean("user");
		
	
	
	}

}
*/