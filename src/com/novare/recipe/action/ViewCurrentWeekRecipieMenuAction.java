package com.novare.recipe.action;

import com.novare.recipe.controller.UserController;
import com.novare.recipe.service.impl.UserServiceImpl;
import com.novare.recipe.util.MenuContext;
import com.novare.recipe.view.UserView;

public  class ViewCurrentWeekRecipieMenuAction  extends BaseMenuAction{

	@Override
	public void execute() throws Exception {
		UserServiceImpl model = new UserServiceImpl();
		UserView view = new UserView();
		UserController controller = new UserController(model, view);
		controller.requestUserInput(MenuContext.VIEW_CURRENT_WEEK_RECIPIE);
	}
	}

	
