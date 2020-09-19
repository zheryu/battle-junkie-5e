package io.dungeonfriends.battlejunkie;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class LoadAssetsScene extends Scene {
    public LoadAssetsScene(Parent root) {
        super(root);
    }

    public LoadAssetsScene(Parent root, double width, double height) {
        super(root, width, height);
    }

    public LoadAssetsScene(Parent root, Paint fill) {
        super(root, fill);
    }

    public LoadAssetsScene(Parent root, double width, double height, Paint fill) {
        super(root, width, height, fill);
    }

    public LoadAssetsScene(Parent root, double width, double height, boolean depthBuffer) {
        super(root, width, height, depthBuffer);
    }

    public LoadAssetsScene(Parent root, double width, double height, boolean depthBuffer, SceneAntialiasing antiAliasing) {
        super(root, width, height, depthBuffer, antiAliasing);
    }
}
