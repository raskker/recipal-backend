package com.recipal.recipal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipal.recipal.entities.Ingredient;
import com.recipal.recipal.repository.IIngredientRepository;

@Service
public class IngredientService {

	@Autowired
	private IIngredientRepository repository;

	public IngredientService(IIngredientRepository repository) {
		this.repository = repository;
	}

	public Ingredient saveIngredient(Ingredient ingredient) {
		return repository.save(ingredient);
	}

	public List<Ingredient> saveAllIngredients(List<Ingredient> ingredients) {
		return repository.saveAll(ingredients);
	}

	public List<Ingredient> getAllIngredients() {
		return repository.findAll();
	}

	public Ingredient getIngredient(long id) {
		return repository.findById(id).orElse(null);
	}
}
