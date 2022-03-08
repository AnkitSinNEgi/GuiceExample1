package com.DrawingApp.module;

import com.DrawingApp.Requests.SquareRequest;
import com.DrawingApp.Services.DrawShape;
import com.DrawingApp.Services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{

	 @Override
		protected void configure()
		{
		 bind(DrawShape.class).to(DrawSquare.class);
	
		}
}
