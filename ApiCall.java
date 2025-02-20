/* The public class ApiCall should be defined in a similarly named
 * ApiCall.java
 */

import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.*;

public class ApiCall {

  public static void main(String[] args) {

    try {
      // Create a client instance
      HttpClient client = HttpClient.newHttpClient();

      // Create a request instance
      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
              .GET() // or .POST() for POST requests
              .build();

      // Send request and get response
      HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

      // Print the response code and body
      System.out.println("Response Code: " + response.statusCode());
      System.out.println("Response: " + response.body());

    } catch (Exception e) {

      e.printStackTrace();
    }
  }
}
