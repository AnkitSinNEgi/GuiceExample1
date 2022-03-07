package com.DrawingApp.main;

import com.DrawingApp.Requests.SquareRequest;
import com.DrawingApp.Services.DrawShape;
import com.DrawingApp.Services.DrawSquare;

public class GuiceDemo 
{

	private static final String SQUARE_REQ ="SQUARE";
	
 private static void sendRequest(String squareReq)
   {
		if(squareReq.contains(SQUARE_REQ))
		{
			DrawShape d= new DrawSquare();
			SquareRequest request = new SquareRequest(d);
			request.makeRequest();
		}
		
	}

 public static void main(String[] args) {
		
		sendRequest(SQUARE_REQ);

	}
}
