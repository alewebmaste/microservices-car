package com.portal.ap.api.controller;

import com.portal.ap.api.dto.OwnerPostDTO;
import com.portal.ap.api.service.CarPostStoreService;
import com.portal.ap.api.service.OwnerPostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerPostController {

    @Autowired
    private OwnerPostService ownerPostService;

    private final Logger LOG = LoggerFactory.getLogger(OwnerPostController.class);


    @PostMapping("/user")
    public ResponseEntity createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO){
        LOG.info("USANDO API REST - Criando novo usuario: {}", ownerPostDTO);
        ownerPostService.createOwnerCar(ownerPostDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
