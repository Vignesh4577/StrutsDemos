package com.studentapp.actions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.studentapp.model.Student;

public class StudentAction extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> hobbies;
	private Student student;
	
	Map<String, Object> appSession;
	Logger logger = Logger.getLogger(StudentAction.class);
	
	
	@Override
	public void setSession(Map<String, Object> session) {
		//a session ref is initialization. Now values can set in session
		appSession= session;
		
	}

	public StudentAction() {
		logger.info("initializing the checkbox");
          hobbies = Arrays.asList("sports","music","dance");
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public String display() {
		logger.info("displaying");
		return NONE;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		/*if(!student.getName().equals("jack")) {
			throw new Exception();
		
		if(student.getAge()<=0) 
			throw new NullPointerException("exception....");*/
		
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("message", "Happy weekend");
		hashMap.put("fruits",  Arrays.asList("dragonfruit","orange","chikku"));
	
		//get the valuesatck object
		ValueStack stack = ActionContext.getContext().getValueStack();
		//push the mapdata into the stack
		stack.push(hashMap);
		
		//setting the value in session
		appSession.put("message", "Have a great day");
		appSession.put("fruits", Arrays.asList("apple","kiwi","mango"));
		return SUCCESS;
	}

	
	
	

}
