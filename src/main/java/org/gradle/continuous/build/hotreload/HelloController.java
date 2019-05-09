package org.gradle.continuous.build.hotreload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public Foo hello(@PathVariable String name) {
//        return "Hello" + name;
        return new Foo(name);
    }

    private static class Foo {

        private String name;

        private Foo(String name) {
            this.name = name;
        }

        public String getName() {

            return name;
        }
    }

}
