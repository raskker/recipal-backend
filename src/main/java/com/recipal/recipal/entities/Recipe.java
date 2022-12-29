package com.recipal.recipal.entities;

import java.time.Duration;
import java.util.List;

import com.recipal.recipal.enums.ECategory;
import com.recipal.recipal.enums.EDifficulty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private List<Ingredient> ingredients;
	
	private int portion;
	
	private int calories;
	
	private String description;
	
	private Duration workTime;
	
	private Duration cookTime;
	
	private EDifficulty difficulty;
	
	private ECategory category;
	
	
}
