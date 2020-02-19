package com.techlabs.icrudabletest;

import com.techlabs.addressdb.AddressDb;
import com.techlabs.customerdb.CustomerDb;
import com.techlabs.icrudable.ICrudable;
import com.techlabs.invoicedb.InvoiceDb;

public class ICrudableTest {
	public static void main(String[] args) {
		
		ICrudable addressDb = new AddressDb();
		ICrudable customerDb = new CustomerDb();
		ICrudable invoiceDb = new InvoiceDb();
		
		printInfo(addressDb);
		printInfo(customerDb);
		printInfo(invoiceDb);
	}
	
	public static void printInfo(ICrudable crudable) {
		
		crudable.create();
		crudable.read();
		crudable.update();
		crudable.delete();
		System.out.println();
	}
}
