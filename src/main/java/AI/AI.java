package AI;

import actions.ActionType;
import characters.CharacterInt;
import events.Events;
import windows.game.Game;
import windows.game.GameObject.GameObject;
import windows.game.GameObject.ID;
import windows.game.KeyInput;
import windows.game.KeyPressed;

import java.awt.*;

public abstract class AI extends GameObject implements AIInterface {
    protected CharacterInt ai;
    protected CharacterInt player;
    private boolean escaping = false;

    public AI() {
        super(0, 0, ID.AI);
    }

    @Override
    public void render(Graphics g) {
        // DO NOTHING
    }

    protected boolean isEscaping() {
        return escaping;
    }

    protected void setEscaping(boolean escaping) {
        this.escaping = escaping;
    }

    protected boolean canAIMove() {
        return (ai.getAnimatePlayer().getAction().getBestActionType() != ActionType.TakeHit &&
                ai.getAnimatePlayer().getAction().getBestActionType() != ActionType.TakeHitC &&
                ai.getAnimatePlayer().getAction().getBestActionType() != ActionType.Death &&
                KeyInput.canMove());
    }

    protected int getAIMiddle() {
        return ai.getSkin().getMiddleX(ai.getX());
    }

    protected int getPlayerMiddle() {
        return player.getSkin().getMiddleX(player.getX());
    }

    protected void facePlayer() {
        KeyPressed.changeFacing(ai.getAnimatePlayer(), getAIMiddle() <= getPlayerMiddle());
    }

    protected void followPlayer() {
        if (Events.isXInAttackRange(ai, player)) {
            facePlayer();
            attack();
        } else {
            if (getAIMiddle() > getPlayerMiddle()) {
                KeyPressed.pressedA(ai.getAnimatePlayer(), ai);
            } else if (getAIMiddle() < getPlayerMiddle()) {
                KeyPressed.pressedD(ai.getAnimatePlayer(), ai);
            }
        }
    }

    protected void escapePlayer() {
        if (Events.isXInAttackRange(player, ai)) {
            followPlayer();
        } else {
            if (isOnBorder()) {
                stopOnBorder();
            } else {
                if (getAIMiddle() < getPlayerMiddle()) {
                    KeyPressed.pressedA(ai.getAnimatePlayer(), ai);
                } else if (getAIMiddle() > getPlayerMiddle()) {
                    KeyPressed.pressedD(ai.getAnimatePlayer(), ai);
                }
            }
        }
    }

    private boolean isOnBorder() {
        return (isOnLeftBorder() || isOnRightBorder());
    }

    private boolean isOnRightBorder() {
        return ai.getSkin().getActualImgWH().getXPlusWidth(ai.getX()) >= Game.WIDTH_WINDOW;
    }

    private boolean isOnLeftBorder() {
        return ai.getSkin().getActualImgWH().getX(ai.getX()) <= 0;
    }

    private void stopOnBorder() {
        // TODO: timer - goes on border for 3 seconds, then follows player again
        justFacePlayer();
//        goToCenter();
    }

    private void justFacePlayer() {
        facePlayer();
//        System.out.println("Yes");
        KeyPressed.releasedA(ai.getAnimatePlayer(), ai);
        KeyPressed.releasedD(ai.getAnimatePlayer(), ai);
    }

    private void goToCenter() {
        if (isOnRightBorder()) {
            KeyPressed.pressedA(ai.getAnimatePlayer(), ai);
        } else if (isOnLeftBorder()) {
            KeyPressed.pressedD(ai.getAnimatePlayer(), ai);
        }
    }
}
