package com.sivserver.example.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sivserver.example.utils.SivUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static sun.misc.Version.println;

/**
 * Created by Seetha on 13-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserApiController extends WebMvcConfigurerAdapter {
   @Autowired
    private UserRepository userRepository;
//    /**
//     * give a event id, will return the event details
//     * @param name - primary key id
//     * @return name
//     */
////    @RequestMapping(method = RequestMethod.GET)
////    public @ResponseBody  User getUser(@RequestParam("name") String name) {
////        User i = userRepository.findOne(name);
////        String Username=i.getName();
////        return i;
////        //return this.userRepository.findOne(name);
////    }
    @RequestMapping(method = RequestMethod.POST)
    public String getUser(@RequestParam (value ="username") String username, @RequestParam (value="password") String password) {
       User loginUser = userRepository.findByUsername(username);
        String result=null;
        try {
          if(null != loginUser && loginUser.getPassword().contentEquals(password)) {

              LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);

              System.out.println("NAME:"+username+", PASSWORD:"+password);

                  ObjectMapper mapper = new ObjectMapper();
                  result = mapper.writeValueAsString(loginUserDetail);

              //return result;
             // return null;

          }else{
             // JSONOb
              JSONObject errorMsgObj = new JSONObject();
              errorMsgObj.put("errorMessage", "WRONG PASSWORD");
               result = errorMsgObj.toString();
              //return result;
           }
        }catch (Exception e){

        }
        return result;
   }
////    @RequestMapping(method = RequestMethod.GET)
////    public Iterable<User> getUsers(){
////        return this.userRepository.findAll();
////    }
}
