package com.tanmoy.ContactAddService.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tanmoy.ContactAddService.dbconnection.DatabaseConnection;
import com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact;

public class ContactRepository {

	private Connection connection = null;

	public int addContact(Contact contact) {
		connection = DatabaseConnection.getConnection();
		String query = "insert into contacts(first_name, last_name, email) VALUES (?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, contact.getFirstName());
			ps.setString(2, contact.getLastName());
			ps.setString(3, contact.getEmail());
			return ps.executeUpdate();
		} catch (SQLException e) {
			closeConnection();
			e.printStackTrace();
		}
		return 0;
	}

	public Contact findContact(int contactId) {
		connection = DatabaseConnection.getConnection();
		String query = "select * from contacts where id= ?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, contactId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				return Contact.newBuilder().setId(contactId).setFirstName(firstName).setLastName(lastName)
						.setEmail(email).build();
			}
		} catch (SQLException e) {
			closeConnection();
			e.printStackTrace();
		}
		return null;
	}

	private void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
