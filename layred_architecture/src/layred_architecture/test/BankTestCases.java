package layred_architecture.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import layred_architecture.dao.DBUtil;
import layred_architecture.service.SavingsAccountService;

public class BankTestCases {
	SavingsAccountService service;
	
	@ParameterizedTest
	@ValueSource(ints = {1001,1002,1003,1003})
	void validateAccountTest(int accNo) {
		service = new SavingsAccountService();
		boolean status = service.validateAccount(accNo);
		assertTrue(status);
	}
	
	@Test
	void testConnection() {
		assertNotNull(DBUtil.getConnection());
	}



}
