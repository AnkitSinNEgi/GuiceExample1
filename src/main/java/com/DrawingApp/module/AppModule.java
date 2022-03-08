package com.DrawingApp.module;

import com.DrawingApp.Annnotations.ColourValue;
import com.DrawingApp.Annnotations.*;
import com.DrawingApp.Requests.SquareRequest;
import com.DrawingApp.Services.DrawShape;
import com.DrawingApp.Services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{

	 @Override
		protected void configure()
		{
		 bind(DrawShape.class).to(DrawSquare.class);
		 bind(String.class).annotatedWith(ColourValue.class).toInstance("Red");
		 bind(Integer.class).toInstance(40);
	
		}
}
