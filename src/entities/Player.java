package entities;

import buildings.Home;
import buildings.furnishings.Furnishing;

public class Player {
	private String name;
	private int money;
	private int smilies;
	private Home home;

	public Player() {
		this.name = "";
		this.money = 250;
		this.smilies = 0;
		this.home = new Home();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getSmilies() {
		return this.smilies;
	}

	public void setSmilies(int smilies) {
		this.smilies = smilies;
	}

	public void buy(Furnishing f) {
		this.home.addFurnishing(f);
		this.money -= f.getCost();
	}
}
