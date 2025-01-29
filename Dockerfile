# Pull the Parent Image 
FROM ubuntu:latest 
# Set the WorkDir
WORKDIR /Oracle 
# Updated the Operating System
RUN apt-get update -y 
# Install Apache2 WebServer 
RUN apt-get install apache2 -y 
# Copy the whole code from local repo to Inside the webserver 
COPY . /var/www/html
#Expose the applicaton on the port 8084 
EXPOSE 85
# We have to Start Apache Server 
ENTRYPOINT apachectl -D FOREGROUND



