package com.blz.fileio;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayRollServiceTest {

	@Test
	public void givenTwoEmloyeesDetails_WrittenToFile_ShouldMatchWithEntries() {
		EmployeePayrollData[] arrayofEmps = { new EmployeePayrollData(1, "James", 25000.0),
				new EmployeePayrollData(2, "Mickey", 50000.0) };
		EmployeePayrollService empPayrollService;
		empPayrollService = new EmployeePayrollService(Arrays.asList(arrayofEmps));
		empPayrollService.writeEmployeePayrollData(com.blz.fileio.EmployeePayrollService.IOService.FILE_IO);
		empPayrollService.printData(com.blz.fileio.EmployeePayrollService.IOService.FILE_IO);
		long entries = empPayrollService.countEntries(com.blz.fileio.EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(2, entries);
	}

}
