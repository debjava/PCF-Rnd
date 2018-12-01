package com.ddlab.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.boot.entity.Location;
import com.ddlab.boot.service.OrgService;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class OrgController {

  @Autowired private OrgService orgService;

  //http://localhost:8081/org/home/location/12345
  @GetMapping(path = "/location/{pincode}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Location> getLocationByPincode(@PathVariable("pincode") String pincode) {
    System.out.println("Org Service :::" + orgService);
    return new ResponseEntity<Location>(orgService.getLocationByPincode(pincode), HttpStatus.OK);
  }
}
