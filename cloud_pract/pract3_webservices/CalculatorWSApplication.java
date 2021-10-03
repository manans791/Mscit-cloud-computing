/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author yashchandra05
 */
@WebService(serviceName = "CalculatorWSApplication")
@Stateless()
public class CalculatorWSApplication {


    /**
     * Web service add operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int add_num = i + j;
        return add_num;
    }

    /**
     * Web service sub operation
     */
    @WebMethod(operationName = "sub")
    public int sub(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int sub_num = i - j;
        return sub_num;
    }
}