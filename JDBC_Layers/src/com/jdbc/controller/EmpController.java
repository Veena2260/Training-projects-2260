package com.jdbc.controller;

import java.util.ArrayList;

import com.jdbc.model.Emp;
import com.jdbc.model.EmpOper;

public class EmpController
{

	public static boolean addEmployee(int eno,String nam,String job,float sal,int dno)
	{
		Emp e=new Emp(eno,nam,job,sal,dno);
		if(EmpOper.addEmployee(e))
			return true;
		return false;
		
	}
	public static boolean updateBySalEmpno(int empno, float newsal)
	{
		Emp emp = new Emp();
		emp.setEmpno(empno);
		emp.setSal(newsal);
		if(EmpOper.updateSalByEmpno(emp))
			return true;
		else
			return false;
	}
	public static ArrayList<Emp> showAllEmployees()
	{
		ArrayList<Emp> arr=new ArrayList<Emp>();
		arr=EmpOper.showAllEmployees();
		return arr;
//		
//		
//		
//		ArrayList newarr=new ArrayList();
//		
//		for(Emp obj: arr)
//		{
//		String emprow[]=new String[5];
//		emprow[0]=String.valueOf(obj.getEmpno());
//		emprow[1]=String.valueOf(obj.getEname());
//		emprow[2]=String.valueOf(obj.getJob());
//		emprow[3]=String.valueOf(obj.getSal());
//		emprow[4]=String.valueOf(obj.getDeptno());
//		newarr.add(emprow);
//		}
	
		
		
	}
}

