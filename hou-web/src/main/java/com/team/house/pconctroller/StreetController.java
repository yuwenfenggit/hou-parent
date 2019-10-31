package com.team.house.pconctroller;


import com.team.house.entity.Street;
import com.team.house.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/page/")
@RestController(value = "StreetController2")
public class StreetController {
    @Autowired
    private StreetService streetService;

    @RequestMapping("getAllStreet")
    public List<Street> getAllStreet(Integer did){
        return streetService.selectByExample(did);
    }

}
