package actions;

import utils.MyUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Image stats: <p>
 * ImgWidth: 200px <p>
 * ImgHeight:200px <p>
 * <p>
 * ActualWidth: 37px <p>
 * ActualHeight: 52px <p>
 * <p>
 * WidthToRemoveFromLeft: 76px <p>
 * WidthToRemoveFromRight: 87px <p>
 * HeightToRemoveFromBottom: 78px <p>
 * HeightToRemoveFromTop: 70px <p>
 */
class CharacterImagesFromResources {
    public static ArrayList<BufferedImage> getPlayerImg(PlayerAction playerAction, boolean facingRight) {
        if (facingRight) {
            if (playerAction == PlayerAction.Idle)
                return PlayerImgIdle();
            else if (playerAction == PlayerAction.Run)
                return PlayerImgRun();
            else if (playerAction == PlayerAction.Jump)
                return PlayerImgJump();
            else if (playerAction == PlayerAction.Fall)
                return PlayerImgFall();
            else if (playerAction == PlayerAction.Attack1)
                return PlayerImgAttack1();
            else if (playerAction == PlayerAction.Attack2)
                return PlayerImgAttack2();
            else if (playerAction == PlayerAction.TakeHit)
                return PlayerImgTakeHit();
            else if (playerAction == PlayerAction.Death)
                return PlayerImgDeath();
            else
                return PlayerImgIdle();
        } else {
            if (playerAction == PlayerAction.Idle)
                return MirrorImages(PlayerImgIdle());
            else if (playerAction == PlayerAction.Run)
                return MirrorImages(PlayerImgRun());
            else if (playerAction == PlayerAction.Jump)
                return MirrorImages(PlayerImgJump());
            else if (playerAction == PlayerAction.Fall)
                return MirrorImages(PlayerImgFall());
            else if (playerAction == PlayerAction.Attack1)
                return MirrorImages(PlayerImgAttack1());
            else if (playerAction == PlayerAction.Attack2)
                return MirrorImages(PlayerImgAttack2());
            else if (playerAction == PlayerAction.TakeHit)
                return MirrorImages(PlayerImgTakeHit());
            else if (playerAction == PlayerAction.Death)
                return MirrorImages(PlayerImgDeath());
            else
                return MirrorImages(PlayerImgIdle());
        }
    }

    public static ArrayList<BufferedImage> getEnemyImg(PlayerAction playerAction, boolean facingRight) {
        //System.out.println("isFacingRight()" + facingRight);
        if (facingRight) {
            if (playerAction == PlayerAction.Idle)
                return EnemyImgIdle();
            else if (playerAction == PlayerAction.Attack1)
                return EnemyImgAttack1();
            else if (playerAction == PlayerAction.TakeHit)
                return EnemyImgTakeHit();
            else if (playerAction == PlayerAction.Death)
                return EnemyImgDeath();
            else
                return EnemyImgIdle();
        } else {
            if (playerAction == PlayerAction.Idle)
                return MirrorImages(EnemyImgIdle());
            else if (playerAction == PlayerAction.Attack1)
                return MirrorImages(EnemyImgAttack1());
            else if (playerAction == PlayerAction.TakeHit)
                return MirrorImages(EnemyImgTakeHit());
            else if (playerAction == PlayerAction.Death)
                return MirrorImages(EnemyImgDeath());
            else
                return MirrorImages(EnemyImgIdle());
        }
    }

    /**
     * Player
     */
    private static ArrayList<BufferedImage> PlayerImgIdle() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_4.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_5.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_6.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_7.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Idle/Idle_8.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> PlayerImgRun() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_4.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_5.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_6.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_7.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Run/Run_8.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> PlayerImgAttack1() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack1/Attack1_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack1/Attack1_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack1/Attack1_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack1/Attack1_4.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack1/Attack1_5.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack1/Attack1_6.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> PlayerImgAttack2() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack2/Attack2_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack2/Attack2_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack2/Attack2_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack2/Attack2_4.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack2/Attack2_5.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Attack2/Attack2_6.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> PlayerImgJump() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Jump/Jump_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Jump/Jump_2.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> PlayerImgFall() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Fall/Fall_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Fall/Fall_2.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> PlayerImgDeath() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Death/Death_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Death/Death_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Death/Death_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Death/Death_4.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Death/Death_5.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/Death/Death_6.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> PlayerImgTakeHit() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/TakeHit/TakeHit_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/TakeHit/TakeHit_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/TakeHit/TakeHit_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Spirit/TakeHit/TakeHit_4.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    /**
     * Enemy
     */
    private static ArrayList<BufferedImage> EnemyImgIdle() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Idle/Idle_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Idle/Idle_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Idle/Idle_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Idle/Idle_4.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> EnemyImgAttack1() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Attack1/Attack1_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Attack1/Attack1_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Attack1/Attack1_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Attack1/Attack1_4.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Attack1/Attack1_5.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Attack1/Attack1_6.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> EnemyImgTakeHit() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/TakeHit/TakeHit_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/TakeHit/TakeHit_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/TakeHit/TakeHit_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/TakeHit/TakeHit_4.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    private static ArrayList<BufferedImage> EnemyImgDeath() {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        try {
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Death/Death_1.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Death/Death_2.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Death/Death_3.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Death/Death_4.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Death/Death_5.png")));
            imageList.add(ImageIO.read(new File("src/main/resources/Undead/Death/Death_6.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageList;
    }

    /**
     * Mirror
     */
    private static ArrayList<BufferedImage> MirrorImages(ArrayList<BufferedImage> images) {
        ArrayList<BufferedImage> imageList = new ArrayList<>();
        for (BufferedImage image : images) {
            imageList.add(MyUtils.mirrorImage(image));
        }
        return imageList;
    }
}