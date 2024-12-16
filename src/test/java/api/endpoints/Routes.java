package api.endpoints;

public class Routes {

	/*
	Swagger URI -> https://petstore.swagger.io 

	Create User (Post) : https://petstore.swagger.io/v2/user
	Get User (Get) : https://petstore.swagger.io/v2/user/{username}
	Update User (Put) : https://petstore.swagger.io/v2/user/{username}
	Delete User (Delete) : https://petstore.swagger.io/v2/user/{username}
	*/
	 
	public static String base_url ="https://petstore.swagger.io/v2";
	
	// User Module
	
	public static String post_url = base_url+"/user";
	public static String get_url = base_url+"/user/{username}";
	public static String update_url = base_url+"/user/{username}";
	public static String delete_url = base_url+"/user/{username}";
	
	// Store Module
	
	      // Here we will create for Store module URL's
	
	// Pet Module
	
          // Here we will create for Pet module URL's
}
