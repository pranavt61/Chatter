sh compileJava.sh $1

#compile Test Classes
javac -cp ../lib/junit-4.12.jar:webapps/$1/WEB-INF/classes -d webapps/$1/JUnitTests/classes webapps/$1/JUnitTests/*.java

#run Test
java -cp ../lib/junit-4.12.jar:../lib/hamcrest-core-1.3.jar:webapps/$1/WEB-INF/classes:webapps/$1/JUnitTests/classes org.junit.runner.JUnitCore TestSuite