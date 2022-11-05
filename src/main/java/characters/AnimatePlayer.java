package characters;

import window.MyHandler;

import javax.swing.*;

public class AnimatePlayer {
    Player player;
    MyHandler handler;
    int i = 0;

    public AnimatePlayer(Player player) {
        this.player = player;
    }

    public void animatePlayer() {
        if (player.getPlayerImage().getPlayerAnimationType() == PlayerAnimationType.Idle || player.getPlayerImage().getPlayerAnimationType() == PlayerAnimationType.Run || player.getPlayerImage().getPlayerAnimationType() == PlayerAnimationType.RunLeft || player.getPlayerImage().getPlayerAnimationType() == PlayerAnimationType.Jump || player.getPlayerImage().getPlayerAnimationType() == PlayerAnimationType.Fall) {
            System.out.println("loop animation ActionCommand");
            loopAnimation();
        } else {
            System.out.println("ActionCommand");
            actionAnimation();
        }
    }

    private void loopAnimation() {
        Timer timer = new Timer(200, e -> {
            if (i >= ImagePlayer.getPlayerImg(player.getPlayerImage().getPlayerAnimationType()).size()) {
                System.out.println("Loop Animation: " + i);
                i = 0;
            }
            player.getPlayerImage().setImg(ImagePlayer.getPlayerImg(player.getPlayerImage().getPlayerAnimationType()).get(i));
            i++;
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.start();
    }

    private void actionAnimation() {
        i = 0;
        Timer timer = new Timer(200, e -> {
            if (i >= ImagePlayer.getPlayerImg(player.getPlayerImage().getPlayerAnimationType()).size()) {
                System.out.println("Animation: " + i);
                i = 0;
            }
            player.getPlayerImage().setImg(ImagePlayer.getPlayerImg(player.getPlayerImage().getPlayerAnimationType()).get(i));
            i++;
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.start();
    }
}
