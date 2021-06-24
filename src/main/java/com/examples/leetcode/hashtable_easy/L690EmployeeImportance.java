package com.examples.leetcode.hashtable_easy;

import java.util.HashMap;
import java.util.List;

/** https://leetcode.com/problems/employee-importance/ */
public class L690EmployeeImportance {

    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    public HashMap<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return sum(id);
    }

    public int sum(int id) {
        Employee employee = map.get(id);
        List<Integer> subordinates = employee.subordinates;
        for (Integer subordinate : subordinates) {
            employee.importance += sum(subordinate);
        }
        return employee.importance;
    }
}
