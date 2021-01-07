package com.everis.fingerprints.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.fingerprints.entity.FingerPrint;
import com.everis.fingerprints.entity.FingerPrintResponse;

import io.reactivex.Single;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/core/fingerprints")
@Api("/core/fingerprints")
public class FingerPrintController {

  @ApiOperation(value = "Valid persona por huella", response = FingerPrintResponse.class)
  @ApiResponse(code = 200, message = "api ok", response = FingerPrintResponse.class)
  @PostMapping("/validate")
  public Single<FingerPrintResponse> validate(@RequestBody FingerPrint request) {
    return Single.just(new FingerPrintResponse("Core", true));
  }
}
