package hellows;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class helloWorldWs {

	@WebMethod
	public String sayhello()
	{
		return "hello bharathi";
		
	}
	
}
