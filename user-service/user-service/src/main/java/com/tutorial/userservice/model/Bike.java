package com.tutorial.userservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private String brand;
private String model;
private int userId;
public void setUserId(int userId2) {
	// TODO Auto-generated method stub
	
}


}