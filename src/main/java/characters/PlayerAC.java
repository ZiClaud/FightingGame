package characters;

import actions.AnimatePlayer;
import utils.Events;
import window.game.GameObject.ID;
import window.game.GameObject.MovingGameObject;

import java.awt.*;

public class PlayerAC extends MovingGameObject implements CharacterInt {
    private final String username;
    private final PlayerImage playerImage;
    private final PlayerSizeInt size;
    private final AnimatePlayer animatePlayer;
    private int hp;

    public PlayerAC(int x, int y, ID id, int playerWidth, int playerHeight, int hp, String username) {
        super(x, y, id);     // TODO: x - size.removeWidth, y - size.removeHeight;
        this.hp = hp;
        this.username = username;

        this.size = new PlayerSize(playerWidth, playerHeight);
        this.playerImage = new PlayerImage();

        this.animatePlayer = new AnimatePlayer(this);

        animatePlayer.animatePlayer();
    }

    public PlayerImage getPlayerImage() {
        return playerImage;
    }

    public AnimatePlayer getAnimatePlayer() {
        return animatePlayer;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        getAnimatePlayer().getAction().act();

        Events.checkWall(this);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(playerImage.getImg(), x, y, null);
    }

    public PlayerSizeInt getSize() {
        return size;
    }
}

    /*
//    WAS IN RENDER
     if (id == ID.Player) {
         g.drawImage(playerImage.getImg(), x, y, null);
     } else if (id == ID.Enemy) {
         g.drawImage(playerImage.getImg(), x, y, null);
         // g.setColor(Color.RED);
         // g.fillRect(x, y, size.getImgWidth(), size.getImgHeight());

         // g.fillRect(x, y, size.getActualWidth(), size.getActualHeight());  // TODO: USE TO CHECK -> THERE'S NO BUG
     }
    */