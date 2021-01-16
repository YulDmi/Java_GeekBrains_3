package lesson6;

public class MotionDetector extends Detector {
    private String tool;

    public MotionDetector(String tool) {
        this.tool =tool;

    }


    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }


}
