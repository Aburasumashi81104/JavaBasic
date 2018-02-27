package practice13.common;

public class SuperHero extends Hero {

	Item equipment;

	public Item getEquipment() {
		return this.equipment;
	}

	public void setName(Item quipment) {
		this.equipment= equipment;
	}

	public int attack() {

		return super.attack();
	}


}
