package collectionimplementation.mapimplementation;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMap {
    public static void main(String[] args) {
        Map<String,String> m = new LinkedHashMap<>();
        {
            m.put("null","null");
            m.put("null","null");
            m.put("Employee Address","New Dehli");
            m.put("Employee Number","34547222455");
            m.put("Employee Experience"," 2 year");
            m.put("Employee Role","TL");
            System.out.println(m);
//            System.out.println(m.get("Employee Salary"));
//            System.out.println(m.size());
//            System.out.println(m.containsKey("Employee Name"));
//            System.out.println(m.hashCode());
//            System.out.println(m.containsValue("New Delhi"));
//            m.replace("Employee Number","9873138945");
//            System.out.println(m);
//            m.remove("Employee Role","TL");
//            System.out.println(m);
//            System.out.println(m.isEmpty());
//            System.out.println(m.keySet());
//            System.out.println(m.values());
// Map Travershing
            m.forEach((key,value)->{
                System.out.println(key+"->"+value);
        });

            // Key Travershing

//            for(String key : m.keySet()){
//                System.out.println(key);
//            }

            for(String res:m.keySet())
            {
                System.out.println(res);
            }
     for(String res1:m.values())
     {
         System.out.println(res1);
     }






        }

    }
}
