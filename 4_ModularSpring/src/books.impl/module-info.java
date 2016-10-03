module books.impl {
	requires books.api;

	requires java.naming;
	requires spring.tx;
	requires javax.inject;
	requires hibernate.core;
	requires hibernate.jpa;
	
	exports private books.impl.entities;
	exports private books.impl.service;
}