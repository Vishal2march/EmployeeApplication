package Emp.dao.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import Emp.Datacon.Datacon;
@SuppressWarnings("deprecation")
public interface DatabaseConnection {

    Resource  res = new ClassPathResource("Datacon.xml"); 
    BeanFactory  factory = new   XmlBeanFactory(res); 
	Datacon bean1 = (Datacon) factory.getBean("datacon");
	DataSource ds=bean1.dbcon();
	JdbcTemplate jt=new JdbcTemplate(ds);
	DataSourceTransactionManager txManager = new DataSourceTransactionManager(ds);
}
