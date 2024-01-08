package hamthoi;

import java.beans.Statement;	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.checkerframework.common.reflection.qual.NewInstance;

public class main {

	public static void main(String args[]) {
		try {
			// connnect to database 'jlos'
			Connection conn = getConnection("jdbc:mysql://10.14.107.5:3307/jlos", "onboarding", "onboarding123");
			// tạo query truy vấn
			java.sql.Statement stmt = conn.createStatement();
			// get data from table 'config'
			// tạo điều kiện để add vào câu query
			int saleId = 55;
			// lấy dữ liệu từ câu query
			String sqlQuery = "select * from loan_application where sale_id = " + saleId;

			// gọi query
			ResultSet rs = stmt.executeQuery(sqlQuery.toString());

			// tạo list LoanApplicationDTO rỗng
			List<LoanApplicationDTO> loanApps = new ArrayList<LoanApplicationDTO>();
			while (rs.next()) { // Mỗi lần duyệt qua một phần tử của result set
				// Tạo mới một đối tượng LoanApplicationDTO
				LoanApplicationDTO loanDto = new LoanApplicationDTO();
				loanDto.setSaleId(rs.getInt("sale_id"));
				loanDto.setLoanId(rs.getString("id"));
				loanDto.setStatus(rs.getString("ma_trang_thai_ho_so"));
				loanDto.getSaleId();
				// Thêm đối tượng đó vào list LoanApplicationDTO
				loanApps.add(loanDto);
				loanDto.getSaleId();
			}
			// show list
			System.out.println(loanApps);
			
			// đóng connection với DB
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static Connection getConnection(String dbURL, String userName, String password) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, userName, password);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}

}
