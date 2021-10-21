package com.jdbc.contoller;

import java.util.ArrayList;

import com.jdbc.model.Emp;
import com.jdbc.model.Empoper;

public class EmpController
{

	public static boolean addEmployee(int eno,String nam,String job,float sal,int dno)
	{
		Emp e=new Emp(eno,nam,job,sal,dno);
		if(Empoper.addEmployee(e))
			return true;
		return false;
		
	}
	
	public static ArrayList<Emp> showAllEmployees()
	{
		ArrayList<Emp> arr=new ArrayList<Emp>();
		arr=Empoper.showAllEmployees();
		return arr;	
		
	}
	public static boolean updatebysalempno(int empno, float newsal)
	{
		Emp e=new Emp();
		e.setEmpno(empno);
		e.setSal(newsal);
		if(Empoper.updateSalByEmpno(e))
		  return true;
		else
		return false;
	}
	
	
	
}