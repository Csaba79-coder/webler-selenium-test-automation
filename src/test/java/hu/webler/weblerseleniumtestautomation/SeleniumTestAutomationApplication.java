package hu.webler.weblerseleniumtestautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class SeleniumTestAutomationApplication {

    public static void main(String[] args) {
        SpringApplication.from(WeblerSeleniumTestAutomationApplication::main).with(SeleniumTestAutomationApplication.class).run(args);
    }
}
