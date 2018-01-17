package com.sivserver.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 22-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
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
//       busdet.setBusno(busno);
//       busdet.setDrivername(drivername);
//       busdet.setSeatno(seatno);
//       busDetailRepository.save(busdet);
//   }

}
