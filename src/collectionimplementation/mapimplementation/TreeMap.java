package collectionimplementation.mapimplementation;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map =new java.util.TreeMap<>();
        map.put("EmployeeId",32);
        map.put("EmployeeNumber",98836381);
        map.put("EmployeeSalary",2500000);
        map.put("EmployeeExperience",7);
        System.out.println(map);
    }
}
