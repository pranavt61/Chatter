FROM tomcat:8.0
MAINTAINER pthirunavukkarasu@pacific.edu

RUN apt-get update && apt-get install -yq apt-utils
RUN apt-get install -y git && apt-get install -y vim && apt-get clean

ADD conf/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml

#replace "chatter" with webapp name
ADD webapps/chatter/WEB-INF /usr/local/tomcat/webapps/chatter/WEB-INF
ADD webapps/chatter/WEB-INF/lib/jstl-1.2.jar /usr/local/tomcat/webapps/WEB-INF/lib/
Add webapps/chatter/WEB-INF/classes/*.class /usr/local/tomcat/webapps/chatter/WEB-INF/classes/
ADD webapps/chatter/*.jsp /usr/local/tomcat/webapps/chatter/
ADD webapps/chatter/*.js /usr/local/tomcat/webapps/chatter/
#ADD webapps/jenkins.war /usr/local/tomcat/webapps/

ENTRYPOINT ["bash"]
