package practice13.common;

public class SuperHero extends Hero {


	private Item equipment;

	/*equipmentのアクセサ*/
	public Item getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment= equipment;
	}

	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
		//Item型変数equipmentにはインスタンスが入ってる
		//インスタンスのadditionaldamageを持ってくる
	}




}
