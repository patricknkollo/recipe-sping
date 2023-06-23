package com.acn.shayanNfriends.recipe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpleController {

	public ExpleController() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	
   @GetMapping("/janea")
	public List<String> myPlayer(){
		
		String player1 = "eto'o";
		String player2 = "drogba";
		String player3 = "ronaldo";
		String player4 = "ronaldinho";
		List<String> result = new ArrayList<String>();
		result.add(player1);
		result.add(player2);
		result.add(player3);
		result.add(player4);
		
		return result;
		
	}
   
   @GetMapping("/hello")
   public String hello() {
	   return new String ("hello welcome to my channel ! ");
   }
	
}
