FROM tomcat:8.0
MAINTAINER pthirunavukkarasu@pacific.edu

RUN apt-get update && apt-get install -yq apt-utils
RUN apt-get install -y git && apt-get install -y vim && apt-get clean

ADD conf/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml

#replace "chatter" with webapp name
ADD webapps/chatter/WEB-INF /usr/local/tomcat/webapps/chatter/WEB-INF
Add webapps/chatter/WEB-INF/classes/*.class /usr/local/tomcat/webapps/chatter/WEB-INF/classes/
ADD webapps/chatter/*.jsp /usr/local/tomcat/webapps/chatter/

ENTRYPOINT ["bash"]
