package com.sivserver.example.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 04-Feb-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/changepassword")
public class ChangePassword {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    public String createUser(
            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="currentpassword", required=false) String currentpassword,
            @RequestParam (value="newpassword", required=false) String newpassword
    ) {
        User loginUser = userRepository.findByUsernameAndInstituteid(regno,instituteid);
        User user = new User();
        String result = null;
        JSONObject errorMsgObj = new JSONObject();
        try {
            if(null != loginUser && loginUser.getPassword().contentEquals(currentpassword)) {
                loginUser.setPassword(newpassword);
                userRepository.save(loginUser);
                result ="PASSWORD CHANGED SUCCESSFULLY!";
            }else{
                result ="WRONG PASSWORD";
            }
        }catch (Exception e){

        }
        return result;
    }
}
