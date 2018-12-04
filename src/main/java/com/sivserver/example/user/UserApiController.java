package com.sivserver.example.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sivserver.example.Login.LoginActivity;
import com.sivserver.example.Login.LoginActivityRepository;
import com.sivserver.example.institute.InstituteDetails;
import com.sivserver.example.institute.InstituteDetailsRepository;
import com.sivserver.example.utils.SivUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;
import static sun.misc.Version.println;

/**
 * Created by Seetha on 13-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/user")
public class UserApiController extends WebMvcConfigurerAdapter {
   @Autowired
    private UserRepository userRepository;
   @Autowired
    private InstituteDetailsRepository instituteDetailsRepository;
   @Autowired
    private MenuListRepository menuListRepository;
    @Autowired
    private LoginActivityRepository loginActivityRepository;
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
    public String getUser(@RequestParam (value ="username") String username,
                          @RequestParam (value="password") String password,
                          @RequestParam (value="sourceDevice", required = false) String sourceDevice
    ) {
       User loginUser = userRepository.findByUsername(username);
        String result=null;
        try {
          if(null != loginUser && loginUser.getPassword().contentEquals(password)) {

              LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
              Integer instituteidnum = loginUserDetail.getInstituteid();
              System.out.println("instituteid:");
              System.out.println(instituteidnum);
              InstituteDetails instituteDetails = instituteDetailsRepository.findByInstituteid(instituteidnum);
              Map<String, Object> returnobj = new HashMap<>();
              returnobj.put("firstName",loginUserDetail.getFirstName());
              returnobj.put("instituteid",loginUserDetail.getInstituteid().toString());
              returnobj.put("lastName",loginUserDetail.getLastName());
              returnobj.put("userRole",loginUserDetail.getUserRole());
              returnobj.put("username",loginUserDetail.getUsername());
              returnobj.put("instituteAddress1",instituteDetails.getInstituteaddress1());
              returnobj.put("instituteAddress2",instituteDetails.getInstituteaddress2());
              returnobj.put("instituteArea",instituteDetails.getInstitutearea());
              returnobj.put("instituteCode",instituteDetails.getInstitutecode());
              returnobj.put("instituteContact1",instituteDetails.getInstitutecontactno1());
              returnobj.put("instituteContact2",instituteDetails.getInstitutecontactno2());
              returnobj.put("instituteEmail1",instituteDetails.getInstituteemail1());
              returnobj.put("instituteEmail2",instituteDetails.getInstituteemail2());
              returnobj.put("instituteName",instituteDetails.getInstitutename());
              returnobj.put("institutePincode",instituteDetails.getInstitutepincode());
              returnobj.put("instituteState",instituteDetails.getInstitutestate());
              returnobj.put("instituteType",instituteDetails.getInstitutetype());
              returnobj.put("instituteWeb",instituteDetails.getInstituteweb());
              returnobj.put("instituteImage",instituteDetails.getInstituteimage());
              returnobj.put("instituteLogo",instituteDetails.getInstitutelogo());
              MenuListCompoundKey menuListCompoundKey = new MenuListCompoundKey(instituteDetails.getInstitutetype(),loginUserDetail.getUserRole());
              MenuList menuList = new MenuList();
              menuList = menuListRepository.findOneByMenulistcompoundkey(menuListCompoundKey);
              String menulistString = "";
              if(sourceDevice.equals("web")){
                  menulistString = menuList.getMenulistweb();
              }else {
                  menulistString = menuList.getMenulistapp();
              }
              returnobj.put("menulist",menulistString);
//              returnobj.put("usernametest",loginUserDetail.getUsername());


              System.out.println("NAME:"+username+", PASSWORD:"+password);

                  ObjectMapper mapper = new ObjectMapper();
                  result = mapper.writeValueAsString(returnobj);

              //return result;
             // return null;
              LoginActivity loginActivity = new LoginActivity();
              loginActivity.setInstituteid(loginUserDetail.getInstituteid());
              loginActivity.setLogindate(Calendar.getInstance().getTime());
              loginActivity.setDevice(sourceDevice);
              loginActivity.setUserrole(loginUserDetail.getUserRole());
              loginActivity.setUsername(loginUserDetail.getUsername());
              loginActivity.setRegisternumber(loginUserDetail.getUsername());
              loginActivity.setUserfullname(loginUserDetail.getFirstName()+" "+loginUserDetail.getLastName());
              loginActivityRepository.save(loginActivity);
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
