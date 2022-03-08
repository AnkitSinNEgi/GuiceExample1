package com.DrawingApp.main;

import com.DrawingApp.Requests.SquareRequest;
import com.DrawingApp.Services.DrawShape;
import com.DrawingApp.Services.DrawSquare;
import com.DrawingApp.module.AppModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo 
{

	private static final String SQUARE_REQ ="SQUARE";
	
 private static void sendRequest(String squareReq)
   {
		if(squareReq.contains(SQUARE_REQ))
		{
//			
//			Injector injector = Guice.createInjector(new AppModule());
//			DrawShape d= injector.getInstance(DrawShape.class);
//			SquareRequest request = new SquareRequest(d);
//			request.makeRequest();
//			

			Injector injector = Guice.createInjector(new AppModule());
			SquareRequest request = injector.getInstance(SquareRequest.class);
			request.makeRequest();
			
			
		}
		
	}

 public static void main(String[] args) {
		
		sendRequest(SQUARE_REQ);

	}
}
