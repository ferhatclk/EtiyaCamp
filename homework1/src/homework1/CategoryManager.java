package homework1;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	
	private List<Category> categories;
	
	
	public CategoryManager() {
		categories = new ArrayList<>();
	}


	public void add(Category category) {
		categories.add(category);
	}
	
	public boolean ifCheckCategory(String categoryName){
		for (Category category : categories) {
			if(categoryName==category.getName()) {
				return true;
			}
		}
		return false;
	}
}
