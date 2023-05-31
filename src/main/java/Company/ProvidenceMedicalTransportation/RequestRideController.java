package Company.ProvidenceMedicalTransportation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RequestRideController {
	
	@RequestMapping("/RequestRide")
	public String doGet(HttpServletRequest req, HttpServletResponse res) {
		
		
		
		
		return "UserInfo.jsp";
		
	}

}
