package com.kodilla.hibernate.manytomay.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyDto;
import com.kodilla.hibernate.manytomany.facade.EmployeeDto;
import com.kodilla.hibernate.manytomany.facade.SearchingException;
import com.kodilla.hibernate.manytomany.facade.SearchingFacade;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchingFacadeTestSuite {

    @Autowired
    private SearchingFacade searchingFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Disabled
    @Test
    void testFindCompany() {
        CompanyDto companyDto = new CompanyDto("Kodilla");
        try {
            searchingFacade.searchCompany(companyDto);
        } catch (SearchingException e) {

        }
    }
    @Disabled
    @Test
    void testFindWorker() {
        EmployeeDto employeeDto = new EmployeeDto("Grisham");
        try {
            searchingFacade.searchEmployee(employeeDto);
        } catch (SearchingException e) {

        }
    }
}
