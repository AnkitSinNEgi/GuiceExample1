package com.DrawingApp.Requests;

import com.DrawingApp.Services.DrawShape;

public class SquareRequest {
		DrawShape d;
		
		public SquareRequest(DrawShape d)
		{
			this.d =d;
		}
		public void makeRequest()
		{
			d.draw();
		}
}
