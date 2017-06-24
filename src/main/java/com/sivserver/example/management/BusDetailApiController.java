package com.sivserver.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 22-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/busdetail")

public class BusDetailApiController extends WebMvcConfigurerAdapter {
//    @Autowired
//    private BusDetailRepository busDetailRepository;
//
//
// @RequestMapping(method = RequestMethod.POST)
//
//
//
//    public void BusDetailSetting(
//            @RequestParam(value = "busno", required = false) String busno,
//            @RequestParam(value = "drivername", required = false) String drivername,
//            @RequestParam(value = "seatno", required = false) String seatno
//    )
//
//   {
//       BusDetail busdet =new BusDetail();
//       busdet.setBusNo(busno);
//       busdet.setDriverName(drivername);
//       busdet.setSeatNo(seatno);
//       busDetailRepository.save(busdet);
//   }

}
