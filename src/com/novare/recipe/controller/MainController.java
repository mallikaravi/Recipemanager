package com.novare.recipe.controller;

import com.novare.recipe.form.BaseForm;
import com.novare.recipe.service.IRecipeService;
import com.novare.recipe.view.MainView;

public class MainController extends BaseController {

	private final IRecipeService model;
	private final MainView view;

	public MainController(IRecipeService model, MainView view) {
		super();
		this.model = model;
		this.view = view;
	}

	@Override
	public BaseForm requestUserInput() {
		view.setMenuOptions(model.getMenuOptions());
		String input = getUserTerminal().nextLine();
		try {
			int selectedOption = Integer.parseInt(input);
			return model.handleOption(selectedOption);
		} catch (NumberFormatException | IndexOutOfBoundsException exception) {
			view.printInvalidOption();
			view.printRequest();
			return requestUserInput();
		}
	}

}
