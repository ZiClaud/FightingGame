package events;

import windows.game.GameObject.GameObject;
import windows.game.GameObject.ID;
import windows.game.MyHandler;

import java.awt.*;

public class EventClass extends GameObject {
    private final MyHandler handler;

    public EventClass(MyHandler handler) {
        super(0, 0, ID.Event);
        this.handler = handler;
    }

    @Override
    public void tick() {
        Events.ticketeTickete(handler);
    }

    @Override
    public void render(Graphics g) {
    }
}
