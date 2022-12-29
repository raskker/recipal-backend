package com.recipal.recipal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipal.recipal.entities.Ingredient;
import com.recipal.recipal.services.IngredientService;

@RestController
@CrossOrigin
public class IngredientController {

	public IngredientController(IngredientService ingredService) {
		this.ingredService = ingredService;
	}

	private IngredientService ingredService;

	@GetMapping("/ingredients")
	public List<Ingredient> getAllIngredients() {
		return ingredService.getAllIngredients();
	}

	@PostMapping("/addingredient")
	public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
		return ingredService.saveIngredient(ingredient);
	}

}
