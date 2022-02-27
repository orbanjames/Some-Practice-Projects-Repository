FROM openjdk:8-alpine

COPY target/uberjar/my-project-mandelbrot.jar /my-project-mandelbrot/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/my-project-mandelbrot/app.jar"]
