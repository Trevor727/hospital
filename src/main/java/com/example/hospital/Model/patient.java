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
}
