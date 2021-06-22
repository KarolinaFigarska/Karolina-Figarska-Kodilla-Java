package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchingFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public SearchingFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void searchCompany(CompanyDto companyDto) throws SearchingException {

        LOGGER.info("Searching the Company");
        Company company = companyDao.searchCompany(companyDto.getName());
        if (company.getName() == null) {
            LOGGER.error(SearchingException.ERR_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_NOT_FOUND);
        } else {
            LOGGER.info("Searching the Company was completed successfully");
        }
    }

    public void searchEmployee(EmployeeDto employeeDto) throws SearchingException {

        LOGGER.info("Searching the Worker");
        Employee employee = employeeDao.searchWorker(employeeDto.getLastname());
        if (employee.getLastname() == null) {
            LOGGER.error(SearchingException.ERR_NOT_FOUND_WORKER);
            throw new SearchingException(SearchingException.ERR_NOT_FOUND_WORKER);
        } else {
            LOGGER.info("Searching the Worker was completed successfully");
        }
    }
}
