module bookapp {
	requires spring.context;
	requires spring.tx;
	
	requires javax.inject;
	
	requires hibernate.core;
	requires hibernate.jpa;
	
	requires java.naming;	
}