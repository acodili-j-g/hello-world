# Hello, World! in Java

## Prerequisite

To run java code, you must have Java 8 or newer installed. If you aren't that picky, you may install it from here: https://adoptium.net/temurin/releases/. After installation, you may run `java --version` on the command line (e.g. Command Prompt or Powershell for Windows) to validate; running the command should print the version of java on the command line.

## Compilation

To compile the source do the following:

 1. Create the `bin` directory
 2. Open the command line in the directory containing both the `bin` and `src` directory
 3. Run `javac -d "./bin/" src/com/example/Main.java` on the command line
 4. Check the `bin` directory for changes

To run the compiled sources:

 1. Open the command line in the `bin` directory
 2. Run `java com.example.Main`
 3. The command line should print out `Hello, World!`

To run without compilation (Java 11+)

 1. Open the command line in the `src` directory
 2. Run `java com.example.Main.java`
 3. The command line should print out `Hello, World!`
