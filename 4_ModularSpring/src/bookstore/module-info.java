module bookstore {
	requires books.api;

	requires spring.context;

	exports bookstore.api.service;
	exports dynamic bookstore.impl.service;
}