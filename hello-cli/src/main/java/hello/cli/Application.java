package hello.cli;

import io.micronaut.context.ApplicationContext;

public class Application {

    public static void main(String[] args) {
        System.setProperty("micronaut.cloud.platform", "OTHER");

        try(ApplicationContext context = ApplicationContext.build()
                .environments("cli")
                .mainClass(Application.class)
                .start()) {
        }
    }
}