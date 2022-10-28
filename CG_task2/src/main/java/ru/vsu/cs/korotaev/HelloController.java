package ru.vsu.cs.korotaev;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.PixelWriter;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.robot.Robot;
import javafx.scene.shape.*;

public class HelloController {
    @FXML
    private Button addButton;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private SplitPane splitPane;

    @FXML
    private AnchorPane leftPanel;

    @FXML
    private AnchorPane rightPanel;

    @FXML
    private ProgressBar checkPanel;

    public boolean condition = false;
    public boolean existCircle = false;
    public MyCircle mcircle = new MyCircle();
    public MyLine line1 = new MyLine();
    public MyLine line2 = new MyLine();
    public Robot robot = new Robot();

    @FXML
    public Slider slider;

    @FXML
    public Slider slider2;

    @FXML
    private ColorPicker circleColor;

    @FXML
    private ColorPicker borderColor;

    @FXML
    private Canvas canvas;

    @FXML
    private Button interpolButton;

    @FXML
    private ColorPicker firstColor;

    @FXML
    private ColorPicker secondColor;

    @FXML
    Label t1 = new Label();

    @FXML
    Label t2 = new Label();

    @FXML
    Label t3 = new Label();

    @FXML
    Label t4 = new Label();

    @FXML
    Label t5 = new Label();

    @FXML
    Label t6 = new Label();

    public void clickAddButton() {
        GraphicsContext g = canvas.getGraphicsContext2D();
        canvas.setWidth(leftPanel.getWidth());
        canvas.setHeight(leftPanel.getHeight());
        if (!condition) {
            condition = true;
            checkPanel.setProgress(100);
            checkPanel.setStyle("-fx-accent: green;\n" + "-fx-control-inner-background: green;");
            rightPanel.getChildren().clear();
            canvas.setHeight(leftPanel.getHeight());
            canvas.setWidth(leftPanel.getWidth());
            g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            canvas.setVisible(false);
            rightPanel.setVisible(true);
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            t4.setVisible(true);
            circleColor.setVisible(true);
            borderColor.setVisible(true);
            slider.setVisible(true);
            slider2.setVisible(true);
            t5.setVisible(true);
            t6.setVisible(true);
            firstColor.setVisible(true);
            secondColor.setVisible(true);
            interpolButton.setVisible(true);
        } else {
            condition = false;
            checkPanel.setProgress(0);
            checkPanel.setStyle("-fx-accent: red;\n" + "-fx-control-inner-background: red;");
            rightPanel.getChildren().clear();
            existCircle = false;
            g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            canvas.setVisible(false);
            rightPanel.setVisible(true);
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            t4.setVisible(true);
            circleColor.setVisible(true);
            borderColor.setVisible(true);
            slider.setVisible(true);
            slider2.setVisible(true);
            t5.setVisible(true);
            t6.setVisible(true);
            firstColor.setVisible(true);
            secondColor.setVisible(true);
            interpolButton.setVisible(true);
        }
    }

    public void getStartCoords() {
        if (condition) {
            mcircle.setCentralY(robot.getMouseY());
            mcircle.setCentralX(robot.getMouseX() - leftPanel.getWidth());
        }
    }

    public void drawingCircle() {
        if (condition) {
            mcircle.setCurY(robot.getMouseY());
            mcircle.setCurX(robot.getMouseX() - leftPanel.getWidth());
            rightPanel.getChildren().clear();
            mcircle.setRadius(mcircle.getrad());
            mcircle.setFill(circleColor.getValue());
            mcircle.setStroke(borderColor.getValue());
            rightPanel.getChildren().add(mcircle);

        }
    }

    public void drawingEnd() {
        if (condition) {
            condition = false;
            checkPanel.setProgress(0);
            checkPanel.setStyle("-fx-accent: red;\n" + "-fx-control-inner-background: red;");
            existCircle = true;
            line1 = new MyLine(mcircle.getCenterX(), mcircle.getCenterY(), mcircle.getCenterX() + mcircle.getRadius(), mcircle.getCenterY());
            line1.setStroke(borderColor.getValue());
            line2 = new MyLine(mcircle.getCenterX(), mcircle.getCenterY(), mcircle.getCenterX() - mcircle.getRadius(), mcircle.getCenterY());
            line2.setStroke(borderColor.getValue());
            rightPanel.getChildren().add(line1);
            rightPanel.getChildren().add(line2);
            slider.setValue(0);
            slider2.setValue(50);
            clickAddButton2();
            clickAddButton3();
            t1.setVisible(false);
            t2.setVisible(false);
            t3.setVisible(false);
            t4.setVisible(false);
            circleColor.setVisible(false);
            borderColor.setVisible(false);
        }
    }

    public void clickAddButton2() {
        double s = slider.getValue() * 3.6;
        double sin;
        double cos;
        if (s >= 0 && s <= 90) {
            sin = Math.sin(Math.toRadians(s));
            cos = Math.sqrt(1 - sin * sin);
            line1.setEndX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setClickX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setEndY(-mcircle.getRadius() * sin + mcircle.getCentralY());
            line1.setClickY(-mcircle.getRadius() * sin + mcircle.getCentralY());
        } else if (s > 90 && s <= 180) {
            sin = Math.sin(Math.toRadians(s));
            cos = -Math.sqrt(1 - sin * sin);
            line1.setEndX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setClickX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setEndY(-mcircle.getRadius() * sin + mcircle.getCentralY());
            line1.setClickY(-mcircle.getRadius() * sin + mcircle.getCentralY());
        } else if (s > 180 && s <= 270) {
            sin = Math.sin(Math.toRadians(s));
            cos = -Math.sqrt(1 - sin * sin);
            line1.setEndX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setClickX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setEndY(-mcircle.getRadius() * sin + mcircle.getCentralY());
            line1.setClickY(-mcircle.getRadius() * sin + mcircle.getCentralY());
        } else {
            sin = Math.sin(Math.toRadians(s));
            cos = Math.sqrt(1 - sin * sin);
            line1.setEndX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setClickX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line1.setEndY(-mcircle.getRadius() * sin + mcircle.getCentralY());
            line1.setClickY(-mcircle.getRadius() * sin + mcircle.getCentralY());
        }
        line1.setSin(sin);
        line1.setCos(cos);
    }

    public void clickAddButton3() {
        double s = slider2.getValue() * 3.6;
        double sin;
        double cos;
        if ((s >= 0 && s <= 90) || (s > 270 && s <= 360)) {
            sin = Math.sin(Math.toRadians(s));
            cos = Math.sqrt(1 - sin * sin);
            line2.setEndX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line2.setClickX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line2.setEndY(-mcircle.getRadius() * sin + mcircle.getCentralY());
            line2.setClickY(-mcircle.getRadius() * sin + mcircle.getCentralY());
        } else {
            sin = Math.sin(Math.toRadians(s));
            cos = -Math.sqrt(1 - sin * sin);
            line2.setEndX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line2.setClickX(mcircle.getRadius() * cos + mcircle.getCentralX());
            line2.setEndY(-mcircle.getRadius() * sin + mcircle.getCentralY());
            line2.setClickY(-mcircle.getRadius() * sin + mcircle.getCentralY());
        }
        line2.setSin(sin);
        line2.setCos(cos);
        System.out.println(sin + "  " + cos);
    }

    public int[] connect(double grad1, double grad2, double koef1, double koef2) {
        int[] ret = new int[2];
        if (grad1 >= 0 && grad1 <= 90) {

            if (grad2 >= 0 && grad2 <= 90) {
                ret[0] = koef1 > koef2 ? 1 : 0;
                ret[1] = koef1 > koef2 ? 0 : 1;
                return ret;
            } else if (grad2 >= 90 && grad2 <= 180) {
                ret[0] = 1;
                ret[1] = 1;
            } else if (grad2 >= 180 && grad2 <= 270) {
                if (grad2 - 180 > grad1) {
                    ret[0] = 0;
                    ret[1] = 0;
                } else {
                    ret[0] = 1;
                    ret[1] = 1;
                }
            } else if (grad2 >= 270 && grad2 <= 360) {
                ret[0] = 0;
                ret[1] = 1;
            }

        } else if (grad1 >= 90 && grad1 <= 180) {

            if (grad2 >= 0 && grad2 <= 90) {
                ret[0] = 1;
                ret[1] = 1;
                return ret;
            } else if (grad2 >= 90 && grad2 <= 180) {
                ret[0] = koef1 < koef2 ? 1 : 0;
                ret[1] = koef1 < koef2 ? 0 : 1;
            } else if (grad2 >= 180 && grad2 <= 270) {
                ret[0] = 0;
                ret[1] = 1;
            } else if (grad2 >= 270 && grad2 <= 360) {
                if (grad2 - 270 > grad1-90) {
                    ret[0] = 1;
                    ret[1] = 1;
                } else {
                    ret[0] = 0;
                    ret[1] = 0;
                }
            }

        } else if (grad1 >= 180 && grad1 <= 270) {

            if (grad2 >= 0 && grad2 <= 90) {
                if (grad1 - 180 > grad2) {
                    ret[0] = 0;
                    ret[1] = 0;
                } else {
                    ret[0] = 1;
                    ret[1] = 1;
                }
                return ret;
            } else if (grad2 >= 90 && grad2 <= 180) {
                ret[0] = 1;
                ret[1] = 0;
            } else if (grad2 >= 180 && grad2 <= 270) {
                ret[0] = koef1 < koef2 ? 1 : 0;
                ret[1] = koef1 < koef2 ? 0 : 1;
            } else if (grad2 >= 270 && grad2 <= 360) {
                ret[0] = 0;
                ret[1] = 0;
            }

        } else if (grad1 >= 270 && grad1 <= 360) {

            if (grad2 >= 0 && grad2 <= 90) {
                ret[0] = 1;
                ret[1] = 0;
                return ret;
            } else if (grad2 >= 90 && grad2 <= 180) {
                if (grad1 - 270 > grad2-90) {
                    ret[0] = 1;
                    ret[1] = 1;
                } else {
                    ret[0] = 0;
                    ret[1] = 0;
                }
                return ret;
            } else if (grad2 >= 180 && grad2 <= 270) {
                ret[0] = 0;
                ret[1] = 0;
            } else if (grad2 >= 270 && grad2 <= 360) {
                ret[0] = koef1 > koef2 ? 1 : 0;
                ret[1] = koef1 > koef2 ? 0 : 1;
            }
        }
        return ret;
    }

    public void interpolateCircle() {
        PixelWriter pixelWriter = canvas.getGraphicsContext2D().getPixelWriter();
        double s1 = slider.getValue() * 3.6;
        double s2 = slider2.getValue() * 3.6;
        canvas.setVisible(true);
        rightPanel.setVisible(false);
        canvas.setWidth(leftPanel.getWidth());
        canvas.setHeight(leftPanel.getHeight());
        t5.setVisible(false);
        t6.setVisible(false);
        firstColor.setVisible(false);
        secondColor.setVisible(false);
        interpolButton.setVisible(false);
        slider.setVisible(false);
        slider2.setVisible(false);
        int[] res = connect(s1, s2, line1.giveKoef()[0], line2.giveKoef()[0]);
        for (int x = (int) (mcircle.getCentralX() - mcircle.getRadius() - 4); x < mcircle.getCenterX() + mcircle.getRadius() + 4; x++) {
            for (int y = (int) (mcircle.getCentralY() - mcircle.getRadius() - 4); y < mcircle.getCentralY() + mcircle.getRadius() + 4; y++) {
                if (mcircle.insideTheCircle(x, y)) {
                    pixelWriter.setColor(x, y, circleColor.getValue());
                }
                if (mcircle.borderCircle(x, y)) {
                    pixelWriter.setColor(x, y, borderColor.getValue());
                }
                if (res[0] == 1) {
                    if (res[1] == 0) {
                        if (mcircle.insideTheCircle(x, y) && line1.upperLine(x, y) && line2.underLine(x, y)) {
                            pixelWriter.setColor(x, y, mcircle.getInterpolatedColor(x, y, firstColor.getValue(), secondColor.getValue()));
                        }
                    } else if (res[1] == 1) {
                        if (mcircle.insideTheCircle(x, y) && line1.upperLine(x, y) && line2.upperLine(x, y)) {
                            pixelWriter.setColor(x, y, mcircle.getInterpolatedColor(x, y, firstColor.getValue(), secondColor.getValue()));
                        }
                    }
                } else if (res[0] == 0) {
                    if (res[1] == 0) {
                        if (mcircle.insideTheCircle(x, y) && line1.underLine(x, y) && line2.underLine(x, y)) {
                            pixelWriter.setColor(x, y, mcircle.getInterpolatedColor(x, y, firstColor.getValue(), secondColor.getValue()));
                        }
                    } else if (res[1] == 1) {
                        if (mcircle.insideTheCircle(x, y) && line1.underLine(x, y) && line2.upperLine(x, y)) {
                            pixelWriter.setColor(x, y, mcircle.getInterpolatedColor(x, y, firstColor.getValue(), secondColor.getValue()));
                        }
                    }
                }
            }
        }
    }

    }