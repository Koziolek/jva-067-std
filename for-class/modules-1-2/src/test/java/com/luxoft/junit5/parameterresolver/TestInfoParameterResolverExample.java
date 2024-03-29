package com.luxoft.junit5.parameterresolver;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestInfoParameterResolverExample {
    @Test
    void shouldRecognizeNameOfTheMethod(TestInfo testInfo) {
        assertEquals("shouldRecognizeNameOfTheMethod(TestInfo)", testInfo.getDisplayName());
    }

    @Test
    @DisplayName("should recognize name of the method")
    void shouldRecognizeNameOfTheMethodWithDisplayNameAnnotation(TestInfo testInfo) {
        assertEquals("should recognize name of the method", testInfo.getDisplayName());
    }

}
