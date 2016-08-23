module books.impl {
	requires books.api;

	requires java.naming;
	requires spring.tx;
	requires javax.inject;
	requires hibernate.core;
	requires hibernate.jpa;
	
	exports dynamic books.impl.entities;
	exports dynamic books.impl.service;
}