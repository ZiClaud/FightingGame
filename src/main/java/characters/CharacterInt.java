package characters;

import actions.Action;
import actions.AnimatePlayer;
import window.GameObject.MovingGameObjectInt;

public interface CharacterInt extends MovingGameObjectInt {
    PlayerImage getPlayerImage();

    int getHp();

    void setHp(int hp);

    String getUsername();

    PlayerSizeInt getSize();

    Action getAction();

    AnimatePlayer getAnimatePlayer();
}