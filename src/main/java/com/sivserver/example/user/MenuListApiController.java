package com.sivserver.example.user;

import com.sivserver.example.management.Management_Playschool_Fees_Compound_Key;
import com.sivserver.example.management.PlaySchoolSchoolFeesSettingProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 30-Mar-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/menulist")

public class MenuListApiController {

    @Autowired

    private MenuListRepository menuListRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void menulistdetails(

        @RequestParam(value = "institutetype", required = false) String institutetype,
        @RequestParam(value = "userrole", required = false) String userrole,
        @RequestParam(value = "menulistweb", required = false) String menulistweb,
        @RequestParam(value = "menulistapp", required = false) String menulistapp
    )
    {
        MenuList menuList = new MenuList();
        MenuListCompoundKey key = new MenuListCompoundKey(institutetype, userrole);

        menuList.setMenulistcompoundkey(key);
        menuList.setMenulistweb(menulistweb);
        menuList.setMenulistapp(menulistapp);

        menuListRepository.save(menuList);
    }

//    @RequestMapping(method = RequestMethod.POST, value="/getWebAppMenuDetails")
////    public PlaySchoolSchoolFeesSettingProjection getPlaySchoolFeesDetail(@RequestParam (value ="managementplayschoolfeescompoundkey", required = false) Management_Playschool_Fees_Compound_Key mgmtpsfeescompkey) {
//    public MenuListWebAppProjection getWebAppMenuDetail(@RequestParam (value ="institutetype", required = false) String institutetype, @RequestParam (value ="userrole", required = false) String userrole)  {
//        MenuListCompoundKey menulistcompkey = new MenuListCompoundKey(institutetype,userrole);
//        MenuListWebAppProjection webappmenuDetail = menuListRepository.findOneByMenulistcompoundkey(menulistcompkey);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getPlaySchoolFeesDetail");
//        return webappmenuDetail;
//    }

}
