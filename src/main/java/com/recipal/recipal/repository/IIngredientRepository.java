package com.recipal.recipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipal.recipal.entities.Ingredient;

public interface IIngredientRepository extends JpaRepository<Ingredient, Long> {

}
