package com.script.assessment;

import java.util.ArrayList;
import java.util.List;

public class CustomScriptInterpreter {

	public static void main(String[] args) {
		String script = """
				add 5 3
				concat Hello World
				merge [1,2,3] [4,5,6]
				split Hello,World ,
				""";

		executeScript(script);
	}

	public static void executeScript(String script) {
		String[] commands = script.strip().split("\\n");
		for (String command : commands) {
			Object result = switch (command.split(" ")[0]) {
			case "add" -> executeAdd(command);
			case "concat" -> executeConcat(command);
			case "merge" -> executeMerge(command);
			case "split" -> executeSplit(command);
			default -> "Unsupported command";
			};
			System.out.println(result);
		}
	}

	public static Integer executeAdd(String command) {
		String[] parts = command.split(" ");
		return Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]);
	}

	public static String executeConcat(String command) {
		String[] parts = command.split(" ");
		return parts[1] + " " + parts[2];
	}

	public static List<Integer> executeMerge(String command) {
		return new ArrayList<>(); // Placeholder
	}

	public static List<String> executeSplit(String command) {
		return new ArrayList<>(); // Placeholder
	}
}
