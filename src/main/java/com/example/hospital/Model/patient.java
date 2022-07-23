package com.example.hospital.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "patient")
@SuppressWarnings("ALL")

public class patient {
   private Long patient_id;
   private String name;
   private Long age;
   private String gender;
   private Long tel;
   private String sicknessdetails;

   public patient(Long patient_id, String name, Long age, String gender, Long tel, String sicknessdetails) {
      this.patient_id = patient_id;
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.tel = tel;
      this.sicknessdetails = sicknessdetails;
   }
}
