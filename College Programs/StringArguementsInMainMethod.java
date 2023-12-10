
// why often we write main(String[] args)?
// passing String[] args as a parameter allows us to pass arguments from command line
// as we have already compiled and create StringArguementsInMainMethod.class file
// write java StringArguementsInMainMethod I am learning Java Programming in the terminal
// always check if you are in the correct directory while running command from terminal


// Java is two-staged system
// we first create StringArguementsInMainMethod.java file >>>> then compiled it with the command javac StringArguementsInMainMethod.java
// The above command creates a class file - i.e. bytecode representation
// Now we can run the command java StringArguementsInMainMethod >>>> now the file will interpret and we can see the output 

public class StringArguementsInMainMethod{


    public static void main(String[] args) {
        for(int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}