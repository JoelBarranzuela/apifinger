package com.everis.fingerprints.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel("FingerPrint Response")
public class FingerPrintResponse {
  @ApiModelProperty(example = "Core")
  private String entityName;
  @ApiModelProperty(example = "true")
  private boolean success;
}
