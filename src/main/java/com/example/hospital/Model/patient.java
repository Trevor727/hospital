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

   public Long getPatient_id() {
      return patient_id;
   }

   public void setPatient_id(Long patient_id) {
      this.patient_id = patient_id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Long getAge() {
      return age;
   }

   public void setAge(Long age) {
      this.age = age;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public Long getTel() {
      return tel;
   }

   public void setTel(Long tel) {
      this.tel = tel;
   }

   public String getSicknessdetails() {
      return sicknessdetails;
   }

   public void setSicknessdetails(String sicknessdetails) {
      this.sicknessdetails = sicknessdetails;
   }
}
