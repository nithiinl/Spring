package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;


@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMPS_BY_DESGS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmpByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESGS)){
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try(ResultSet rs=ps.executeQuery()){
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEid(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					
					list.add(emp);
				}
			}
			
			
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		
		return null;
	}

}
