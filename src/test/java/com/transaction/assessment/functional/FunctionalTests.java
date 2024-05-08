package com.transaction.assessment.functional;

import static com.streams.assessment.testutils.TestUtils.businessTestFile;
import static com.streams.assessment.testutils.TestUtils.currentTest;
import static com.streams.assessment.testutils.TestUtils.yakshaAssert;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.script.assessment.CustomScriptInterpreter;

public class FunctionalTests {

	@Test
	public void testExecuteAdd() throws IOException {
		String testCommand = "add 5 10";
		Integer result = CustomScriptInterpreter.executeAdd(testCommand);
		yakshaAssert(currentTest(), result == 15 ? "true" : "false", businessTestFile);
	}
}