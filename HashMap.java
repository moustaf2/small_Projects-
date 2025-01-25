import java.util.HashMap;
public class HashMap {
    HashMap<String, Object> testHashMap = new HashMap<>();
        testHashMap.put("First_Name", "Moustafa");
        testHashMap.put("Last_Name","Mohamed");
        testHashMap.put("telefon","123");
        System.out.println(testHashMap);
    // List of Objects


    HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Moustafa", 123);
        empIds.put("Ahmed", 321);
        empIds.put("Mohamed",456);
        empIds.put("Mahmoud",654);

        System.out.println(empIds);
        System.out.println("The Mostafa's Id is " + empIds.get("Moustafa"));
    // ** to check if the id for this key exist or not **
    // empIds.containsKey ** i have a key and wannt to know the value **
        System.out.println(empIds.containsKey("Moustafa"));
        System.out.println(empIds.containsKey("Mohanad"));
    // empIds.containsValue ** i have the Value but wann to know the key **
        System.out.println(empIds.containsValue(123));
        System.out.println(empIds.containsValue(789));
    // to change the Key Valu
        empIds.put("Moustafa", 159);
        System.out.println(empIds);
    // the differnt between replace and put. by replace if the key don't exist will output nothiong. but by put will creat new key and value.
        empIds.replace("Moustafa", 777);
        System.out.println(empIds);
        empIds.replace("Youssef", 555); // don't exist and will not creat new key
        empIds.put("Youssef", 555); // don't exist and will creat new key
        System.out.println(empIds);
    // to creat new key if don't exist
        empIds.putIfAbsent("Moustafa", 888);
        empIds.putIfAbsent("Dirk", 888);
        System.out.println(empIds);
    // if i wann to remove a key
        empIds.remove("Dirk");
        System.out.println(empIds);
}
