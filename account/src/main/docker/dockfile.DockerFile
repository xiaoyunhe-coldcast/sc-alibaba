FROM java:8
WORKDIR /ROOT
ADD /ROOT/account-1.jar /ROOT/
ENTRYPOINT ["java", "-jar", "account-1.jar"]