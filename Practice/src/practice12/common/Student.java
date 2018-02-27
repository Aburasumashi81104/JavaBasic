/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	public int studentId;

	/** 受講生氏名 */
	public String studentName;

	/** 会社名 */
	public String companyName;

	/** 教室名 */
	public String className;

	/** メールアドレス */
	public String mail;

	/** パスワード */
	public String password;

	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName(String studentName) {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getCompanyName(String companyName) {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getClassName(String className) {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}



	public String getMail(String mail) {
		return this.className;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}




	public String getPassWord(String password) {
		return this.password;
	}

	public void setPassWord(String password) {
		this.password = password;
	}

}
