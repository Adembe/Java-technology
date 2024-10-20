package Ywts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapAndBinaryFile {
    TreeMap<String, Employee> employeeTreeMapName = new TreeMap<>();
    TreeMap<Integer, Employee> employeeTreeMapSalary = new TreeMap<>();
    TreeMap<String, Employee> employeeTreeMapId = new TreeMap<>();
    List<Employee> employeeList = new ArrayList<>();
    ObjectOutputStream outputStream;
    ObjectInputStream inputStream;

    File file = new File("src//Ywts//employee.dat");
    public TreeMapAndBinaryFile() throws IOException, ClassNotFoundException {
        CreateEmployee();
        output();
        read();
        SortByName();
    }

    public void CreateEmployee(){
        Employee emp1 = new Employee("bat", 1234655, "ba123");
        Employee emp2 = new Employee("bold", 1100000, "bo123");
        Employee emp3 = new Employee("erdene", 900000, "er123");
        Employee emp4 = new Employee("mygmar", 684571, "my123");
        Employee emp5 = new Employee("dulmaa", 2540000, "du123");
        Employee emp6 = new Employee("svhee", 2000000, "sv123");
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
    }
    public void output() throws IOException {
        outputStream = new ObjectOutputStream(new FileOutputStream(file));
        try {
            outputStream.writeObject(employeeList);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        outputStream.close();
    }

    public void read() throws ClassNotFoundException, IOException {
        int i = 1;
        inputStream = new ObjectInputStream(new FileInputStream(file));
        try {
            while (inputStream.available()>0){
                employeeList = (List<Employee>) inputStream.readObject();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(Employee employee : employeeList){
            employeeTreeMapName.put(employee.getEmployeeName(),employee);
            employeeTreeMapId.put(employee.getEmployeeId(),employee);
            employeeTreeMapSalary.put(employee.getSalary(),employee);
            i++;
        }
    }
    public void SortByName(){
        System.out.println("Ажилчдыг Нэрээр нь эрэмбэлсэн");
        for (Map.Entry<String, Employee> entry : employeeTreeMapName.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("Ажилчдыг Цалынгаар нь эрэмбэлсэн");
        for (Map.Entry<Integer, Employee> entry : employeeTreeMapSalary.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("Ажилчдыг Кодоор нь эрэмбэлсэн");
        for (Map.Entry<String, Employee> entry : employeeTreeMapId.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        try {
            new TreeMapAndBinaryFile();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
