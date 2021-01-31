module simpleapp.services {

	exports com.jlink.example.service;

	requires transitive simpleapp.model;
	requires transitive simpleapp.persistence;

	requires lombok;
	requires org.slf4j;
	requires spring.context;
	requires transitive spring.data.commons;
	requires spring.data.jpa;

}
