package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Governor;

public class GovernorDAO {
	final static String URL = "jdbc:postgresql://localhost:5434/matching";
	final static String USER = "postgres";
	final static String PASSWORD = "test";

	public ArrayList<Governor> getAnswer() {
		ArrayList<Governor> governorList = new ArrayList<Governor>();
		try {
			/* postgreSQL接続に使用する情報*/
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;

			/* 2) JDBCドライバの定義 */
			Class.forName("org.postgresql.Driver");

			/* 3) PostgreSQLへの接続 */
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			st = con.createStatement();

			/* select文の準備*/
			String sql = "select name, q1, q2, q3, q4, q5 from governor";
			PreparedStatement pStmt = con.prepareStatement(sql);

			//sql文を実行し結果表を取得
			rs = pStmt.executeQuery();

			//select文の結果をArrayListに格納
			while (rs.next()) {
				String name = rs.getString("name");
				String q1 = rs.getString("q1");
				String q2 = rs.getString("q2");
				String q3 = rs.getString("q3");
				String q4 = rs.getString("q4");
				String q5 = rs.getString("q5");
				Governor g = new Governor(name, q1, q2, q3, q4, q5);
				governorList.add(g);
			}
			// PostgreSQLとの接続を切断 */
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		}
		return governorList;
	}



}
