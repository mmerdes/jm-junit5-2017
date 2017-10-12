package com.example;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.*;
import java.util.List;
import java.util.stream.Stream;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TestTemplateDemo {

    @TestTemplate
    @ExtendWith(InvocationContextProvider.class)
    void testTemplate(Long number) {
        System.out.println("injected Parameter = " + number);
        assertTrue( number % 2 == 0);
    }

}

class InvocationContextProvider implements TestTemplateInvocationContextProvider {

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return true;
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
        return Stream.of(new InvocationContext(), new InvocationContext(), new InvocationContext());
    }
}

class InvocationContext implements TestTemplateInvocationContext {

    @Override
    public String getDisplayName(int invocationIndex) {
        return "Invocation [" + invocationIndex + "]";
    }

    @Override
    public List<Extension> getAdditionalExtensions() {
        return asList(new ParameterResolver() {

            @Override
            public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                return true;
            }
            @Override
            public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                return System.currentTimeMillis();
            }
        });

    }

}