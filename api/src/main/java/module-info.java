module simpleapp.api {

	requires simpleapp.persistence;
	requires simpleapp.services;

	requires java.persistence;
	requires lombok;
	requires org.apache.tomcat.embed.core;
	requires org.mapstruct;
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.data.commons;
	requires spring.security.config;
	requires spring.security.core;
	requires spring.security.web;
	requires spring.web;

	opens com.jlink.example to spring.core;
	opens com.jlink.example.config to spring.core;

}