package buildings;

import java.util.LinkedList;
import java.util.List;

import buildings.furnishings.Furnishing;

public abstract class Store extends Building {
	private List<Furnishing> goods;

	public Store() {
		this.goods = new LinkedList<Furnishing>();
	}

	public List<Furnishing> getGoods() {
		return this.goods;
	}

	public void addItem(Furnishing item) {
		this.goods.add(item);
	}

	public void addItems(List<Furnishing> items) {
		this.goods.addAll(items);
	}
}
