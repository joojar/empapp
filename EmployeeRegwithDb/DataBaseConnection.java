package EmployeeRegwithDB;


import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DataBaseConnection 
{
	static Connection conn;
	static Statement stm;
	PreparedStatement pst;
	ResultSet result;
	
	public static void getConnection() throws ClassNotFoundException, SQLException
	{	String dbURL = "jdbc:mysql://localhost:3306/emp" ;
		String username = "root";
		String password = "";	
//		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//		conn=DriverManager.getConnection("jdbc:jtds:sqlServer://localhost:1433;databaseName=HRdb","sa","123");
		conn= DriverManager.getConnection(dbURL, username, password);	
		stm=conn.createStatement();
	}
	
	public void AddEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		getConnection(); 
		String sql="insert into EmployeeTB(EmpName,Nrcno,Address,Salary,Rank,Department,Gender) "
                        + "                         values('"+emp.getEmpname()+"','"+emp.getNrcno()+"','"+emp.getAddress()+"',"+
                                                        emp.getSalary()+",'"+emp.getRank()+"','"+emp.getDepartment()+"','"+emp.getGender()+"')";
		int i=stm.executeUpdate(sql);
		if(i>0)
		{
			System.out.println("Insert OK!");
		}
		conn.close();
	}

	public Employee getDatabyID(int empid) throws ClassNotFoundException, SQLException
	{
		getConnection();
		//ArrayList<Employee> list=new ArrayList<Employee>();
		String query="Select Rank,Salary,Department from EmployeeTB where Empid="+empid;
		result=stm.executeQuery(query); 
		Employee emp=new Employee();
        while(result.next())
		{
        	emp.setRank(result.getString(1));
        	emp.setSalary(result.getInt(2));
        	emp.setDepartment(result.getString(3));
		}
        conn.close();
		return emp;
    }
	
	public void Update(Employee emp) throws ClassNotFoundException, SQLException
	{
		getConnection();
		String sql="Update EmployeeTB set Rank='"+emp.getRank()+"', Salary="+emp.getSalary()+
                                                    " ,Department='"+emp.getDepartment()+"' where Empid="+emp.getEmpid()+"";
		int i=stm.executeUpdate(sql);
		if(i>0)
			System.out.println("Update Employee OK!");
		conn.close();
	}
	
	 public String[] getAllEmpid() throws ClassNotFoundException, SQLException
		{
			getConnection();
			ArrayList<String> list=new ArrayList<String>();
			String sql="Select Empid from EmployeeTB";
			result=stm.executeQuery(sql);
			while(result.next())
			{
				list.add(result.getString(1));
			}
			String[] Empid=list.toArray(new String[list.size()]);
			conn.close();
			return Empid;
		}
	 public String[] getAllRank() throws ClassNotFoundException, SQLException
		{
			getConnection();
			ArrayList<String> list=new ArrayList<String>();
			String sql="Select distinct(Rank) from EmployeeTB";
			result=stm.executeQuery(sql);
			while(result.next())
			{
				list.add(result.getString(1));
			}
			String[] rank=list.toArray(new String[list.size()]);
			conn.close();
			return rank;
		}
	 
	 public String[] getAllDept() throws ClassNotFoundException, SQLException
		{
			getConnection();
			ArrayList<String> list=new ArrayList<String>();
			String sql="Select distinct(Department) from EmployeeTB";
			result=stm.executeQuery(sql);
			while(result.next())
			{
				list.add(result.getString(1));
			}
			String[] dept=list.toArray(new String[list.size()]);
			conn.close();
			return dept;
		}
	 
	public void Delete(int empid) throws ClassNotFoundException, SQLException
	{
		getConnection();
		String sql="Delete from EmployeeTB where Empid="+empid;
		int i=stm.executeUpdate(sql);
		if(i>0)
			System.out.println("Delete Employee OK!");
		conn.close();
	}
	
	public String[][] getAllData() throws ClassNotFoundException, SQLException
	{
		getConnection();
		ArrayList<Employee>  list=new ArrayList<Employee>();
		String query="select * from EmployeeTB";
		result=stm.executeQuery(query);
		while(result.next())
		{
			Employee emp=new Employee();
			emp.setEmpid(result.getInt(1));
			emp.setEmpname(result.getString(2));
			emp.setAddress(result.getString(4));
			emp.setSalary(result.getInt(5));
			emp.setRank(result.getString(6));
			emp.setDepartment(result.getString(7));
			list.add(emp);
		}
		String[][] data=new String[list.size()][6];
		for(int i=0;i<list.size();i++)
		{
			Employee emp=list.get(i);
			data[i][0]=String.valueOf(emp.getEmpid());
			data[i][1]=emp.getEmpname();
			data[i][2]=emp.getAddress();
			data[i][3]=String.valueOf(emp.getSalary());
			data[i][4]=emp.getRank();
			data[i][5]=emp.getDepartment();
		}
		conn.close();
		return data;
	}
	public String[][] getDatabyDept(String dept) throws ClassNotFoundException, SQLException
	{
		getConnection();
		ArrayList<Employee>  list=new ArrayList<Employee>();
		String query="select * from EmployeeTB where Department='"+dept+"'";
		result=stm.executeQuery(query);
		while(result.next())
		{
			Employee emp=new Employee();
			emp.setEmpid(result.getInt(1));
			emp.setEmpname(result.getString(2));
			emp.setAddress(result.getString(4));
			emp.setSalary(result.getInt(5));
			emp.setRank(result.getString(6));
			emp.setDepartment(result.getString(7));
			list.add(emp);
		}
		String[][] data=new String[list.size()][6];
		for(int i=0;i<list.size();i++)
		{
			Employee emp=list.get(i);
			data[i][0]=String.valueOf(emp.getEmpid());
			data[i][1]=emp.getEmpname();
			data[i][2]=emp.getAddress();
			data[i][3]=String.valueOf(emp.getSalary());
			data[i][4]=emp.getRank();
			data[i][5]=emp.getDepartment();
		}
		conn.close();
		return data;
	}
}
