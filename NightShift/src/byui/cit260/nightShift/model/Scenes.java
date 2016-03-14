/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

/**
 *
 * @author Silver
 */
public static Scenes[] createScenes() {
    Game game = nightShift.getCurrentGame();

Scene[] scenes = new Scene[SceneType.value().length];

Scene startingSence = new Scene();
startingScene.setDescription(
            "\nYou are walking to a new area, whenyou see him,"
           + "quickly run as");
startingScene.setMapSymbol("ST");
startingScene.setBlocked(false);
startingScene.setTravelTime(240);
scene[SceneType.start.ordinal()] = startingScene;

Scene finishScene = new Scene();
finishScene.setDescription(
                "\nAmazing! Time to take a nap");
finishScene.setMapSymbol("FN");
finishScene.setBlocked(false);
finishScene.setTravelTime(Double.POSITIVE_INFINITY);
scenes[SceneType.finish.ordinal()] = finishScene;

public enum SceneType {
start,
roof,
basement,
}
}
