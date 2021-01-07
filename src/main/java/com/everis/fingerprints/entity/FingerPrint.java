package com.everis.fingerprints.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FingerPrint implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = -945740282693593308L;
  private String documentNumber;
}
