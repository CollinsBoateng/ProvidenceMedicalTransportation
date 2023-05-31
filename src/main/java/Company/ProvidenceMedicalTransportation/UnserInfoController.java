package Company.ProvidenceMedicalTransportation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
	
	@Controller
	public class UnserInfoController {
		
		@RequestMapping("/Info")
		public String doGet() {
			
			
			return "ThankYou.jsp";
			
		}

}
