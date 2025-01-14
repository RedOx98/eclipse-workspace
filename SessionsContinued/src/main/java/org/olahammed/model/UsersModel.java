package org.olahammed.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.olahammed.config.DatabaseConfig;
import org.olahammed.entity.User;

public class UsersModel {
    public List<User> listuser() {
        List<User> listusers = new ArrayList<User>();
        Connection connect = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // STEP 1 --> Connection objects initialization
            connect = DatabaseConfig.getConnection();

            // Step 2: Create the DB query
            String query = "SELECT * FROM user";

            // Step 3 --> Executing the statement
            if (connect != null) {
                stmt = connect.createStatement();
                rs = stmt.executeQuery(query);

                while (rs.next()) {
                    listusers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email")));
                }
            } else {
                System.err.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
//        finally {
//            // Close ResultSet
//            if (rs != null) {
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            // Close Statement
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            // Close Connection
//            if (connect != null) {
//                try {
//                    connect.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        return listusers;
    }

    public void addUser(User newUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		
		try {
			connect = DatabaseConfig.getConnection();
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			String query = "insert into user (username, email) values (?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
    
    public void updateUser(User updatedUser) {
    	Connection connect = null;
    	PreparedStatement statement = null;
    	
    	try {
			connect = DatabaseConfig.getConnection();
			int userId = updatedUser.getUser_id();
	        String username = updatedUser.getUsername();
	        String email = updatedUser.getEmail();
	        String query = "UPDATE user SET username = ?, email = ? WHERE user_id = ?";
	        statement = connect.prepareStatement(query);
	        statement.setString(1, username);
	        statement.setString(2, email);
	        statement.setInt(3, userId);
	        statement.executeUpdate(); // Use executeUpdate for update queries
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public void deleteUser(int userID) {
    	Connection connect = null;
    	PreparedStatement statement = null;
    	
    	try {
			connect = DatabaseConfig.getConnection();
			
			String query = "DELETE FROM user WHERE user_id = ?";
			statement = connect.prepareStatement(query);
			statement.setInt(1, userID);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
