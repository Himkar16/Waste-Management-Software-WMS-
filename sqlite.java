package soft;
import java.sql.*;
import javax.swing.*;
public class sqlite {
	Connection conn=null;
	public static Connection connect()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Himanshu Patankar\\Desktop\\database1.sqlite");
			//JOptionPane.showMessageDialog(null,"connection successsful");
			return conn;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}

}
