package com.customer.app.commons;

public interface DBQueries {
	String SELECT_ALL_CUSTMR = "SELECT ID, NAME, DESCRIPTION, CREATEDATE, CREATEDUSER, LASTMODIFIED, UPDATEDUSER FROM CUSTOMER";
	String SELECT_CUSTMR_BY_ID = "SELECT ID, NAME, DESCRIPTION, CREATEDATE, CREATEDUSER, LASTMODIFIED, UPDATEDUSER FROM CUSTOMER WHERE ID=:id";
	String INSERT_CUSTMR = "INSERT INTO CUSTOMER ( ID, NAME, DESCRIPTION, CREATEDATE, CREATEDUSER, LASTMODIFIED, UPDATEDUSER ) VALUES ( CUSMR_ID.nextval, :name, :description, :createdate, :createduser, :lastmodified, :updateduser )";
	String UPDTE_CUSTMR_BY_ID = "UPDATE customer SET name = :name, description = :description,  lastmodified = :lastmodified, updateduser = :updateduser WHERE id = :id";
	String DELTE_CUSTMR_BY_ID = "";
	String GET_CUSTR_WITH_MAX_ID="SELECT ID, NAME, DESCRIPTION, CREATEDATE, CREATEDUSER, LASTMODIFIED, UPDATEDUSER FROM CUSTOMER WHERE ID=(SELECT MAX(ID) FROM CUSTOMER )";
}
