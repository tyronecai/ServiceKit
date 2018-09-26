mvn assembly:assembly

java -cp target/ServiceKit-1.0.0-jar-with-dependencies.jar: com.pyknic/servicekit/ExampleServer

curl -v 192.168.1.21:1234/hi


