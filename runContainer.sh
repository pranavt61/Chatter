echo "parameters:"
echo "	1)docker image:tag(req)"
git pull origin master
rm webapps/$1/WEB-INF/classes/*.class
sh compileJava.sh $1
#if new class files are found, build and deploy container
[ -f webapps/$1/WEB-INF/classes/*.class ] && sh buildContainer.sh $1 && docker run -it --rm -p 8888:8080 $1 || echo "Compiltion error"