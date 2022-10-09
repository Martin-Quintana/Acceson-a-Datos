package iesteis.javafxjacksoncocktails.model;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Response {

	@JsonProperty("drinks")
	private List<DrinksItem> drinks;

	public List<DrinksItem> getDrinks(){
		return drinks;
	}


	public List<DrinksItem> getResults() {
		return getResults();
	}
}