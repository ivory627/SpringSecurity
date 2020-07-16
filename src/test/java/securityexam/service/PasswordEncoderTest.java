package securityexam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import securityexam.config.ApplicationConfig;
import securityexam.config.SecurityConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class, SecurityConfig.class})
public class PasswordEncoderTest {
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Test
	public void passwordEncoder() throws Exception {
		System.out.println(passwordEncoder.encode("1234"));
	}
	
	@Test
	public void passwordTest() throws Exception {
		String encodePassword = "$2a$10$3Au12SlQxv9a1LCpmoNtUekykQuDzWn.B.uj.VOwapJz8z/KS21E.";
		String password = "1234";
		boolean test = passwordEncoder.matches(password, encodePassword);
		System.out.println(test);
	}
}
