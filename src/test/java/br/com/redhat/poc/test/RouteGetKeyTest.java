package br.com.redhat.poc.test;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;

import br.com.redhat.poc.Application;

@PropertySource("classpath:application.properties")
public class RouteGetKeyTest extends CamelSpringTestSupport {

	protected AbstractApplicationContext createApplicationContext() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);

		return ctx;

	}

	// @Override
	public String isMockEndpointsAndSkip() {
		return "infinispan://*";
	}

	@Override
	public boolean isUseAdviceWith() {
		return false;
	}

	@Test
	
	public void call() throws Exception {

		template.sendBodyAndHeader("direct:getKey", "", "id", "1");

	}
	
}