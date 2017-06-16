package Emp.Datacon;

import javax.sql.*;
public class Dataconimpl implements Datacon{
private DataSource dataSource;

public void setDataSource(DataSource ds){
	
	dataSource=ds;
}
	
	public DataSource dbcon(){
	
		return dataSource;
}
}
