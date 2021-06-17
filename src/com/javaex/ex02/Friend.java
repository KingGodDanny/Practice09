package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    //생성자

    public Friend() {
    	super();
    }
    
    
    public Friend(String name, String hp, String school) {
    	super();
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }
    
    
    
// getter/setter 작성


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}

	
	//메소드(일반)----------------------------------------

	public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
