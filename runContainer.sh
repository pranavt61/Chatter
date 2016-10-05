echo "parameters:"
echo "	1)docker image:tag(req)"
git pull origin master
sh compileJava.sh $1
sh buildContainer.sh $1
docker run -it --rm -p 8888:8080 $1
