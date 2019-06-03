package tacos.data;

import tacos.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();
	
	Ingredient findOne(Long id);
	
	Ingredient save(Ingredient ingredient);
}
