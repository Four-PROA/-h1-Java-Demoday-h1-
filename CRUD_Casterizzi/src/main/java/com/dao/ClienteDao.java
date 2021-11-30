package com.cadastrocliente.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cadastrocliente.bean.Cliente;
public class ClienteDao {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://35.223.99.245:3306/demoday","root","HKrd4mL6c5624PF8");
	}catch(Exception e) {System.out.println(e);}
	return con;
}
public static int save(Cliente u) {
	int status=0;
	try {
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into demo_clientes(nome,senha,email,telefone_principal) values(?,?,?,?)");
		ps.setString(1,u.getNome());
		ps.setString(2,u.getSenha());
		ps.setString(3,u.getEmail());
		ps.setString(4,u.getTelefone_principal());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}

}
