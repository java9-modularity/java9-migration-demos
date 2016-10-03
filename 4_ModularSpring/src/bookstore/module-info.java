module bookstore {
	requires books.api;

	requires spring.context;

	exports bookstore.api.service;
	exports private bookstore.impl.service;
}