# REST-API-CLIENT

*COMPANY* : CODTECH IT SOLUTIONS

*NAME* : SAI REETHIKA

*INTERN ID* : CT04DF163

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTOSH

#DESCRIPTION

A **REST API Client project in Java using Visual Studio Code (VS Code)** is an essential and practical way to understand how modern applications communicate with web services over the internet. REST (Representational State Transfer) is an architectural style used for designing networked applications. It relies on standard HTTP methods like **GET**, **POST**, **PUT**, and **DELETE** to perform operations on resources, which are typically represented in **JSON (JavaScript Object Notation)** format.

In this project, a client-side Java application is developed to consume data from a RESTful API. The client sends HTTP requests to a server and handles the JSON responses it receives. JSON is used because of its simplicity, readability, and ease of integration with various programming languages, including Java.

The project begins by setting up the development environment using **Visual Studio Code**, a lightweight and powerful code editor. With the help of the **Java Extension Pack** in VS Code, developers can write, debug, and run Java programs easily. The project structure typically includes Java source files, configuration files (like `pom.xml` if using Maven), and libraries needed for HTTP requests and JSON processing.

To send HTTP requests in Java, several libraries can be used. The most common approach in recent versions of Java (Java 11 and above) is using the built-in **`HttpClient`** class from the `java.net.http` package. This class allows sending synchronous or asynchronous HTTP requests and reading responses. Alternatively, third-party libraries like **OkHttp**, **Unirest**, or **Retrofit** offer more advanced features and easier integration, especially in complex applications.

Once the client sends a request to the API, it receives a response, typically in JSON format. To handle and parse JSON data in Java, libraries such as **Gson (by Google)** or **Jackson** are widely used. These libraries allow developers to convert JSON strings into Java objects (deserialization) and Java objects back into JSON (serialization). For example, when making a GET request to an API endpoint that returns user data, the JSON response can be mapped to a Java class `User`, making it easy to access and manipulate the data programmatically.


1. **Define the API endpoint** – This is the URL where the API is hosted.
2. **Create an HTTP request** – Use `HttpClient` or a third-party library to form a request (GET, POST, etc.).
3. **Send the request and receive a response** – The server processes the request and returns a JSON response.
4. **Parse the JSON** – Use Gson or Jackson to convert JSON to Java objects.
5. **Display or use the data** – The parsed data can now be used within the application.

The project helps students and developers understand real-world API interaction scenarios. It teaches how to manage errors such as failed requests, bad responses, or network timeouts. Additionally, it emphasizes the importance of headers (like Content-Type and Authorization), request parameters, and HTTP status codes for successful API communication.

This building a REST API Client project in Java using VS Code and JSON provides a hands-on experience of web integration. It is an important step toward understanding client-server architecture, data interchange formats, and the backend systems that power today’s web and mobile applications. This project not only enhances technical skills but also builds a strong foundation for full-stack development and API-based services.

#OUTPUT

