package com.custom.genertor.jpa.custom.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderDetailsGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		String prefix = "OD";
		String suffix = "";
		try {
			Connection connection = session.connection();
			Statement statement = connection.createStatement();
			String query = "select orger_id_seq.next_val from dual";
			ResultSet resultSet = statement.executeQuery(query);
			
			if(resultSet.next()) {
				int index = resultSet.getInt(1);
				 suffix = String.valueOf(index);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return prefix + suffix;
	}

}
