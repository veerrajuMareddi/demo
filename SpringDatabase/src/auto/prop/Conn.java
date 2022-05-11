package auto.prop;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Conn
{
	@Value("${conn.url}")
	private String url;
	@Value("${conn.userName}")
	private String userName;
	@Value("${conn.password}")
	private String password;
	@Value("${conn.driver}")
	private String driverClass;
	
	
public void values()
{
	System.out.println("url from properties :"+url);
	System.out.println("userName from properties :"+userName);
	System.out.println("password from properties :"+password);
	System.out.println("driverClass"+driverClass);
}


	public void connection()throws Exception
	{
	System.out.println(url);
		String x =url;
		System.out.println(x);
		String Query="select * from office ";
        Class.forName(driverClass);
        Connection con =DriverManager.getConnection(url ,userName,password);
        Statement st=con.createStatement();
        ResultSet rt =st.executeQuery(Query);
		        
        int userdata;
       while( rt.next())
       {
        	 userdata=rt.getInt("salary");
        	System.out.println(userdata);
       } 
       
	
       st.close();
       con.close();
	}

}
