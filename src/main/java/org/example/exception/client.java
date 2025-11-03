package org.example.exception;

public class client {
    public static void main(String[] args) throws Exception {
        int n = 0;

        try {
            int result = 10 / n;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            throw new Exception(e);
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception occurred.");
            //throw new Exception(e);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            //throw new Exception(e);
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
