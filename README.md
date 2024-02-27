# DataprocessingTool

DataprocessingTool is a project consisting of two programs designed for data manipulation. These programs facilitate the creation, processing, and storage of structured data, allowing users to seamlessly manage information.

## Program 1: Data Structure Generation and File Creation

Project A provides functionality for handling 2D arrays, including creating and filling arrays, converting arrays to strings, and saving arrays to files.

### Classes

#### ArrayHandler
- Provides methods for handling 2D arrays.
- createFillArray(int n, int m): Creates and fills a 2D array using a given formula.
- getStringBuilder(double[][] arrayA): Converts a 2D array into a StringBuilder containing formatted string representations of the elements.

#### ConsoleManager
- Handles user input in the console.
- userIntInput(char name, int lowerBound, int upperBound): Organizes a dialogue with the user for entering dimensions of the array.
- readValidFileName(): Reads a file name from the user, checking for invalid characters.

#### FileManager
- Provides methods for handling file-related operations.
- saveArrayToFile(StringBuilder stringBuilder): Saves the content of a StringBuilder to a file after obtaining a valid filename from the user.

#### MainA
- Main class for executing Program A.
- Allows the user to input dimensions for the array, creates and fills the array, converts it to a string, and saves it to a file.

## Program 2: Data File Reading and Processing

Project B focuses on reading arrays from files, performing specific operations on arrays, and printing arrays to the console.

### Classes

#### ArrayHandler
- Provides methods for handling 2D arrays specific to Project B.
- createArrayB(String strNumbers): Creates a 2D array from a string representation of numbers.
- mirrorExchange(double[][] matrix): Mirrors the exchange of rows and columns in a matrix.

#### ConsoleManager
- Handles console input and output specific to Project B.
- readValidFileName(): Reads a file name from the user, checking for invalid characters.
- printArray(double[][] array): Prints the 2D array to the console.

#### FileManager
- Handles file-related operations for reading arrays from a file.
- readArrayFromFile(): Reads an array from a file.

#### MainB
- Main class for executing Program B.
- Allows the user to read an array from a file, perform operations on it, and print the original and modified arrays to the console.

## Instructions for Running the Programs

1. Compile all Java files in the com.hse.projecta and com.hse.projectb packages.
2. Run MainA to execute Program A or MainB to execute Program B.
3. Follow the on-screen prompts to interact with the programs.
   
Note: Follow on-screen prompts and instructions for seamless operation.

Feel free to reach out for any further assistance or clarification.

Happy data processing! 🚀
