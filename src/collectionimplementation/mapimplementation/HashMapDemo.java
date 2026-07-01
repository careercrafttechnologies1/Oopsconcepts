package collectionimplementation.mapimplementation;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new java.util.HashMap<>();
        map.put("EmployeeId",34);
        map.put("EmployeeNumber",98836381);
        map.put("EmployeeSalary",2500000);
        map.put("EmployeeExperience",7);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("EmployeeSalary"));
        System.out.println(map.hashCode());
        System.out.println(map.remove("EmployeeExperience"));
        System.out.println(map.containsValue(34));
        map.forEach((key, value)->{
            System.out.println(key+"->"+value);

        });
        Map<String,String> map1 = new HashMap<>();
        {
            map1.put("Name","Sourav");
            map1.put("Age","21");
            map1.put("Number","9873138956");
            System.out.println(map1);
            map1.forEach((String key, String value)->{
                System.out.println(key+"->"+value);


        });

    }}

}
