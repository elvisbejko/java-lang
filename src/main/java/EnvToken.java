import io.github.cdimascio.dotenv.Dotenv;

public class EnvToken {
  public static void main(String[] args) {
    Dotenv dotenv = Dotenv.load();
    String tiToken = dotenv.get("ti_token");
    System.out.println("ti_token: " + tiToken);
  }
}
