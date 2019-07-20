FROM openjdk:8
COPY ./out/artifacts/dependeciaciclica_jar/dependeciaciclica.jar /usr/src
WORKDIR /usr/src
RUN java -jar dependeciaciclica.jar
CMD ["java", "Application"]