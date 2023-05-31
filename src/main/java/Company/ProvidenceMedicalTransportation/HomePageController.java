package Company.ProvidenceMedicalTransportation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomePageController {
	
	@RequestMapping ("/Home")
	public String doPost(HttpServletRequest request) {
		
		return "HomePage.jsp";
	}
	
	

}
