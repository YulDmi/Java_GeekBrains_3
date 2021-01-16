package lesson6;

public class SmokeDetector extends Detector {
private String tool;
    private User user;

    public User getUser() {
        return user;

    }

       public String getTool() {
        return tool;
    }



    public SmokeDetector(User user, String tool) {
      this.tool =tool;
        this.user = user;
        attach(user);
    }


}
