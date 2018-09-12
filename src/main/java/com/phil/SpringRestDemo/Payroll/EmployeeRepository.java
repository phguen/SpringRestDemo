/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phil.SpringRestDemo.Payroll;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Phil
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}
