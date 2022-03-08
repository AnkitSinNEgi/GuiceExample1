package com.DrawingApp.Requests;

import com.DrawingApp.Services.DrawShape;
import com.google.inject.Inject;

public class SquareRequestSubClass extends SquareRequest {
	@Inject
	public SquareRequestSubClass(DrawShape d) {
		super(d);
		
	}
  @Override
  public void makeRequest()
	{
	  System.out.println("Deligating call to draw method :");
		d.draw();
	}
}
