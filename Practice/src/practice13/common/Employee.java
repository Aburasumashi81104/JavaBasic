package practice13.common;

public class Employee extends Person {

	private String departmentNm;
	private int departmentCnt;

	public String getDepartmentNm() {
		return departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public int getDepartmentCnt() {
		return departmentCnt;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}


	public String showParameter() {
		StringBuilder str = new StringBuilder();

		str.append("名　前：" + this.userNm);
		str.append("\n");
		str.append("部　署：" + this.departmentNm);
		str.append("\n");
		str.append("人　数：" + this.departmentCnt);
		str.append("\n");
		str.append("UserID：" + this.userId);
		str.append("\n");
		str.append("PASSWORD：" + this.password);
		str.append("\n");
		str.append("Mail：" + this.mail);
		str.append("\n");


		return str.toString();
	}

}
