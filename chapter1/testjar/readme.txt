put compiled class file in a classes directory
create manifest.txt. Put this in it -  Main-Class: Hello 
cmd  from classes dir

command prompt
jar -cvmf manifest.txt hello.jar *.class
java -jar hello.jar