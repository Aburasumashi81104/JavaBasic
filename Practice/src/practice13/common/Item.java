package practice13.common;

public class Item {

	String name;
	int additionalDamage;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}



		public int getaddDamage() {
			return this.additionalDamage;
		}

		public void setaddDamage(int additionalDamage) {
			this.additionalDamage = additionalDamage;
		}


		Item(String name, int additionalDamage){
			this.name = name;
			this.additionalDamage = additionalDamage;
		}

}
