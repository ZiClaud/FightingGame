package characters;

import window.game.GameObject.ID;

public class Player extends PlayerAC {
    public Player(int x, int y, ID id, int playerWidth, int playerHeight, int hp, String username) {
        super(x, y, id, playerWidth, playerHeight, hp, username);
    }
}
