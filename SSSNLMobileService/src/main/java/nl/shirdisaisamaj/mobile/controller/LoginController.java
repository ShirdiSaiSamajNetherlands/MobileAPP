package nl.shirdisaisamaj.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.shirdisaisamaj.mobile.dao.LoginDAO;
import nl.shirdisaisamaj.mobile.model.Credential;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginDAO loginDao;

	@RequestMapping(value="/authenticate", method = RequestMethod.POST)
	public String doLogin(@RequestBody Credential credential){
		return loginDao.authendicate(credential);
	}
}