FROM tomcat:8.0
MAINTAINER pthirunavukkarasu@pacific.edu

RUN apt-get update && apt-get install -yq apt-utils
RUN apt-get install -y git && apt-get install -y vim && apt-get clean

ADD conf/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml

#replace "servlet" with webapp name
ADD webapps/servlet/WEB-INF /usr/local/tomcat/webapps/servlet/WEB-INF
Add webapps/servlet/WEB-INF/classes/*.class /usr/local/tomcat/webapps/servlet/WEB-INF/classes/
ADD webapps/servlet/*.jsp /usr/local/tomcat/webapps/servlet/

ENTRYPOINT ["bash"]
