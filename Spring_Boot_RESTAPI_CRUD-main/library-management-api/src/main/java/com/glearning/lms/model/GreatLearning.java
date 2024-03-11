package com.glearning.lms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;*/
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "great_learning")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@Builder

public class GreatLearning {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String courseName;
	private String courseType;
	//private Instructor instructor;

}
