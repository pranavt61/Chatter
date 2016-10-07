echo "Parameters:"
echo "	1)web app name(folder name in /webapps)"
javac -classpath ../lib/servlet-api.jar:../lib/junit-4.12.jar:webapps/$1/classes -d webapps/$1/WEB-INF/classes webapps/$1/src/*.java
