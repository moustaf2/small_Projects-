// package com.springbootstr.springstr.Controller;
// import com.springbootstr.springstr.dto.AdressDTO;
// import com.springbootstr.springstr.dto.ContactDTO;
// import com.springbootstr.springstr.dto.GetUsers;
// import com.springbootstr.springstr.dto.RegistrationDTO;
// import org.springframework.web.bind.ServletRequestBindingException;
// import org.springframework.web.bind.annotation.*;

// import javax.lang.model.element.NestingKind;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Objects;

// @RestController
// public class Testcontroller {

//     @GetMapping(path = "/object")
//     public HashMap<String,Object> test_object(){
//         HashMap<String,Object> object = new HashMap<>();
//         object.put("name","Moustafa");
//         return object;

//     }
//     @GetMapping("/adress") // get URL ,, Query String
//     public HashMap<String, Object> test_json (){
//         HashMap<String,Object> object = new HashMap<>();
//         List<ContactDTO> contacts = new ArrayList<>();
//         contacts.add(new ContactDTO("work","333"));
//         contacts.add(new ContactDTO("home","444"));
//         contacts.add(new ContactDTO("other", "555"));
//         object.put("adress",contacts);
//         return object;
//     }
//     @GetMapping(path = "/users")
//     public List<GetUsers> get_users (){
//         List<GetUsers> users = new ArrayList<>();
//         List<AdressDTO> moustafa_adress = new ArrayList<>();
//         moustafa_adress.add(new AdressDTO("Deutschland","Magdeburg","walther Rathenau str"));
//         moustafa_adress.add(new AdressDTO("Egypt","Mansoura","Talkha Street"));
//         users.add(new GetUsers("Moustafa","Moustafa","333","m",moustafa_adress));
//         List<AdressDTO> ahmed_adress = new ArrayList<>();
//         ahmed_adress.add(new AdressDTO("Egypt","Mansoura","Cornish street"));
//         users.add(new GetUsers("Ahmed","Moustafa","444","m",ahmed_adress));
//         List<AdressDTO> mohanad_adress = new ArrayList<>();
//         mohanad_adress.add(new AdressDTO("Doha","Muathier","Wathnan street"));
//         users.add(new GetUsers("Mohanad","Mohamed","555","m",mohanad_adress));
//         return users;
//     }
//     }
