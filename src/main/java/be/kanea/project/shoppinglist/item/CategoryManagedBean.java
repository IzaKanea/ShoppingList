package be.kanea.project.shoppinglist.item;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@RequestScoped
@ManagedBean(name = "categoryManagedBean", eager = true)
public class CategoryManagedBean  implements Serializable {
	
	private static final long serialVersionUID = 509L;
	
	private Category category = new Category();
	private List<Category> categories;
	//private List<String> listOfName;
	private static Map<String, Object> listOfName;
	
	private int id;
	
	public CategoryManagedBean() {
		CategoryDAO categoryDAO = new CategoryDAO();
		this.categories = categoryDAO.selectAll();
		listOfName = new LinkedHashMap<String, Object>();
		for(Category category : categories) {
			listOfName.put(category.getName(),category.getId()); //label, value
			System.out.println(category.getId() + " - " + category.getName());
		}
	}

    public Map<String, Object> getList()
    {
        return listOfName;
    }
	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}	
