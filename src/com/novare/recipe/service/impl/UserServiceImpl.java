package com.novare.recipe.service.impl;

import java.util.List;

import com.novare.recipe.form.BaseForm;
import com.novare.recipe.model.Recipe;
import com.novare.recipe.service.IUserService;

/**
 * This is the UserServiceImpl class which implements IUserService interface.It
 * implements all the methods of the interface.
 *
 */
public class UserServiceImpl implements IUserService {

	@Override
	public Recipe viewRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipe> getAllrecipes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipe> viewRecipeWeek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipe> generateRecipeWeek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseForm handleOption(int selectedOption) {
		return null;
	}

	@Override
	public List<String> getMenuOptions() {
		return List.of("Create Recipe", "View Recipe", "All Recipes");
	}

}
