so there are a couple of things that need to happen here.
-1) ask me if you have any questions about this stuff
0) you need git so you can do github
1) you need a github account so we can share this stuff(let me know your account name so i can add you to the repository)
2)get an ide
       intellij is a really nice ide (where you write code) i recommend it, but if you want to find a different one that is fine it doesn't really matter
3) figure out what we need to do put it in goals.txt/read goals.txt
4) also if you have those dump files of data from whenever ago you should commit it to the github
*******************************************************************

HELPFUL INFORMATION

1) //<- this is how you comment out a line
2) /* <- this is how you start a block comment */ <-- this is how you end it. everything in between those two things will be commented out
3) /** <- this is a javadoc comment, in intellij it will show up as green it should be put over all methods that you write like this
4)//todo will highlight what you put after it and put it in a todo thing that you can search in intellij(and probably other ide's)
/**
* This line is a description of what this method does
* This line is a description of what the method returns
* @param foo this is a description of what the method parameter foo is used for and should be
* @author joseph bermingham (we don't really need this as it is just you and me, but its good practice in school group projects when the professor reads your code
**/
public void ExampleMethod(int foo){
...
}

5) the creation of methods

the line that declares the method goes as such

visibility returnType nameOfMethod(Input1Type Input1Name, Input2Type input2Name, .....){
    Contents of method
    if the method returnType is not void it must have a return line in it
    return VariableMatchingReturnType
}


so there are 4 visibility descriptors
https://stackoverflow.com/questions/215497/in-java-difference-between-package-private-public-protected-and-private
    public- anyone can see it
    private - only things in that class can see it
    protected - only things in the same package can see it
     - (blank) this is a different version of package private that we probably wont need to worry about


Return Type
    This can be anything that we care about Some common ones are
    int- an intiger
    double - a decimal number
    String - a string of characters (typically called words)
    void - return nothing
    boolean - true or false

Name of method
    the name of the method should be indicative of what it does
    THE SAME GOES WITH VARIABLES RESIST THE DESIRE TO NAME ALL OF YOUR VARIABLES LETTERS LIKE "A" OR "T" IT IS VERY UNHELPFUL IN THE LONG TERM

The contents of a method
    most every line requires a semicolin after it;

    the IF statement
        if(BOOLEAN STATEMENT){
        if statement is true this executes
        }else{
        The else is optional but when the if is false this will execute
        }

Other information exists but this is probably what we need to get you started

Useful key commands
CTL+ALT+l   Reformats the code you are looking at. proper indentation makes code more readable
