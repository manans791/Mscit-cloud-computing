/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author yashchandra05
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int i = 3;
            int j = 4;
            int result_add = add(i, j);
            int result_sub = sub(i, j);
            System.out.println("Result_add = " + result_add);
            System.out.println("Result_sub = " + result_sub);
        }
        catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    private static int add(int i, int j) {
        org.me.calculator.CalculatorWSApplication_Service service = new org.me.calculator.CalculatorWSApplication_Service();
        org.me.calculator.CalculatorWSApplication port = service.getCalculatorWSApplicationPort();
        return port.add(i, j);
    }

    private static int sub(int i, int j) {
        org.me.calculator.CalculatorWSApplication_Service service = new org.me.calculator.CalculatorWSApplication_Service();
        org.me.calculator.CalculatorWSApplication port = service.getCalculatorWSApplicationPort();
        return port.sub(i, j);
    }
    
}