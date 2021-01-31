module simpleapp.persistence {

	exports com.jlink.example.persistence.repository;

	requires simpleapp.model;

	requires java.persistence;
	requires lombok;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.data.commons;
	requires spring.data.jpa;

	opens com.jlink.example.persistence.config to spring.core;
	opens com.jlink.example.persistence.db.migration;

}
