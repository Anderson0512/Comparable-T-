package org.example;

import org.example.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        String path = "C:\\Users\\jestevsa\\Documents\\Estudos\\Comparable\\in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] field = employeeCsv.split(",");
                employeeList.add(new Employee(field[0], Double.valueOf(field[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(employeeList);
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}