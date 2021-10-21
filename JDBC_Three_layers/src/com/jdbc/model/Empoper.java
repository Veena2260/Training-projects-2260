package com.jdbc.model;

import java.util.ArrayList;

import com.jdbc.dao.EmpDao;

public class Empoper 
{

	public static boolean addEmployee(Emp obj)
	{
		if(obj.getSal()>10000 && obj.getSal()<500000)
		{
			
		}
		if(obj.getDeptno()==10 ||obj.getDeptno()==20 ||obj.getDeptno()==30 ||obj.getDeptno()==40)
		{
			
		}
		if(EmpDao.addEmployee(obj))
			return true;
		return false;
		
	}
	public static ArrayList<Emp> showAllEmployees()
	{
		ArrayList<Emp> arr= EmpDao.showAllEmployees();
		return arr;
	}
	
	public static boolean updateSalByEmpno(Emp obj)
	{
	if(EmpDao.updateSalByEmpno(obj))
	return true;
	else
	return false;
	}
}