/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import nightshift.NightShift;

/**
 *
 * @author Silver
 */
public enum SceneType {
start,
roof,
basement,
decraze,
finish;

public static Scenes[] createScenes() {
    Game game = NightShift.getCurrentGame();

Scenes[] scenes = new Scenes[SceneType.values().length];

Scenes startingScene = new Scenes();
startingScene.setDescription(
            "\nYou are walking to a new area, when you see him,"
           + "quickly run as");
startingScene.setMapSymbol("ST");
startingScene.setBlocked(false);
startingScene.setTravelTime(240);
scenes[SceneType.start.ordinal()] = startingScene;

Scenes finishScene = new Scenes();
finishScene.setDescription(
                "\nAmazing! Time to take a nap");
finishScene.setMapSymbol("FN");
finishScene.setBlocked(false);
finishScene.setTravelTime(Double.POSITIVE_INFINITY);
scenes[SceneType.finish.ordinal()] = finishScene;

return null;
}
}
