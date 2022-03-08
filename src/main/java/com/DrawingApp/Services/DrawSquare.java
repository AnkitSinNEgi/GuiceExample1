package com.DrawingApp.Services;

import com.DrawingApp.Annnotations.ColourValue;
import com.DrawingApp.Annotations.EdgeValue;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape {
	
	
	private String colour;
	private Integer edge;
	
	@Inject
	public DrawSquare(@ColourValue String colour,@EdgeValue Integer edge) {
		super();
		this.colour = colour;
		this.edge = edge;
	}
	
	
	@Override
	public void draw()
	{
		System.out.println("Drawing Square of Colour : "+ colour + "edge of"+ edge);
	}
	

}
